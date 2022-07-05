package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import data_structures.arrays;
import data_structures.fileHandler;
import data_structures.linkedList;
import data_structures.queue;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JComboBox;

public class officialPortal extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JLabel lblAddTrain;
	private JTextField time_txt;
	private JLabel lblName;
	private JLabel lblTime;
	private JSeparator separator;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JSeparator separator_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblLateQueue;
	private JSeparator separator_2;
	private JLabel lblTrainScreen;
	private JLabel lblTime_1;
	private JLabel lblTime_1_1;
	private JLabel lblTime_1_1_1;
	private JSeparator separator_3;
	private JLabel lblNewLabel_2;
	private JLabel lblOfficialPortal;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_5_1;
	private JLabel lblNewLabel_5_1_1;
	private JLabel lblNewLabel_5_1_2;
	private JLabel lblNewLabel_5_1_3;
	private JLabel S1;
	private JLabel S2;
	private JLabel S3;
	private JLabel S4;
	private JLabel S5;
	private JLabel T1;
	private JLabel H1;
	private JLabel T2;
	private JLabel T3;
	private JLabel T4;
	private JLabel T5;
	private JLabel H2;
	private JLabel H3;
	private JLabel H4;
	private JLabel H5;
	private JLabel lblNewLabel_5_2;
	private JLabel lblNewLabel_5_3;
	private JLabel lblNewLabel_5_4;
	private JLabel lblTime_1_2_5;
	private JLabel LT1;
	private JLabel lblTime_1_2_6;
	private JLabel LT2;
	private JLabel lblTime_1_2_7;
	private JLabel LT3;
	private JComboBox train_combo;
	private JTextField remove_txt;
	private JTextField addBack_txt;
	private JLabel lblTime_1_2;
	private JLabel lblNewLabel_1_2;

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
	 * @throws IOException 
	 */
	public officialPortal() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1500, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode("#2c3e50"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblTime_1_2());
		contentPane.add(getLblNewLabel_1_2());
		contentPane.add(getAddBack_txt());
		contentPane.add(getRemove_txt());
		contentPane.add(getTrain_combo());
		contentPane.add(getLT3());
		contentPane.add(getLblTime_1_2_7());
		contentPane.add(getLT2());
		contentPane.add(getLblTime_1_2_6());
		contentPane.add(getLblTime_1_2_5());
		contentPane.add(getLT1());
		contentPane.add(getLblNewLabel_5_3_1());
		contentPane.add(getLblNewLabel_5_4_1());
		contentPane.add(getLblNewLabel_5_2_1());
		contentPane.add(getH3());
		contentPane.add(getT3());
		contentPane.add(getH2());
		contentPane.add(getH5());
		contentPane.add(getH4());
		contentPane.add(getT2());
		contentPane.add(getT5());
		contentPane.add(getT4());
		contentPane.add(getT1());
		contentPane.add(getH1());
		contentPane.add(getS5());
		contentPane.add(getS3());
		contentPane.add(getS2());
		contentPane.add(getS4());
		contentPane.add(getS1());
		contentPane.add(getLblNewLabel_5_1_3());
		contentPane.add(getLblNewLabel_5_1_1_1());
		contentPane.add(getLblNewLabel_5_1_2());
		contentPane.add(getLblNewLabel_5_1_1());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblOfficialPortal());
		contentPane.add(getSeparator_3());
		contentPane.add(getLblTime_1_1_1());
		contentPane.add(getLblTime_1_1());
		contentPane.add(getLblTime_1());
		contentPane.add(getLblLateQueue());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getSeparator_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblAddTrain());
		contentPane.add(getTime_txt());
		contentPane.add(getLblName());
		contentPane.add(getLblTime());
		contentPane.add(getSeparator());
		contentPane.add(getLblNewLabel());
		contentPane.add(getSeparator_2());
		contentPane.add(getLblTrainScreen());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getLblNewLabel_4());
		setTrainScreen();
		giveTrainNames();
		setQueue();
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
	private JTextField getTime_txt() {
		if (time_txt == null) {
			time_txt = new JTextField();
			time_txt.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			time_txt.setColumns(10);
			time_txt.setBounds(501, 264, 136, 45);
		}
		return time_txt;
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
			lblTime.setBounds(501, 208, 136, 45);
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
			lblNewLabel_1.setBounds(658, 225, 211, 84);
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
			lblNewLabel_1_1.setBounds(41, 405, 211, 84);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("");
			lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 1ldpi.png"));
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1_1.setBounds(41, 568, 211, 84);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblLateQueue() {
		if (lblLateQueue == null) {
			lblLateQueue = new JLabel("LATE QUEUE");
			lblLateQueue.setHorizontalAlignment(SwingConstants.CENTER);
			lblLateQueue.setForeground(Color.BLACK);
			lblLateQueue.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblLateQueue.setBounds(285, 339, 554, 45);
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
			lblTime_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					//validation
					if(train_combo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(train_combo, "SELECT TRAIN");
						return;
					}
					if(time_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(time_txt, "ENTER TIME");
						return;	
					}
					if(!time_txt.getText().matches("^(2[0-3]|[01]?[0-9]):([0-5]?[0-9])$")) {
						JOptionPane.showMessageDialog(time_txt, "INVALID TIME");
						return;		
					}
					
					try {
						String[] arr = {(String) train_combo.getSelectedItem(), time_txt.getText()};
						linkedList.insertAtBack(arr);
						setTrainScreen();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			lblTime_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1.setForeground(Color.BLACK);
			lblTime_1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTime_1.setBounds(673, 239, 183, 59);
		}
		return lblTime_1;
	}
	private JLabel getLblTime_1_1() {
		if (lblTime_1_1 == null) {
			lblTime_1_1 = new JLabel("DELAY");
			lblTime_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					//validate
					if(remove_txt.getText().isEmpty()){
						JOptionPane.showMessageDialog(remove_txt, "ENTER THE INDEX TO REMOVE TEMPORARILY");
						return;
					}
					if(!Character.isDigit(remove_txt.getText().charAt(0))){
						JOptionPane.showMessageDialog(remove_txt, "INVALID ENTER A NUMBER");
						return;
					}
					//delete at end given index
					int index = Integer.parseInt(remove_txt.getText());
					try {
						if(!linkedList.isEmpty()) {
							queue.enqueue(linkedList.deleteFromMiddle(index-1));
							setQueue();
							setTrainScreen();	
							remove_txt.setText("");
						}else {
							JOptionPane.showMessageDialog(remove_txt, "LIST IS EMPTY");
							return;
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			lblTime_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1_1.setForeground(Color.BLACK);
			lblTime_1_1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTime_1_1.setBounds(51, 421, 189, 57);
		}
		return lblTime_1_1;
	}
	private JLabel getLblTime_1_1_1() {
		if (lblTime_1_1_1 == null) {
			lblTime_1_1_1 = new JLabel("ADD BACK");
			lblTime_1_1_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					if(addBack_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(addBack_txt, "ENTER THE REFRESHED TIME");
						return;
					}
					try {
						if(!queue.isEmpty()) {
							String[] arr = {queue.dequeue(), addBack_txt.getText()};
							linkedList.insertAtBack(arr);
							setTrainScreen();
							setQueue();
							addBack_txt.setText("");
						}
						else {
							JOptionPane.showMessageDialog(addBack_txt, "QUEUE IS EMPTY");
							return;
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			lblTime_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1_1_1.setForeground(Color.BLACK);
			lblTime_1_1_1.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTime_1_1_1.setBounds(51, 583, 189, 57);
		}
		return lblTime_1_1_1;
	}
	private JSeparator getSeparator_3() {
		if (separator_3 == null) {
			separator_3 = new JSeparator();
			separator_3.setBounds(447, 376, 232, 11);
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
	private JLabel getLblNewLabel_4() {
		if (lblNewLabel_4 == null) {
			lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain.png"));
			lblNewLabel_4.setBounds(888, 198, 590, 481);
		}
		return lblNewLabel_4;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain2.png"));
			lblNewLabel_5.setBounds(890, 225, 588, 73);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_5_1_1() {
		if (lblNewLabel_5_1 == null) {
			lblNewLabel_5_1 = new JLabel("");
			lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain2.png"));
			lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1.setBounds(890, 309, 588, 73);
		}
		return lblNewLabel_5_1;
	}
	private JLabel getLblNewLabel_5_1_1_1() {
		if (lblNewLabel_5_1_1 == null) {
			lblNewLabel_5_1_1 = new JLabel("");
			lblNewLabel_5_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain2.png"));
			lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1_1.setBounds(890, 390, 588, 73);
		}
		return lblNewLabel_5_1_1;
	}
	private JLabel getLblNewLabel_5_1_2() {
		if (lblNewLabel_5_1_2 == null) {
			lblNewLabel_5_1_2 = new JLabel("");
			lblNewLabel_5_1_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain2.png"));
			lblNewLabel_5_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1_2.setBounds(890, 474, 588, 73);
		}
		return lblNewLabel_5_1_2;
	}
	private JLabel getLblNewLabel_5_1_3() {
		if (lblNewLabel_5_1_3 == null) {
			lblNewLabel_5_1_3 = new JLabel("");
			lblNewLabel_5_1_3.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain2.png"));
			lblNewLabel_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1_3.setBounds(890, 558, 588, 73);
		}
		return lblNewLabel_5_1_3;
	}
	private JLabel getS1() {
		if (S1 == null) {
			S1 = new JLabel("1");
			S1.setHorizontalAlignment(SwingConstants.CENTER);
			S1.setForeground(Color.BLACK);
			S1.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			S1.setBounds(912, 239, 51, 45);
		}
		return S1;
	}
	private JLabel getS2() {
		if (S2 == null) {
			S2 = new JLabel("2");
			S2.setHorizontalAlignment(SwingConstants.CENTER);
			S2.setForeground(Color.BLACK);
			S2.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			S2.setBounds(912, 323, 51, 45);
		}
		return S2;
	}
	private JLabel getS3() {
		if (S3 == null) {
			S3 = new JLabel("3");
			S3.setHorizontalAlignment(SwingConstants.CENTER);
			S3.setForeground(Color.BLACK);
			S3.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			S3.setBounds(912, 402, 51, 45);
		}
		return S3;
	}
	private JLabel getS4() {
		if (S4 == null) {
			S4 = new JLabel("4");
			S4.setHorizontalAlignment(SwingConstants.CENTER);
			S4.setForeground(Color.BLACK);
			S4.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			S4.setBounds(912, 490, 51, 45);
		}
		return S4;
	}
	private JLabel getS5() {
		if (S5 == null) {
			S5 = new JLabel("5");
			S5.setHorizontalAlignment(SwingConstants.CENTER);
			S5.setForeground(Color.BLACK);
			S5.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			S5.setBounds(912, 574, 51, 45);
		}
		return S5;
	}
	private JLabel getT1() {
		if (T1 == null) {
			T1 = new JLabel("");
			T1.setHorizontalAlignment(SwingConstants.CENTER);
			T1.setForeground(Color.BLACK);
			T1.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			T1.setBounds(973, 239, 386, 45);
		}
		return T1;
	}
	private JLabel getH1() {
		if (H1 == null) {
			H1 = new JLabel("4:30");
			H1.setHorizontalAlignment(SwingConstants.CENTER);
			H1.setForeground(Color.BLACK);
			H1.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			H1.setBounds(1369, 239, 85, 45);
		}
		return H1;
	}
	private JLabel getT2() {
		if (T2 == null) {
			T2 = new JLabel("");
			T2.setHorizontalAlignment(SwingConstants.CENTER);
			T2.setForeground(Color.BLACK);
			T2.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			T2.setBounds(973, 323, 386, 45);
		}
		return T2;
	}
	private JLabel getT3() {
		if (T3 == null) {
			T3 = new JLabel("");
			T3.setHorizontalAlignment(SwingConstants.CENTER);
			T3.setForeground(Color.BLACK);
			T3.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			T3.setBounds(973, 402, 386, 45);
		}
		return T3;
	}
	private JLabel getT4() {
		if (T4 == null) {
			T4 = new JLabel("");
			T4.setHorizontalAlignment(SwingConstants.CENTER);
			T4.setForeground(Color.BLACK);
			T4.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			T4.setBounds(973, 490, 386, 45);
		}
		return T4;
	}
	private JLabel getT5() {
		if (T5 == null) {
			T5 = new JLabel("");
			T5.setHorizontalAlignment(SwingConstants.CENTER);
			T5.setForeground(Color.BLACK);
			T5.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			T5.setBounds(973, 574, 386, 45);
		}
		return T5;
	}
	private JLabel getH2() {
		if (H2 == null) {
			H2 = new JLabel("4:30");
			H2.setHorizontalAlignment(SwingConstants.CENTER);
			H2.setForeground(Color.BLACK);
			H2.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			H2.setBounds(1369, 323, 85, 45);
		}
		return H2;
	}
	private JLabel getH3() {
		if (H3 == null) {
			H3 = new JLabel("4:30");
			H3.setHorizontalAlignment(SwingConstants.CENTER);
			H3.setForeground(Color.BLACK);
			H3.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			H3.setBounds(1369, 402, 85, 45);
		}
		return H3;
	}
	private JLabel getH4() {
		if (H4 == null) {
			H4 = new JLabel("4:30");
			H4.setHorizontalAlignment(SwingConstants.CENTER);
			H4.setForeground(Color.BLACK);
			H4.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			H4.setBounds(1369, 490, 85, 45);
		}
		return H4;
	}
	private JLabel getH5() {
		if (H5 == null) {
			H5 = new JLabel("4:30");
			H5.setHorizontalAlignment(SwingConstants.CENTER);
			H5.setForeground(Color.BLACK);
			H5.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			H5.setBounds(1369, 574, 85, 45);
		}
		return H5;
	}
	private JLabel getLblNewLabel_5_2_1() {
		if (lblNewLabel_5_2 == null) {
			lblNewLabel_5_2 = new JLabel("");
			lblNewLabel_5_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain2.png"));
			lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_2.setBounds(268, 390, 588, 73);
		}
		return lblNewLabel_5_2;
	}
	private JLabel getLblNewLabel_5_3_1() {
		if (lblNewLabel_5_3 == null) {
			lblNewLabel_5_3 = new JLabel("");
			lblNewLabel_5_3.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain2.png"));
			lblNewLabel_5_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_3.setBounds(268, 474, 588, 73);
		}
		return lblNewLabel_5_3;
	}
	private JLabel getLblNewLabel_5_4_1() {
		if (lblNewLabel_5_4 == null) {
			lblNewLabel_5_4 = new JLabel("");
			lblNewLabel_5_4.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\portalTrain2.png"));
			lblNewLabel_5_4.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_4.setBounds(268, 558, 588, 73);
		}
		return lblNewLabel_5_4;
	}
	private JLabel getLblTime_1_2_5() {
		if (lblTime_1_2_5 == null) {
			lblTime_1_2_5 = new JLabel("1");
			lblTime_1_2_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1_2_5.setForeground(Color.BLACK);
			lblTime_1_2_5.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			lblTime_1_2_5.setBounds(297, 402, 51, 45);
		}
		return lblTime_1_2_5;
	}
	private JLabel getLT1() {
		if (LT1 == null) {
			LT1 = new JLabel("");
			LT1.setHorizontalAlignment(SwingConstants.CENTER);
			LT1.setForeground(Color.BLACK);
			LT1.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			LT1.setBounds(358, 402, 481, 45);
		}
		return LT1;
	}
	private JLabel getLblTime_1_2_6() {
		if (lblTime_1_2_6 == null) {
			lblTime_1_2_6 = new JLabel("2");
			lblTime_1_2_6.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1_2_6.setForeground(Color.BLACK);
			lblTime_1_2_6.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			lblTime_1_2_6.setBounds(297, 490, 51, 45);
		}
		return lblTime_1_2_6;
	}
	private JLabel getLT2() {
		if (LT2 == null) {
			LT2 = new JLabel("");
			LT2.setHorizontalAlignment(SwingConstants.CENTER);
			LT2.setForeground(Color.BLACK);
			LT2.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			LT2.setBounds(358, 490, 481, 45);
		}
		return LT2;
	}
	private JLabel getLblTime_1_2_7() {
		if (lblTime_1_2_7 == null) {
			lblTime_1_2_7 = new JLabel("3");
			lblTime_1_2_7.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1_2_7.setForeground(Color.BLACK);
			lblTime_1_2_7.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			lblTime_1_2_7.setBounds(297, 574, 51, 45);
		}
		return lblTime_1_2_7;
	}
	private JLabel getLT3() {
		if (LT3 == null) {
			LT3 = new JLabel("");
			LT3.setHorizontalAlignment(SwingConstants.CENTER);
			LT3.setForeground(Color.BLACK);
			LT3.setFont(new Font("Press Start 2P", Font.BOLD, 15));
			LT3.setBounds(358, 574, 481, 45);
		}
		return LT3;
	}
	
	private void setTrainScreen() throws IOException {
		ArrayList<String[]> trains = arrays.getTrainScreen();
		
		int length = trains.size();
		if(length==0) {
			S1.setText("");
			S2.setText("");
			S3.setText("");
			S4.setText("");
			S5.setText("");
			T1.setText("");
			H1.setText("");
			T2.setText("");
			H2.setText("");
			T3.setText("");
			H3.setText("");
			T4.setText("");
			H4.setText("");
			T5.setText("");
			H5.setText("");
		}
		else if(length<=1) {
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
	
	//method to automatically display the train names from the 
	private void giveTrainNames() throws IOException {
		ArrayList<String[]> trains = arrays.getTrains();
		ArrayList<String> trainNames = new ArrayList<String>();
		for (String[] x : trains) {
			trainNames.add(x[1]);
		}
		train_combo.setModel(new DefaultComboBoxModel(new String[] {"...", trainNames.get(0), trainNames.get(1), trainNames.get(2), trainNames.get(3), trainNames.get(4), trainNames.get(5), trainNames.get(6) }));
	}
	
	private JComboBox getTrain_combo() {
		if (train_combo == null) {
			train_combo = new JComboBox();
			train_combo.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			train_combo.setBounds(31, 263, 460, 45);
		}
		return train_combo;
	}
	private JTextField getRemove_txt() {
		if (remove_txt == null) {
			remove_txt = new JTextField();
			remove_txt.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			remove_txt.setColumns(10);
			remove_txt.setBounds(53, 333, 187, 57);
		}
		return remove_txt;
	}
	private JTextField getAddBack_txt() {
		if (addBack_txt == null) {
			addBack_txt = new JTextField();
			addBack_txt.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			addBack_txt.setColumns(10);
			addBack_txt.setBounds(51, 500, 189, 57);
		}
		return addBack_txt;
	}
	
	private void setQueue() throws IOException {
		ArrayList<String> alist = fileHandler.getTrainQueue();
			if(alist.size()==0) {
				LT1.setText("");
				LT2.setText("");
				LT3.setText("");
			}
		    else if(alist.size()==1) {
				LT1.setText(alist.get(0));
				LT2.setText("");
				LT3.setText("");
			}
			else if(alist.size()==2) {
				LT1.setText(alist.get(0));
				LT2.setText(alist.get(1));
				LT3.setText("");
			}
			else {
				LT1.setText(alist.get(0));
				LT2.setText(alist.get(1));
				LT3.setText(alist.get(2));
			}
	}
	private JLabel getLblTime_1_2() {
		if (lblTime_1_2 == null) {
			lblTime_1_2 = new JLabel("REMOVE");
			lblTime_1_2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						if(!linkedList.isEmpty()) {
							linkedList.deleteFromBeginning();
							setTrainScreen();				
						}else {
							JOptionPane.showMessageDialog(time_txt, "LIST IS EMPTY");
							return;
						}

					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			lblTime_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblTime_1_2.setForeground(Color.BLACK);
			lblTime_1_2.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			lblTime_1_2.setBounds(673, 153, 183, 59);
		}
		return lblTime_1_2;
	}
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("");
			lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\Asset 1ldpi.png"));
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setBounds(658, 139, 211, 84);
		}
		return lblNewLabel_1_2;
	}
}


