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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class passengerTrainScreen extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_1_1_2;
	private JLabel lblNewLabel_1_1_3;
	private JLabel lblSn;
	private JLabel lblTime;
	private JLabel lblTrain;
	private JLabel lblSn_1;
	private JLabel T1;
	private JLabel H1;
	private JLabel T2;
	private JLabel lblSn_1_1;
	private JLabel H2;
	private JLabel T3;
	private JLabel lblSn_1_2;
	private JLabel H3;
	private JLabel T4;
	private JLabel lblSn_1_3;
	private JLabel H4;
	private JLabel T5;
	private JLabel lblSn_1_4;
	private JLabel HHHHHHHHHHHHHHHHHHHHH5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					passengerTrainScreen frame = new passengerTrainScreen();
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
	public passengerTrainScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode("#2c3e50"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getHHHHHHHHHHHHHHHHHHHHH5());
		contentPane.add(getT5());
		contentPane.add(getLblSn_1_4());
		contentPane.add(getLblSn_1_3());
		contentPane.add(getH4());
		contentPane.add(getT4());
		contentPane.add(getT3());
		contentPane.add(getH3());
		contentPane.add(getLblSn_1_2());
		contentPane.add(getLblSn_1_1());
		contentPane.add(getH2());
		contentPane.add(getT2());
		contentPane.add(getLblSn_1());
		contentPane.add(getT1());
		contentPane.add(getH1());
		contentPane.add(getLblTrain());
		contentPane.add(getLblTime());
		contentPane.add(getLblSn());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1_2());
		contentPane.add(getLblNewLabel_1_1_3());
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new passengerPortal().setVisible(true);
					dispose();
				}
			});
			lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\back.png"));
			lblNewLabel_3.setBounds(815, 0, 73, 84);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 3ldpi.png"));
			lblNewLabel.setBounds(10, 99, 870, 163);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 4ldpi.png"));
			lblNewLabel_1.setBounds(10, 254, 868, 84);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 4ldpi.png"));
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setBounds(10, 333, 868, 84);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("");
			lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 4ldpi.png"));
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setBounds(10, 412, 868, 84);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("");
			lblNewLabel_1_1_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 4ldpi.png"));
			lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_2.setBounds(10, 491, 868, 84);
		}
		return lblNewLabel_1_1_2;
	}
	private JLabel getLblNewLabel_1_1_3() {
		if (lblNewLabel_1_1_3 == null) {
			lblNewLabel_1_1_3 = new JLabel("");
			lblNewLabel_1_1_3.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 4ldpi.png"));
			lblNewLabel_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_3.setBounds(10, 570, 868, 84);
		}
		return lblNewLabel_1_1_3;
	}
	private JLabel getLblSn() {
		if (lblSn == null) {
			lblSn = new JLabel("S.N.");
			lblSn.setHorizontalAlignment(SwingConstants.CENTER);
			lblSn.setForeground(Color.WHITE);
			lblSn.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			lblSn.setBounds(43, 139, 104, 84);
		}
		return lblSn;
	}
	private JLabel getLblTime() {
		if (lblTime == null) {
			lblTime = new JLabel("TIME");
			lblTime.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime.setForeground(Color.WHITE);
			lblTime.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			lblTime.setBounds(741, 139, 118, 84);
		}
		return lblTime;
	}
	private JLabel getLblTrain() {
		if (lblTrain == null) {
			lblTrain = new JLabel("TRAIN");
			lblTrain.setHorizontalAlignment(SwingConstants.CENTER);
			lblTrain.setForeground(Color.WHITE);
			lblTrain.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			lblTrain.setBounds(157, 139, 574, 84);
		}
		return lblTrain;
	}
	private JLabel getLblSn_1() {
		if (lblSn_1 == null) {
			lblSn_1 = new JLabel("1");
			lblSn_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblSn_1.setForeground(Color.WHITE);
			lblSn_1.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			lblSn_1.setBounds(43, 264, 104, 58);
		}
		return lblSn_1;
	}
	private JLabel getT1() {
		if (T1 == null) {
			T1 = new JLabel("TRAIN1");
			T1.setHorizontalAlignment(SwingConstants.CENTER);
			T1.setForeground(Color.WHITE);
			T1.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			T1.setBounds(157, 264, 574, 58);
		}
		return T1;
	}
	private JLabel getH1() {
		if (H1 == null) {
			H1 = new JLabel("T1");
			H1.setHorizontalAlignment(SwingConstants.CENTER);
			H1.setForeground(Color.WHITE);
			H1.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			H1.setBounds(741, 264, 118, 58);
		}
		return H1;
	}
	private JLabel getT2() {
		if (T2 == null) {
			T2 = new JLabel("TRAIN2");
			T2.setHorizontalAlignment(SwingConstants.CENTER);
			T2.setForeground(Color.WHITE);
			T2.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			T2.setBounds(157, 343, 574, 58);
		}
		return T2;
	}
	private JLabel getLblSn_1_1() {
		if (lblSn_1_1 == null) {
			lblSn_1_1 = new JLabel("2");
			lblSn_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblSn_1_1.setForeground(Color.WHITE);
			lblSn_1_1.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			lblSn_1_1.setBounds(43, 343, 104, 58);
		}
		return lblSn_1_1;
	}
	private JLabel getH2() {
		if (H2 == null) {
			H2 = new JLabel("T2");
			H2.setHorizontalAlignment(SwingConstants.CENTER);
			H2.setForeground(Color.WHITE);
			H2.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			H2.setBounds(741, 343, 118, 58);
		}
		return H2;
	}
	private JLabel getT3() {
		if (T3 == null) {
			T3 = new JLabel("TRAIN3");
			T3.setHorizontalAlignment(SwingConstants.CENTER);
			T3.setForeground(Color.WHITE);
			T3.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			T3.setBounds(157, 428, 574, 58);
		}
		return T3;
	}
	private JLabel getLblSn_1_2() {
		if (lblSn_1_2 == null) {
			lblSn_1_2 = new JLabel("3");
			lblSn_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblSn_1_2.setForeground(Color.WHITE);
			lblSn_1_2.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			lblSn_1_2.setBounds(43, 428, 104, 58);
		}
		return lblSn_1_2;
	}
	private JLabel getH3() {
		if (H3 == null) {
			H3 = new JLabel("T3");
			H3.setHorizontalAlignment(SwingConstants.CENTER);
			H3.setForeground(Color.WHITE);
			H3.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			H3.setBounds(741, 428, 118, 58);
		}
		return H3;
	}
	private JLabel getT4() {
		if (T4 == null) {
			T4 = new JLabel("TRAIN4");
			T4.setHorizontalAlignment(SwingConstants.CENTER);
			T4.setForeground(Color.WHITE);
			T4.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			T4.setBounds(157, 507, 574, 58);
		}
		return T4;
	}
	private JLabel getLblSn_1_3() {
		if (lblSn_1_3 == null) {
			lblSn_1_3 = new JLabel("4");
			lblSn_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblSn_1_3.setForeground(Color.WHITE);
			lblSn_1_3.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			lblSn_1_3.setBounds(43, 507, 104, 58);
		}
		return lblSn_1_3;
	}
	private JLabel getH4() {
		if (H4 == null) {
			H4 = new JLabel("T4");
			H4.setHorizontalAlignment(SwingConstants.CENTER);
			H4.setForeground(Color.WHITE);
			H4.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			H4.setBounds(741, 507, 118, 58);
		}
		return H4;
	}
	private JLabel getT5() {
		if (T5 == null) {
			T5 = new JLabel("TRAIN5");
			T5.setHorizontalAlignment(SwingConstants.CENTER);
			T5.setForeground(Color.WHITE);
			T5.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			T5.setBounds(157, 586, 574, 58);
		}
		return T5;
	}
	private JLabel getLblSn_1_4() {
		if (lblSn_1_4 == null) {
			lblSn_1_4 = new JLabel("5");
			lblSn_1_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblSn_1_4.setForeground(Color.WHITE);
			lblSn_1_4.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			lblSn_1_4.setBounds(43, 586, 104, 58);
		}
		return lblSn_1_4;
	}
	private JLabel getHHHHHHHHHHHHHHHHHHHHH5() {
		if (HHHHHHHHHHHHHHHHHHHHH5 == null) {
			HHHHHHHHHHHHHHHHHHHHH5 = new JLabel("T5");
			HHHHHHHHHHHHHHHHHHHHH5.setHorizontalAlignment(SwingConstants.CENTER);
			HHHHHHHHHHHHHHHHHHHHH5.setForeground(Color.WHITE);
			HHHHHHHHHHHHHHHHHHHHH5.setFont(new Font("Press Start 2P", Font.BOLD, 25));
			HHHHHHHHHHHHHHHHHHHHH5.setBounds(741, 586, 118, 58);
		}
		return HHHHHHHHHHHHHHHHHHHHH5;
	}
}
