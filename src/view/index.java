package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class index extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JSeparator separator;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_3_1;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_4_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_5_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					index frame = new index();
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
	public index() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(Color.decode("#2c3e50"));
		contentPane.add(getLblNewLabel_5_1());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_4_1());
		contentPane.add(getLblNewLabel_4());
		contentPane.add(getLblNewLabel_3_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_2());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("RAILWAY MANAGEMENT SYSTEM");
			lblNewLabel.setForeground(Color.WHITE);
			lblNewLabel.setFont(new Font("Press Start 2P", Font.BOLD, 30));
			lblNewLabel.setBounds(47, 11, 784, 84);
		}
		return lblNewLabel;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(35, 83, 802, 2);
		}
		return separator;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index1.png"));
			lblNewLabel_1.setBounds(95, 188, 256, 389);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index2.png"));
			lblNewLabel_2.setBounds(448, 122, 387, 499);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index3.png"));
			lblNewLabel_3.setBounds(522, 300, 237, 77);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel_3_1() {
		if (lblNewLabel_3_1 == null) {
			lblNewLabel_3_1 = new JLabel("");
			lblNewLabel_3_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index3.png"));
			lblNewLabel_3_1.setBounds(522, 524, 237, 77);
		}
		return lblNewLabel_3_1;
	}
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index4.png"));
			lblNewLabel_4.setBounds(571, 163, 128, 152);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_4_1() {
		if (lblNewLabel_4_1 == null) {
			lblNewLabel_4_1 = new JLabel("");
			lblNewLabel_4_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index5.png"));
			lblNewLabel_4_1.setBounds(571, 388, 128, 152);
		}
		return lblNewLabel_4_1;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("PASSENGER");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new passengerLoginFrame().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_5.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblNewLabel_5.setBounds(522, 300, 224, 74);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_5_1() {
		if (lblNewLabel_5_1 == null) {
			lblNewLabel_5_1 = new JLabel("OFFICIAL");
			lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new officialLoginFrame().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblNewLabel_5_1.setBounds(522, 524, 224, 76);
		}
		return lblNewLabel_5_1;
	}
}
