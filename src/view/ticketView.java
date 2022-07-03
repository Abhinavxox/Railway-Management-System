package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import data_structures.arrays;
import data_structures.fileHandler;

import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ticketView extends JFrame {

	private JPanel contentPane;
	private JSeparator separator;
	private JLabel lblLogin;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel name_txt;
	private JLabel lblNewLabel_2;
	private JLabel train_txt;
	private JLabel date_txt;
	private JLabel price_txt;
	private JLabel count_txt;
	private JLabel from_txt;
	private JLabel to_txt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ticketView frame = new ticketView();
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
	public ticketView() throws IOException{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		contentPane = new JPanel();
		contentPane.setBackground(Color.decode("#2c3e50"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getTo_txt());
		contentPane.add(getFrom_txt());
		contentPane.add(getCount_txt());
		contentPane.add(getPrice_txt());
		contentPane.add(getDate_txt());
		contentPane.add(getTrain_txt());
		contentPane.add(getLblNewLabel());
		contentPane.add(getLblNewLabel_2());
		contentPane.add(getName_txt());
		contentPane.add(getSeparator());
		contentPane.add(getLblLogin());
		contentPane.add(getLblNewLabel_1());
		fillTicket();
		
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(327, 76, 205, 13);
		}
		return separator;
	}
	private JLabel getLblLogin() {
		if (lblLogin == null) {
			lblLogin = new JLabel("BOOKED");
			lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
			lblLogin.setForeground(Color.WHITE);
			lblLogin.setFont(new Font("Press Start 2P", Font.BOLD, 30));
			lblLogin.setBounds(327, 11, 205, 84);
		}
		return lblLogin;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("");
			lblNewLabel.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					new passengerPortal().setVisible(true);
					dispose();
				}
			});
			lblNewLabel.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\back.png"));
			lblNewLabel.setBounds(805, 11, 73, 84);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\ticketView1.png"));
			lblNewLabel_1.setBounds(10, 76, 868, 527);
		}
		return lblNewLabel_1;
	}
	private JLabel getName_txt() {
		if (name_txt == null) {
			name_txt = new JLabel("NAME:");
			name_txt.setHorizontalAlignment(SwingConstants.LEFT);
			name_txt.setForeground(Color.WHITE);
			name_txt.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			name_txt.setBounds(115, 127, 664, 50);
		}
		return name_txt;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\abhin\\Desktop\\JAVA\\workspace\\Railway_Management_System\\assets\\images\\ticketView2.png"));
			lblNewLabel_2.setBounds(628, 237, 138, 159);
		}
		return lblNewLabel_2;
	}
	
	void showTicket() throws IOException {
		String arr[] = arrays.getTicket();
	
	}
	private JLabel getTrain_txt() {
		if (train_txt == null) {
			train_txt = new JLabel("TRAIN:");
			train_txt.setHorizontalAlignment(SwingConstants.LEFT);
			train_txt.setForeground(Color.WHITE);
			train_txt.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			train_txt.setBounds(115, 188, 664, 50);
		}
		return train_txt;
	}
	private JLabel getDate_txt() {
		if (date_txt == null) {
			date_txt = new JLabel("DATE:");
			date_txt.setHorizontalAlignment(SwingConstants.LEFT);
			date_txt.setForeground(Color.WHITE);
			date_txt.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			date_txt.setBounds(115, 249, 503, 50);
		}
		return date_txt;
	}
	private JLabel getPrice_txt() {
		if (price_txt == null) {
			price_txt = new JLabel("PRICE:");
			price_txt.setHorizontalAlignment(SwingConstants.LEFT);
			price_txt.setForeground(Color.WHITE);
			price_txt.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			price_txt.setBounds(115, 310, 503, 50);
		}
		return price_txt;
	}
	private JLabel getCount_txt() {
		if (count_txt == null) {
			count_txt = new JLabel("COUNT:");
			count_txt.setHorizontalAlignment(SwingConstants.LEFT);
			count_txt.setForeground(Color.WHITE);
			count_txt.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			count_txt.setBounds(115, 371, 503, 50);
		}
		return count_txt;
	}
	private JLabel getFrom_txt() {
		if (from_txt == null) {
			from_txt = new JLabel("FROM:");
			from_txt.setHorizontalAlignment(SwingConstants.LEFT);
			from_txt.setForeground(Color.WHITE);
			from_txt.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			from_txt.setBounds(115, 432, 651, 50);
		}
		return from_txt;
	}
	private JLabel getTo_txt() {
		if (to_txt == null) {
			to_txt = new JLabel("TO: ");
			to_txt.setHorizontalAlignment(SwingConstants.LEFT);
			to_txt.setForeground(Color.WHITE);
			to_txt.setFont(new Font("Press Start 2P", Font.BOLD, 20));
			to_txt.setBounds(115, 496, 651, 50);
		}
		return to_txt;
	}
	
	public void fillTicket() throws IOException {
		String[] arr = arrays.getTicket();
		from_txt.setText(from_txt.getText()+" "+arr[0]);
		to_txt.setText(to_txt.getText()+" "+arr[1]);
		date_txt.setText(date_txt.getText()+" "+arr[2]);
		name_txt.setText(name_txt.getText()+" "+arr[3]);
		count_txt.setText(count_txt.getText()+" "+arr[4]);
		train_txt.setText(train_txt.getText()+" "+arr[5]);
		price_txt.setText(price_txt.getText()+" "+arr[6]);
	}
}
