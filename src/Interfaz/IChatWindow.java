package Interfaz;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public interface IChatWindow {

	/**
	 * @return the textArea
	 */
	public JTextArea getTextArea();

	/**
	 * @param lblNick the lblNick to set
	 */
	public void setLblNick(String lblNick);



	public void setVisible (boolean v);

	/**
	 * @return the btnEnviar
	 */
	public JButton getBtnSend();

	/**
	 * @return the textField_enviar
	 */
	public JTextField getTextField_send();

	public JFrame getFrame();

}
