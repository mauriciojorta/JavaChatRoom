package Logica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Interfaz.IChatWindow;

/**
 * An user of the chat room
 * @author Mauricio
 *
 */
public class User extends Colleague{
	private String nick;
	private IChatWindow vc;

	public User(Mediator m, String nick, IChatWindow ivc) {
		super(m);
		getMediator().addColleague(this);
		this.nick=nick;
		this.vc= ivc;
		this.vc.setLblNick(nick);
		this.vc.getBtnSend().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				send(vc.getTextField_send().getText());

			}
		});
		///We load all the previously sent messages if other users were connected and already sent messages before the new one
		for (int i=0; i<getMediator().getMessages().size(); i++)
		{
			this.vc.getTextArea().setText(this.vc.getTextArea().getText()+getMediator().getMessages().get(i)+"\n");
		}
		getMediator().send("The user ["+this.nick+"] has logged in");
		Colleague colega = this;
		///If the user closes its window, then it will be removed from the chat room's user list
		this.vc.getFrame().addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
		    	getMediator().send("The user ["+nick+"] has logged off");
		       getMediator().removeColleague(colega);
		    }
		});
		this.vc.setVisible(true);
	}

@Override
	public void send(String message) {

	    getMediator().send("["+nick+"]: "+message);

	  }

	@Override
	public void receive(String message) {
		vc.getTextArea().setText(vc.getTextArea().getText()+message+"\n");


	}

	/**
	 * @param nick the nick to set
	 */
	public void setNick(String nick) {
		this.nick = nick;
	}

	@Override
	public String getNick() {
		return nick;
	}









}
