package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class passengerPortal extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_2_1;
	private JLabel lblTicket;
	private JLabel lblBooking;
	private JLabel lblScreen;
	private JLabel lblTrain;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_3;
	private JLabel ticketBooking;
	private JLabel trainScreen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passengerPortal frame = new passengerPortal();
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
	public passengerPortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode("#2c3e50"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTrainScreen());
		contentPane.add(getTicketBooking());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblTrain());
		contentPane.add(getLblScreen());
		contentPane.add(getLblBooking());
		contentPane.add(getLblTicket());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_2_1());
	}

	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index2.png"));
			lblNewLabel_2.setBounds(43, 117, 387, 499);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_2_1() {
		if (lblNewLabel_2_1 == null) {
			lblNewLabel_2_1 = new JLabel("");
			lblNewLabel_2_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index2.png"));
			lblNewLabel_2_1.setBounds(468, 117, 387, 499);
		}
		return lblNewLabel_2_1;
	}
	private JLabel getLblTicket() {
		if (lblTicket == null) {
			lblTicket = new JLabel("TICKET\r\n");
			lblTicket.setHorizontalAlignment(SwingConstants.CENTER);
			lblTicket.setForeground(Color.BLACK);
			lblTicket.setFont(new Font("Press Start 2P", Font.BOLD, 30));
			lblTicket.setBounds(70, 156, 317, 84);
		}
		return lblTicket;
	}
	private JLabel getLblBooking() {
		if (lblBooking == null) {
			lblBooking = new JLabel("BOOKING");
			lblBooking.setHorizontalAlignment(SwingConstants.CENTER);
			lblBooking.setForeground(Color.BLACK);
			lblBooking.setFont(new Font("Press Start 2P", Font.BOLD, 30));
			lblBooking.setBounds(70, 240, 317, 84);
		}
		return lblBooking;
	}
	private JLabel getLblScreen() {
		if (lblScreen == null) {
			lblScreen = new JLabel("SCREEN");
			lblScreen.setHorizontalAlignment(SwingConstants.CENTER);
			lblScreen.setForeground(Color.BLACK);
			lblScreen.setFont(new Font("Press Start 2P", Font.BOLD, 30));
			lblScreen.setBounds(496, 240, 317, 84);
		}
		return lblScreen;
	}
	private JLabel getLblTrain() {
		if (lblTrain == null) {
			lblTrain = new JLabel("TRAIN");
			lblTrain.setHorizontalAlignment(SwingConstants.CENTER);
			lblTrain.setForeground(Color.BLACK);
			lblTrain.setFont(new Font("Press Start 2P", Font.BOLD, 30));
			lblTrain.setBounds(496, 156, 317, 84);
		}
		return lblTrain;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\pportal1.png"));
			lblNewLabel.setBounds(107, 314, 271, 247);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\pportal2.png"));
			lblNewLabel_1.setBounds(531, 314, 271, 247);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new passengerLoginFrame().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\back.png"));
			lblNewLabel_3.setBounds(815, 0, 73, 84);
		}
		return lblNewLabel_3;
	}
	private JLabel getTicketBooking() {
		if (ticketBooking == null) {
			ticketBooking = new JLabel("");
			ticketBooking.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						new ticketBooking().setVisible(true);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					dispose();
				}
			});
			ticketBooking.setBounds(52, 129, 356, 476);
		}
		return ticketBooking;
	}
	private JLabel getTrainScreen() {
		if (trainScreen == null) {
			trainScreen = new JLabel("");
			trainScreen.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						new passengerTrainScreen().setVisible(true);
						dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			trainScreen.setBounds(479, 129, 356, 476);
		}
		return trainScreen;
	}
}
