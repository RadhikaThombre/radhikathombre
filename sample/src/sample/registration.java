package sample;

import java.awt.EventQueue;
import javax.swing.ButtonGroup;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class registration {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration window = new registration();
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
	public registration() {
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
		
		JLabel lblNewLabel = new JLabel("Registration");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(173, 11, 85, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("username");
		lblNewLabel_1.setBounds(38, 58, 92, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("password");
		lblNewLabel_2.setBounds(38, 96, 92, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("branch");
		lblNewLabel_3.setBounds(38, 133, 46, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Gender");
		lblNewLabel_4.setBounds(38, 184, 46, 14);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("City");
		lblNewLabel_5.setBounds(38, 214, 46, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		frame.getContentPane().add(lblNewLabel_5);
		
		JFormattedTextField tb1 = new JFormattedTextField();
		tb1.setBounds(220, 55, 92, 20);
		frame.getContentPane().add(tb1);
		
		JFormattedTextField p1 = new JFormattedTextField();
		p1.setBounds(220, 93, 92, 20);
		frame.getContentPane().add(p1);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"CSE", "IT", "EEE"}));
		cb1.setBounds(220, 129, 92, 22);
		frame.getContentPane().add(cb1);
		
		JRadioButton r1 = new JRadioButton("Male");
		r1.setBounds(220, 184, 80, 14);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("Female");
		r2.setBounds(298, 180, 71, 23);
		frame.getContentPane().add(r2);
		ButtonGroup rgb=new ButtonGroup();
		rgb.add(r1);
		rgb.add(r2);
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"HYD", "mumbai"}));
		cb2.setBounds(220, 210, 92, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(220, 210, 92, 22);
		frame.getContentPane().add(comboBox_4);
		
		JButton b1 = new JButton("submit");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String user=tb1.getText();
			String branch=(String) cb1.getSelectedItem();
			String city=(String) cb2.getSelectedItem();
			String gender="";
			if(r1.isSelected())
			{
				gender="male";
			}
			if(r2.isSelected())
			{
				gender="female";
				
			}
			JOptionPane.showMessageDialog(b1, "name "+user+"\n branch "+branch+"\n city"+city+"\n gender"+gender);
			}
		});
		b1.setBounds(120, 238, 89, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(0, 0, 434, 273);
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\bricks.jpg"));
		frame.getContentPane().add(lblNewLabel_6);
	}
}
