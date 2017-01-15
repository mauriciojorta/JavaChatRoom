package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;

import Logica.ChatRoom;
import Logica.User;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Simulation {

	private JFrame frame;
	private JTextField textField_users;
	private ChatRoom cr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Simulation window = new Simulation();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Simulation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 294, 240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		cr = new ChatRoom();

		textField_users = new JTextField();
		textField_users.setBounds(81, 109, 86, 20);
		frame.getContentPane().add(textField_users);
		textField_users.setColumns(10);

		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean repeated = false;
				for (int i = 0; i < cr.getUsers().size() && repeated == false; i++) {
					if (cr.getUsers().get(i).getNick().matches(textField_users.getText()))
						repeated = true;

				}
				if (repeated == false) {
					User user = new User(cr, textField_users.getText(), new ChatWindow ());
				} else {
					JOptionPane.showMessageDialog(null, "There is an user with the same nick already in the chat room");
				}

			}
		});
		btnCreate.setBounds(81, 140, 89, 23);
		frame.getContentPane().add(btnCreate);

		JLabel lblNDeUsuarios = new JLabel("User nick");
		lblNDeUsuarios.setBounds(81, 84, 108, 14);
		frame.getContentPane().add(lblNDeUsuarios);

	}
}
