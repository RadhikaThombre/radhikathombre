package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecommerceapp {

	private JFrame frame;
	int items=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecommerceapp window = new Ecommerceapp();
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
	public Ecommerceapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERCE APP");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(136, 32, 207, 14);
		frame.getContentPane().add(lblNewLabel);
		JLabel L1 = new JLabel("RS300");
		L1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		L1.setBounds(69, 236, 46, 14);
		frame.getContentPane().add(L1);
		JButton L3 = new JButton("CART");
		L3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		L3.setBounds(313, 29, 111, 23);
		frame.getContentPane().add(L3);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+300;
				L3.setText("CART:"+items);
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\book 4.png"));
		b1.setBounds(39, 69, 124, 152);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+250;
				L3.setText("CART:"+items);
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Pictures\\book6.png"));
		b2.setBounds(241, 69, 111, 152);
		frame.getContentPane().add(b2);
		
		//JLabel L1 = new JLabel("RS300");
		//L1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		//L1.setBounds(69, 236, 46, 14);
		//frame.getContentPane().add(L1);
		
		JLabel L2 = new JLabel("RS250");
		L2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		L2.setBounds(273, 232, 46, 14);
		frame.getContentPane().add(L2);
		
		JButton b3 = new JButton("BUY");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(b3,"number of items "+items+"\n total bill"+bill);
				
			}
		});
		b3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b3.setBounds(163, 232, 89, 23);
		frame.getContentPane().add(b3);
		
		//JButton L3 = new JButton("CART");
		//L3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		//L3.setBounds(335, 29, 89, 23);
		//frame.getContentPane().add(L3);
	}
}
