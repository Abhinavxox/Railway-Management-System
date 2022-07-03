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
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JSeparator;

public class officialPortal extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JPanel panel;
	private JTable table;
	private JTextField textField;
	private JLabel lblAddTrain;
	private JTextField textField_1;
	private JLabel lblName;
	private JLabel lblTime;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JPanel panel_1;
	private JTable table_1;
	private JLabel lblLateQueue;
	private JSeparator separator_2;
	private JLabel lblTrainScreen;
	private JLabel lblTime_1;
	private JLabel lblTime_1_1;
	private JLabel lblTime_1_1_1;
	private JSeparator separator_3;
	private JLabel lblNewLabel_2;
	private JLabel lblOfficialPortal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					officialPortal frame = new officialPortal();
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
	public officialPortal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode("#2c3e50"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblOfficialPortal());
		contentPane.add(getSeparator_3());
		contentPane.add(getLblTime_1_1_1());
		contentPane.add(getLblTime_1_1());
		contentPane.add(getLblTime_1());
		contentPane.add(getLblLateQueue());
		contentPane.add(getPanel_1());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getSeparator_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getPanel());
		contentPane.add(getTextField());
		contentPane.add(getLblAddTrain());
		contentPane.add(getTextField_1());
		contentPane.add(getLblName());
		contentPane.add(getLblTime());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator_2());
		contentPane.add(getLblTrainScreen());
		contentPane.add(getLblNewLabel_2());
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
			lblNewLabel_3.setBounds(1403, 10, 73, 84);
		}
		return lblNewLabel_3;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBounds(889, 197, 571, 477);
			panel.setLayout(new BorderLayout(0, 0));
			panel.add(getTable(), BorderLayout.NORTH);
		}
		return panel;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"SN", "Trains", "Time"
				}
			));
		}
		return table;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(31, 264, 211, 45);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblAddTrain() {
		if (lblAddTrain == null) {
			lblAddTrain = new JLabel("ADD TRAIN");
			lblAddTrain.setHorizontalAlignment(SwingConstants.CENTER);
			lblAddTrain.setForeground(Color.BLACK);
			lblAddTrain.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblAddTrain.setBounds(46, 139, 196, 45);
		}
		return lblAddTrain;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(252, 264, 211, 45);
		}
		return textField_1;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("NAME");
			lblName.setHorizontalAlignment(SwingConstants.CENTER);
			lblName.setForeground(Color.BLACK);
			lblName.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblName.setBounds(31, 203, 211, 45);
		}
		return lblName;
	}
	private JLabel getLblTime() {
		if (lblTime == null) {
			lblTime = new JLabel("TIME");
			lblTime.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime.setForeground(Color.BLACK);
			lblTime.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTime.setBounds(253, 203, 210, 45);
		}
		return lblTime;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(31, 191, 233, 8);
		}
		return separator;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\ticketBooking1.png"));
			lblNewLabel.setBounds(20, 99, 858, 605);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 1ldpi.png"));
			lblNewLabel_1.setBounds(647, 225, 211, 84);
		}
		return lblNewLabel_1;
	}
	private JSeparator getSeparator_1() {
		if (separator_1 == null) {
			separator_1 = new JSeparator();
			separator_1.setBounds(31, 320, 830, 8);
		}
		return separator_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 1ldpi.png"));
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setBounds(31, 323, 211, 84);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("");
			lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 1ldpi.png"));
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setBounds(31, 423, 211, 84);
		}
		return lblNewLabel_1_1_1;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBounds(266, 407, 592, 261);
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getTable_1(), BorderLayout.NORTH);
		}
		return panel_1;
	}
	private JTable getTable_1() {
		if (table_1 == null) {
			table_1 = new JTable();
			table_1.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"NAME"
				}
			));
		}
		return table_1;
	}
	private JLabel getLblLateQueue() {
		if (lblLateQueue == null) {
			lblLateQueue = new JLabel("LATE QUEUE");
			lblLateQueue.setHorizontalAlignment(SwingConstants.CENTER);
			lblLateQueue.setForeground(Color.BLACK);
			lblLateQueue.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblLateQueue.setBounds(266, 339, 592, 45);
		}
		return lblLateQueue;
	}
	private JSeparator getSeparator_2() {
		if (separator_2 == null) {
			separator_2 = new JSeparator();
			separator_2.setBounds(1039, 164, 288, 8);
		}
		return separator_2;
	}
	private JLabel getLblTrainScreen() {
		if (lblTrainScreen == null) {
			lblTrainScreen = new JLabel("TRAIN SCREEN");
			lblTrainScreen.setHorizontalAlignment(SwingConstants.CENTER);
			lblTrainScreen.setForeground(Color.WHITE);
			lblTrainScreen.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTrainScreen.setBounds(904, 126, 556, 45);
		}
		return lblTrainScreen;
	}
	private JLabel getLblTime_1() {
		if (lblTime_1 == null) {
			lblTime_1 = new JLabel("ADD");
			lblTime_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1.setForeground(Color.BLACK);
			lblTime_1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTime_1.setBounds(662, 238, 183, 59);
		}
		return lblTime_1;
	}
	private JLabel getLblTime_1_1() {
		if (lblTime_1_1 == null) {
			lblTime_1_1 = new JLabel("REMOVE");
			lblTime_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1_1.setForeground(Color.BLACK);
			lblTime_1_1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTime_1_1.setBounds(41, 339, 189, 57);
		}
		return lblTime_1_1;
	}
	private JLabel getLblTime_1_1_1() {
		if (lblTime_1_1_1 == null) {
			lblTime_1_1_1 = new JLabel("ADD BACK");
			lblTime_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1_1_1.setForeground(Color.BLACK);
			lblTime_1_1_1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTime_1_1_1.setBounds(41, 438, 189, 57);
		}
		return lblTime_1_1_1;
	}
	private JSeparator getSeparator_3() {
		if (separator_3 == null) {
			separator_3 = new JSeparator();
			separator_3.setBounds(435, 379, 249, 8);
		}
		return separator_3;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index3.png"));
			lblNewLabel_2.setBounds(10, 11, 254, 83);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblOfficialPortal() {
		if (lblOfficialPortal == null) {
			lblOfficialPortal = new JLabel("MANAGEMENT");
			lblOfficialPortal.setHorizontalAlignment(SwingConstants.CENTER);
			lblOfficialPortal.setForeground(Color.BLACK);
			lblOfficialPortal.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblOfficialPortal.setBounds(20, 21, 232, 67);
		}
		return lblOfficialPortal;
	}
}
