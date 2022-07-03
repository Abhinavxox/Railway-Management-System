package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data_structures.arrays;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.SwingConstants;

public class passengerRegisterFrame extends JFrame {

	private JPanel contentPane;
	private JSeparator separator;
	private JLabel lblLogin;
	private JLabel lblNewLabel_2;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_3;
	private JLabel lblLogin_1;
	private JLabel lblPassword_1;
	private JTextField name_txt;
	private JTextField username_txt;
	private JTextField password_txt;
	private arrays a = new arrays();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passengerRegisterFrame frame = new passengerRegisterFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public passengerRegisterFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#2c3e50"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTextField_2_1());
		contentPane.add(getTextField_1_1());
		contentPane.add(getTextField_3());
		contentPane.add(getLblPassword_1());
		contentPane.add(getLblLogin_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblPassword());
		contentPane.add(getLblUsername());
		contentPane.add(getSeparator());
		contentPane.add(getLblLogin());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel());
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(290, 76, 293, 13);
		}
		return separator;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("REGISTER");
			lblLogin.setForeground(Color.WHITE);
			lblLogin.setFont(new Font("Press Start 2P", Font.BOLD, 30));
			lblLogin.setBounds(315, 11, 249, 84);
		}
		return lblLogin;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index2.png"));
			lblNewLabel_2.setBounds(252, 108, 387, 499);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblUsername() {
		if (lblUsername == null) {
			lblUsername = new JLabel("NAME");
			lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
			lblUsername.setForeground(Color.BLACK);
			lblUsername.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblUsername.setBounds(301, 118, 282, 46);
		}
		return lblUsername;
	}
	private JLabel getLblPassword() {
		if (lblPassword == null) {
			lblPassword = new JLabel("USERNAME");
			lblPassword.setHorizontalAlignment(SwingConstants.CENTER);
			lblPassword.setForeground(Color.BLACK);
			lblPassword.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblPassword.setBounds(301, 231, 282, 46);
		}
		return lblPassword;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new index().setVisible(true);
					dispose();
				}
			});
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\back.png"));
			lblNewLabel.setBounds(805, 11, 73, 84);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index3.png"));
			lblNewLabel_3.setBounds(327, 460, 237, 77);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblLogin_1() {
		if (lblLogin_1 == null) {
			lblLogin_1 = new JLabel("REGISTER");
			lblLogin_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					//validation
					//validation
					String name = name_txt.getText();
					String username = username_txt.getText();
					String password = password_txt.getText();
					if(name.isEmpty()) {
						JOptionPane.showMessageDialog(name_txt, "ENTER YOUR NAME");
						return;
					}
					if(username.isEmpty()) {
						JOptionPane.showMessageDialog(username_txt, "ENTER YOUR USERNAME");
						return;
					}
					if(password.isEmpty()) {
						JOptionPane.showMessageDialog(password_txt, "ENTER YOUR PASSWORD");
						return;
					}
					
					try {
						if(a.setPassengers(name, username, password)) {
							JOptionPane.showMessageDialog(password_txt, "SUCCESSFULLY REGISTERED");
							new passengerLoginFrame().setVisible(true);
							dispose();
							return;
						}
						else {
							JOptionPane.showMessageDialog(username_txt, "USERNAME ALREADY USED");
							return;
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
				}
			});
			lblLogin_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblLogin_1.setForeground(Color.BLACK);
			lblLogin_1.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblLogin_1.setBounds(327, 464, 237, 61);
		}
		return lblLogin_1;
	}
	private JLabel getLblPassword_1() {
		if (lblPassword_1 == null) {
			lblPassword_1 = new JLabel("PASSWORD");
			lblPassword_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblPassword_1.setForeground(Color.BLACK);
			lblPassword_1.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblPassword_1.setBounds(301, 338, 282, 46);
		}
		return lblPassword_1;
	}
	private JTextField getTextField_3() {
		if (name_txt == null) {
			name_txt = new JTextField();
			name_txt.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			name_txt.setColumns(10);
			name_txt.setBounds(301, 164, 282, 57);
		}
		return name_txt;
	}
	private JTextField getTextField_1_1() {
		if (username_txt == null) {
			username_txt = new JTextField();
			username_txt.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			username_txt.setColumns(10);
			username_txt.setBounds(301, 274, 282, 57);
		}
		return username_txt;
	}
	private JTextField getTextField_2_1() {
		if (password_txt == null) {
			password_txt = new JTextField();
			password_txt.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			password_txt.setColumns(10);
			password_txt.setBounds(301, 395, 282, 57);
		}
		return password_txt;
	}
}
