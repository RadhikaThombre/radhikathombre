package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroticket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroticket window = new metroticket();
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
	public metroticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("METRO TICKET BOOKING");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(81, 28, 263, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(39, 75, 77, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("SOURCE");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(39, 119, 77, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NO OF TICKETS");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(39, 224, 129, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DESTINATION");
		lblNewLabel_4.setForeground(new Color(255, 0, 0));
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setBounds(39, 170, 113, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JFormattedTextField p1 = new JFormattedTextField();
		p1.setBounds(200, 72, 108, 20);
		frame.getContentPane().add(p1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb1.setModel(new DefaultComboBoxModel(new String[] {"MGBS", "SECUNDERABAD", "KUKATPALLY", "BALANAGAR", "JBS"}));
		cb1.setBounds(200, 119, 108, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb2.setModel(new DefaultComboBoxModel(new String[] {"KUKATPALLY", "LB NAGAR", "JBS", "MGBS", "SECUNDERABAD"}));
		cb2.setBounds(200, 166, 108, 22);
		frame.getContentPane().add(cb2);
		JComboBox cb3 = new JComboBox();
		cb3.setFont(new Font("Times New Roman", Font.BOLD, 11));
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		cb3.setBounds(200, 220, 108, 22);
		frame.getContentPane().add(cb3);
		
		
		JButton b1 = new JButton("BOOK");
		b1.setForeground(new Color(255, 0, 0));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=b1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(source.equals(destination)) {
					JOptionPane.showMessageDialog(b1, "please check stations");
				}
				else {
					bill=bill+45*nt;
					JOptionPane.showConfirmDialog(b1, "name "+ name+"\n source"+source+"\n destination"+destination+ 
							"number of tickets"+nt+"\n bill"+bill);
				}
				
				
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b1.setBounds(311, 220, 113, 23);
		frame.getContentPane().add(b1);

		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Desktop\\METRO2.jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
