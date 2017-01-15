package Logica;

import java.util.ArrayList;

/**
 * The room to where all the chat app users send their messages
 * @author Mauricio
 *
 */
public class ChatRoom implements Mediator {

	  private ArrayList<Colleague> users;
	  private ArrayList<String>messages;

	  public ChatRoom() {

	    users = new ArrayList<Colleague>();
	   messages = new ArrayList<String>();

	  }

	  /**
	   * It adds an colleague object to the mediator colleague list. In this case the colleagues
	   * are the chat users
	   * @param colleague
	   */
	  public void addColleague(Colleague colleague) {

	    users.add(colleague);

	  }

	  public void send(String message) {

	   messages.add(message);

	      for(Colleague user: users)
	      {
	    		  user.receive(message);
	      }


	    }


	public ArrayList<String> getMessages() {
		return messages;
	}

	/**
	 * @return the users
	 */
	public ArrayList<Colleague> getUsers() {
		return users;
	}

	@Override
	public void removeColleague(Colleague colleague) {
		users.remove(colleague);

	}




	}
