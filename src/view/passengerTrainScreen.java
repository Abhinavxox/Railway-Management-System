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
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import data_structures.arrays;

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
	private JLabel S1;
	private JLabel T1;
	private JLabel H1;
	private JLabel T2;
	private JLabel S2;
	private JLabel H2;
	private JLabel T3;
	private JLabel S3;
	private JLabel H3;
	private JLabel T4;
	private JLabel S4;
	private JLabel H4;
	private JLabel T5;
	private JLabel S5;
	private JLabel H5;

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
	 * @throws IOException 
	 */
	public passengerTrainScreen() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode("#2c3e50"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getH5());
		contentPane.add(getT5());
		contentPane.add(getS5());
		contentPane.add(getS4());
		contentPane.add(getH4());
		contentPane.add(getT4());
		contentPane.add(getT3());
		contentPane.add(getH3());
		contentPane.add(getS3());
		contentPane.add(getS2());
		contentPane.add(getH2());
		contentPane.add(getT2());
		contentPane.add(getS1());
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
		showTrains();
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
	private JLabel getS1() {
		if (S1 == null) {
			S1 = new JLabel("1");
			S1.setHorizontalAlignment(SwingConstants.CENTER);
			S1.setForeground(Color.WHITE);
			S1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			S1.setBounds(43, 264, 104, 58);
		}
		return S1;
	}
	private JLabel getT1() {
		if (T1 == null) {
			T1 = new JLabel("TRAIN1");
			T1.setHorizontalAlignment(SwingConstants.CENTER);
			T1.setForeground(Color.WHITE);
			T1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			T1.setBounds(157, 264, 574, 58);
		}
		return T1;
	}
	private JLabel getH1() {
		if (H1 == null) {
			H1 = new JLabel("T1");
			H1.setHorizontalAlignment(SwingConstants.CENTER);
			H1.setForeground(Color.WHITE);
			H1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			H1.setBounds(741, 264, 118, 58);
		}
		return H1;
	}
	private JLabel getT2() {
		if (T2 == null) {
			T2 = new JLabel("TRAIN2");
			T2.setHorizontalAlignment(SwingConstants.CENTER);
			T2.setForeground(Color.WHITE);
			T2.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			T2.setBounds(157, 343, 574, 58);
		}
		return T2;
	}
	private JLabel getS2() {
		if (S2 == null) {
			S2 = new JLabel("2");
			S2.setHorizontalAlignment(SwingConstants.CENTER);
			S2.setForeground(Color.WHITE);
			S2.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			S2.setBounds(43, 343, 104, 58);
		}
		return S2;
	}
	private JLabel getH2() {
		if (H2 == null) {
			H2 = new JLabel("T2");
			H2.setHorizontalAlignment(SwingConstants.CENTER);
			H2.setForeground(Color.WHITE);
			H2.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			H2.setBounds(741, 343, 118, 58);
		}
		return H2;
	}
	private JLabel getT3() {
		if (T3 == null) {
			T3 = new JLabel("TRAIN3");
			T3.setHorizontalAlignment(SwingConstants.CENTER);
			T3.setForeground(Color.WHITE);
			T3.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			T3.setBounds(157, 428, 574, 58);
		}
		return T3;
	}
	private JLabel getS3() {
		if (S3 == null) {
			S3 = new JLabel("3");
			S3.setHorizontalAlignment(SwingConstants.CENTER);
			S3.setForeground(Color.WHITE);
			S3.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			S3.setBounds(43, 428, 104, 58);
		}
		return S3;
	}
	private JLabel getH3() {
		if (H3 == null) {
			H3 = new JLabel("T3");
			H3.setHorizontalAlignment(SwingConstants.CENTER);
			H3.setForeground(Color.WHITE);
			H3.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			H3.setBounds(741, 428, 118, 58);
		}
		return H3;
	}
	private JLabel getT4() {
		if (T4 == null) {
			T4 = new JLabel("TRAIN4");
			T4.setHorizontalAlignment(SwingConstants.CENTER);
			T4.setForeground(Color.WHITE);
			T4.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			T4.setBounds(157, 507, 574, 58);
		}
		return T4;
	}
	private JLabel getS4() {
		if (S4 == null) {
			S4 = new JLabel("4");
			S4.setHorizontalAlignment(SwingConstants.CENTER);
			S4.setForeground(Color.WHITE);
			S4.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			S4.setBounds(43, 507, 104, 58);
		}
		return S4;
	}
	private JLabel getH4() {
		if (H4 == null) {
			H4 = new JLabel("T4");
			H4.setHorizontalAlignment(SwingConstants.CENTER);
			H4.setForeground(Color.WHITE);
			H4.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			H4.setBounds(741, 507, 118, 58);
		}
		return H4;
	}
	private JLabel getT5() {
		if (T5 == null) {
			T5 = new JLabel("TRAIN5");
			T5.setHorizontalAlignment(SwingConstants.CENTER);
			T5.setForeground(Color.WHITE);
			T5.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			T5.setBounds(157, 586, 574, 58);
		}
		return T5;
	}
	private JLabel getS5() {
		if (S5 == null) {
			S5 = new JLabel("5");
			S5.setHorizontalAlignment(SwingConstants.CENTER);
			S5.setForeground(Color.WHITE);
			S5.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			S5.setBounds(43, 586, 104, 58);
		}
		return S5;
	}
	private JLabel getH5() {
		if (H5 == null) {
			H5 = new JLabel("T5");
			H5.setHorizontalAlignment(SwingConstants.CENTER);
			H5.setForeground(Color.WHITE);
			H5.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			H5.setBounds(741, 586, 118, 58);
		}
		return H5;
	}
	
	private void showTrains() throws IOException {
		ArrayList<String[]> trains = arrays.getTrainScreen();
		
		int length = trains.size();
		if(length<=1) {
			S1.setText("1");
			S2.setText("");
			S3.setText("");
			S4.setText("");
			S5.setText("");
			T1.setText(trains.get(0)[0]);
			H1.setText(trains.get(0)[1]);
			T2.setText("");
			H2.setText("");
			T3.setText("");
			H3.setText("");
			T4.setText("");
			H4.setText("");
			T5.setText("");
			H5.setText("");
		}
		
		else if(length<=2) {
			S1.setText("1");
			S2.setText("2");
			S3.setText("");
			S4.setText("");
			S5.setText("");
			T1.setText(trains.get(0)[0]);
			H1.setText(trains.get(0)[1]);
			T2.setText(trains.get(1)[0]);
			H2.setText(trains.get(1)[1]);
			T3.setText("");
			H3.setText("");
			T4.setText("");
			H4.setText("");
			T5.setText("");
			H5.setText("");
		}
		else if(length<=3) {
			S1.setText("1");
			S2.setText("2");
			S3.setText("3");
			S4.setText("");
			S5.setText("");
			T1.setText(trains.get(0)[0]);
			H1.setText(trains.get(0)[1]);
			T2.setText(trains.get(1)[0]);
			H2.setText(trains.get(1)[1]);
			T3.setText(trains.get(2)[0]);
			H3.setText(trains.get(2)[1]);
			T4.setText("");
			H4.setText("");
			T5.setText("");
			H5.setText("");
		}
		else if(length<=4) {
			S1.setText("1");
			S2.setText("2");
			S3.setText("3");
			S4.setText("4");
			S5.setText("");
			T1.setText(trains.get(0)[0]);
			H1.setText(trains.get(0)[1]);
			T2.setText(trains.get(1)[0]);
			H2.setText(trains.get(1)[1]);
			T3.setText(trains.get(2)[0]);
			H3.setText(trains.get(2)[1]);
			T4.setText(trains.get(3)[0]);
			H4.setText(trains.get(3)[1]);
			T5.setText("");
			H5.setText("");
		}
		else {
			S1.setText("1");
			S2.setText("2");
			S3.setText("3");
			S4.setText("4");
			S5.setText("5");
			T1.setText(trains.get(0)[0]);
			H1.setText(trains.get(0)[1]);
			T2.setText(trains.get(1)[0]);
			H2.setText(trains.get(1)[1]);
			T3.setText(trains.get(2)[0]);
			H3.setText(trains.get(2)[1]);
			T4.setText(trains.get(3)[0]);
			H4.setText(trains.get(3)[1]);
			T5.setText(trains.get(4)[0]);
			H5.setText(trains.get(4)[1]);
		}
		
	}
}
