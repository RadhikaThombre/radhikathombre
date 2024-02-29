package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class studentdetails {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentdetails window = new studentdetails();
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
	public studentdetails() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 255));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 10);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(29, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("id");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(29, 84, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Address");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(29, 125, 68, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("marks");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(29, 173, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JFormattedTextField tb1 = new JFormattedTextField();
		tb1.setBounds(163, 45, 106, 20);
		frame.getContentPane().add(tb1);
		
		JFormattedTextField tb2 = new JFormattedTextField();
		tb2.setBounds(163, 82, 103, 20);
		frame.getContentPane().add(tb2);
		
		JFormattedTextField tb3 = new JFormattedTextField();
		tb3.setBounds(163, 123, 106, 20);
		frame.getContentPane().add(tb3);
		
		JFormattedTextField tb4 = new JFormattedTextField();
		tb4.setBounds(163, 168, 103, 20);
		frame.getContentPane().add(tb4);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String id=tb2.getText();
				String address=tb3.getText();
				String marks=tb4.getText();
				int m=Integer.parseInt(marks);
				try {
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","mrec");
	                String q="insert into student values('"+name+"','"+id+"','"+address+"','"+m+"')";
	                Statement sta=con.createStatement();
	                sta.executeUpdate(q);
	                con.close();
	                JOptionPane.showMessageDialog(btnNewButton,"successful");
				
				}
				catch(SQLException e1) {
					e1.printStackTrace();				}
			}
		});
		btnNewButton.setBounds(115, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("STUDENT DETAILS");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(138, 21, 170, 14);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
