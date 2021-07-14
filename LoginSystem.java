package a;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginSystem {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-17,4
	 */
	private final JPanel panel = new JPanel();
	private JPanel panel_2;
	private JTextField user;
	private JPasswordField pass;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginSystem window = new LoginSystem();
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
	public LoginSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 653, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(60, 179, 113));
		panel_1.setBounds(10, 10, 619, 378);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		panel_2 = new JPanel();
		panel_2.setBackground(new Color(152, 251, 152));
		panel_2.setBounds(124, 0, 495, 378);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		user = new JTextField();
		user.setBounds(254, 96, 198, 30);
		panel_2.add(user);
		user.setColumns(10);

		pass = new JPasswordField();
		pass.setBounds(254, 180, 198, 30);
		panel_2.add(pass);

		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(33, 100, 99, 26);
		panel_2.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPassword.setBounds(33, 184, 99, 26);
		panel_2.add(lblPassword);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String u = user.getText();
				String p = pass.getText();

				if (u.equals("admin") && p.equals("admin")) {
					JOptionPane.showMessageDialog(null, "Succefully Logged in");
					SecondPage s = new SecondPage();
					s.frame.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(null, "Invalied Username or Password");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(44, 282, 118, 34);
		panel_2.add(btnNewButton);

		lblNewLabel_1 = new JLabel("Login System");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(134, 10, 189, 48);
		panel_2.add(lblNewLabel_1);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnExit.setBackground(new Color(0, 128, 0));
		btnExit.setBounds(334, 282, 118, 34);
		panel_2.add(btnExit);
	}
}
