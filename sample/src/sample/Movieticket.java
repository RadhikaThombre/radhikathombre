package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Movieticket {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Movieticket window = new Movieticket();
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
	public Movieticket() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 192));
		frame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE APP");
		lblNewLabel_1.setBounds(182, 11, 114, 14);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		frame.getContentPane().add(lblNewLabel_1);
		

		JFormattedTextField tb1 = new JFormattedTextField();
		tb1.setBounds(234, 59, 114, 23);
		frame.getContentPane().add(tb1);
		
		JComboBox CB1 = new JComboBox();
		CB1.setBounds(234, 108, 114, 23);
		CB1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		CB1.setModel(new DefaultComboBoxModel(new String[] {"SALAAR", "KGF", "SKANDA"}));
		frame.getContentPane().add(CB1);
		
		JComboBox CB2 = new JComboBox();
		CB2.setBounds(234, 163, 114, 23);
		CB2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		CB2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		frame.getContentPane().add(CB2);
		
		JLabel lblNewLabel_2 = new JLabel("Name");
		lblNewLabel_2.setBounds(69, 68, 46, 14);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Movie");
		lblNewLabel.setBounds(69, 117, 46, 14);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Number ofTickets");
		lblNewLabel_3.setBounds(69, 172, 155, 14);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton b1 = new JButton("Book");
		b1.setBounds(155, 214, 89, 23);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user=tb1.getText();
				String Movie=(String) CB1.getSelectedItem();
				String tickets=(String) CB2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				int bill=0;
				if(Movie.equals("SALAAR"))
				{
					bill=nt*150;
				}
				if(Movie.equals("KGF"))
				{
					bill=nt*250;
				}
				if(Movie.equals("SKANDA"))
				{
					bill=nt*250;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(b1, "Name"+user+"\n Movie "+Movie+"Number of tickets "+tickets+"\n bill "+bill);
				if(res==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(b1, "BOOKING CONFIRMED");
					tb1.setText("");
					CB1.setSelectedItem("");
					
				}
				else {
					JOptionPane.showMessageDialog(b1, "BOOKING CANCEALED");

				}
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		frame.getContentPane().add(b1);
		
	}
}
