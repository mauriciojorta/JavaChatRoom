package Interfaz;

import javax.swing.JFrame;
import javax.swing.JTextArea;


import javax.swing.JLabel;
import javax.swing.JTextField;


import javax.swing.JScrollPane;
import javax.swing.JButton;


public class ChatWindow implements IChatWindow {
	private JFrame frame;
	private JTextField textField_send;
	private JTextArea textArea;
	private JLabel lblNick;
	private JButton btnSend;


	/**
	 * Create the application.
	 */
	public ChatWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(41, 42, 353, 150);
		frame.getContentPane().add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);

		textArea.setEditable(false);

		lblNick = new JLabel();
		lblNick.setBounds(41, 17, 46, 14);
		frame.getContentPane().add(lblNick);

		textField_send = new JTextField();
		textField_send.setBounds(41, 202, 231, 20);
		frame.getContentPane().add(textField_send);
		textField_send.setColumns(10);

		btnSend = new JButton("Send");
		btnSend.setBounds(300, 201, 89, 23);
		frame.getContentPane().add(btnSend);

	}

	/**
	 * @return the textArea
	 */
	public JTextArea getTextArea() {
		return textArea;
	}

	/**
	 * @param lblNick the lblNick to set
	 */
	public void setLblNick(String lblNick) {
		this.lblNick.setText(lblNick);
	}



	public void setVisible (boolean v)
	{
		frame.setVisible(v);
	}

	/**
	 * @return the btnSend
	 */
	public JButton getBtnSend() {
		return btnSend;
	}

	/**
	 * @return the textField_send
	 */
	public JTextField getTextField_send() {
		return textField_send;
	}


	public JFrame getFrame()
	{
		return frame;
	}



}
