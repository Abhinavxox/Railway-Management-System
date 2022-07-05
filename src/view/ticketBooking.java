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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import data_structures.arrays;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class ticketBooking extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNewLabel_5_1;
	private JLabel lblName;
	private JLabel lblTo;
	private JLabel lblDate;
	private JLabel lblName_2_1;
	private JLabel lblName_2_1_1;
	private JLabel lblName_2_1_2;
	private JLabel lblName_2_1_2_1;
	private JTextField name_txt;
	private JTextField price_txt;
	private JComboBox train_combo;
	private JDateChooser date_chooser;
	private JComboBox from_combo;
	private JComboBox to_combo;
	private JSpinner tickets_spinner;
	private arrays a = new arrays();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketBooking frame = new ticketBooking();
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
	public ticketBooking() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(Color.decode("#2c3e50"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTickets_spinner());
		contentPane.add(getTo_combo());
		contentPane.add(getFrom_combo());
		contentPane.add(getDate_chooser());
		contentPane.add(getTrain_combo());
		contentPane.add(getPrice_txt());
		contentPane.add(getName_txt());
		contentPane.add(getLblName_2_1_2_1());
		contentPane.add(getLblName_2_1_2());
		contentPane.add(getLblName_2_1_1());
		contentPane.add(getLblName_2_1());
		contentPane.add(getLblDate());
		contentPane.add(getLblTo());
		contentPane.add(getLblName());
		contentPane.add(getLblNewLabel_5_1());
		contentPane.add(getLblNewLabel_1_1_1());
		contentPane.add(getLblNewLabel_5());
		contentPane.add(getLblNewLabel_1_1());
		contentPane.add(getLblNewLabel_1());
		contentPane.add(getLblNewLabel_3());
		contentPane.add(getLblNewLabel());
		giveTrainNames();
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
			lblNewLabel_3.setBounds(815, 11, 73, 84);
		}
		return lblNewLabel_3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\ticketBooking1.png"));
			lblNewLabel.setBounds(10, 85, 868, 580);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index3.png"));
			lblNewLabel_1.setBounds(21, 11, 232, 75);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("");
			lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index3.png"));
			lblNewLabel_1_1.setBounds(91, 11, 232, 75);
		}
		return lblNewLabel_1_1;
	}
	private JLabel getLblNewLabel_5() {
		if (lblNewLabel_5 == null) {
			lblNewLabel_5 = new JLabel("BOOK A TICKET");
			lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblNewLabel_5.setBounds(31, 12, 280, 74);
		}
		return lblNewLabel_5;
	}
	private JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("");
			lblNewLabel_1_1_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\index3.png"));
			lblNewLabel_1_1_1.setBounds(598, 526, 232, 75);
		}
		return lblNewLabel_1_1_1;
	}
	private JLabel getLblNewLabel_5_1() {
		if (lblNewLabel_5_1 == null) {
			lblNewLabel_5_1 = new JLabel("BOOK");
			lblNewLabel_5_1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					
					//validate
					if(from_combo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(from_combo, "SELECT FROM");
						return;
					}
					if(to_combo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(from_combo, "SELECT TO");
						return;
					}
					if(from_combo.getSelectedIndex()==to_combo.getSelectedIndex()) {
						JOptionPane.showMessageDialog(from_combo, "INVALID FROM AND TO ARE SAME");
						return;
					}
					if(name_txt.getText().isEmpty()) {
						JOptionPane.showMessageDialog(name_txt, "ENTER YOUR NAME");
						return;
					}
					if((int)tickets_spinner.getValue()==0) {
						JOptionPane.showMessageDialog(tickets_spinner, "CHOOSE ATLEASE ONE TICKET");
						return;
					}
					if(train_combo.getSelectedIndex()==0) {
						JOptionPane.showMessageDialog(train_combo, "SELECT TRAIN");
						return;
					}
					
					//to pass this object to ticketView
					String from = (String) from_combo.getSelectedItem();
					String to = (String) to_combo.getSelectedItem(); 
					Date d = date_chooser.getDate();
	                DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
	                String date = dateFormat.format(d);  
					String name = name_txt.getText();
					int noOfTickets = (Integer)tickets_spinner.getValue();
					String trainName = (String) train_combo.getSelectedItem();
					String price = price_txt.getText();
					
					//set the ticket to show it in view
					String ticket[] = {from, to, date, name, String.valueOf(noOfTickets), trainName, price};
					try {
						a.setTicket(ticket);
						new ticketView().setVisible(true);
						dispose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
			});
			lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_5_1.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblNewLabel_5_1.setBounds(598, 527, 232, 74);
		}
		return lblNewLabel_5_1;
	}
	private JLabel getLblName() {
		if (lblName == null) {
			lblName = new JLabel("FROM");
			lblName.setHorizontalAlignment(SwingConstants.CENTER);
			lblName.setForeground(Color.BLACK);
			lblName.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblName.setBounds(21, 109, 282, 46);
		}
		return lblName;
	}
	private JLabel getLblTo() {
		if (lblTo == null) {
			lblTo = new JLabel("TO");
			lblTo.setHorizontalAlignment(SwingConstants.CENTER);
			lblTo.setForeground(Color.BLACK);
			lblTo.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblTo.setBounds(21, 166, 282, 46);
		}
		return lblTo;
	}
	private JLabel getLblDate() {
		if (lblDate == null) {
			lblDate = new JLabel("DATE");
			lblDate.setHorizontalAlignment(SwingConstants.CENTER);
			lblDate.setForeground(Color.BLACK);
			lblDate.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblDate.setBounds(21, 223, 282, 46);
		}
		return lblDate;
	}
	private JLabel getLblName_2_1() {
		if (lblName_2_1 == null) {
			lblName_2_1 = new JLabel("NAME");
			lblName_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblName_2_1.setForeground(Color.BLACK);
			lblName_2_1.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblName_2_1.setBounds(21, 280, 282, 46);
		}
		return lblName_2_1;
	}
	private JLabel getLblName_2_1_1() {
		if (lblName_2_1_1 == null) {
			lblName_2_1_1 = new JLabel("NO OF TICKETS");
			lblName_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblName_2_1_1.setForeground(Color.BLACK);
			lblName_2_1_1.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblName_2_1_1.setBounds(21, 337, 282, 46);
		}
		return lblName_2_1_1;
	}
	private JLabel getLblName_2_1_2() {
		if (lblName_2_1_2 == null) {
			lblName_2_1_2 = new JLabel("TRAIN NAME");
			lblName_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblName_2_1_2.setForeground(Color.BLACK);
			lblName_2_1_2.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblName_2_1_2.setBounds(21, 388, 282, 46);
		}
		return lblName_2_1_2;
	}
	private JLabel getLblName_2_1_2_1() {
		if (lblName_2_1_2_1 == null) {
			lblName_2_1_2_1 = new JLabel("PRICE");
			lblName_2_1_2_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblName_2_1_2_1.setForeground(Color.BLACK);
			lblName_2_1_2_1.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			lblName_2_1_2_1.setBounds(21, 445, 282, 46);
		}
		return lblName_2_1_2_1;
	}
	private JTextField getName_txt() {
		if (name_txt == null) {
			name_txt = new JTextField();
			name_txt.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			name_txt.setColumns(10);
			name_txt.setBounds(313, 284, 517, 42);
		}
		return name_txt;
	}
	private JTextField getPrice_txt() {
		if (price_txt == null) {
			price_txt = new JTextField();
			price_txt.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			price_txt.setEditable(false);
			price_txt.setColumns(10);
			price_txt.setBounds(313, 445, 517, 42);
		}
		return price_txt;
	}
	private JComboBox getTrain_combo() {
		if (train_combo == null) {
			train_combo = new JComboBox();
			train_combo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						//get the train prices for calculating total
						ArrayList<String> prices = giveTrainPrices();
						int index = train_combo.getSelectedIndex();
						int noOfTickets = (int)tickets_spinner.getValue();
						if(index==0) {
							price_txt.setText("0");
						}
						int price = Integer.parseInt(prices.get(index-1));
						int total = price*noOfTickets;
						//change everytime the input changes
						price_txt.setText(String.valueOf(total));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			train_combo.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			train_combo.setBounds(313, 388, 517, 42);
		}
		return train_combo;
	}
	private JDateChooser getDate_chooser() {
		if (date_chooser == null) {
			date_chooser = new JDateChooser();
			date_chooser.setBounds(313, 221, 517, 52);
		}
		return date_chooser;
	}
	private JComboBox getFrom_combo() {
		if (from_combo == null) {
			from_combo = new JComboBox();
			from_combo.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			from_combo.setModel(new DefaultComboBoxModel(new String[] {"...", "Karunagapally", "Kochi", "Calicut", "Goa", "Delhi", "Mumbai"}));
			from_combo.setBounds(313, 113, 517, 42);
		}
		return from_combo;
	}
	private JComboBox getTo_combo() {
		if (to_combo == null) {
			to_combo = new JComboBox();
			to_combo.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			to_combo.setModel(new DefaultComboBoxModel(new String[] {"...", "Karunagapally", "Kochi", "Calicut", "Goa", "Delhi", "Mumbai"}));
			to_combo.setBounds(313, 168, 517, 42);
		}
		return to_combo;
	}
	private JSpinner getTickets_spinner() {
		if (tickets_spinner == null) {
			tickets_spinner = new JSpinner();
			tickets_spinner.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent e) {
					try {
						ArrayList<String> prices = giveTrainPrices();
						int index = train_combo.getSelectedIndex();
						int noOfTickets = (int)tickets_spinner.getValue();
						if(index==0) {
							price_txt.setText("0");
							return;
						}
						int price = Integer.parseInt(prices.get(index-1));
						int total = price*noOfTickets;
						price_txt.setText(String.valueOf(total));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			tickets_spinner.setFont(new Font("Press Start 2P", Font.PLAIN, 20));
			tickets_spinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
			tickets_spinner.setBounds(313, 337, 517, 42);
		}
		return tickets_spinner;
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
	
	//method to pass the arraylist of prices
	private ArrayList<String> giveTrainPrices() throws IOException {
		ArrayList<String[]> trains = arrays.getTrains();
		ArrayList<String> trainPrices = new ArrayList<String>();
		for (String[] x : trains) {
			System.out.println(Arrays.toString(x));
			trainPrices.add(x[2]);
		}
		return trainPrices;
	}
	
	
}
