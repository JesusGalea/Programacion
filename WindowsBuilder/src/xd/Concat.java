package xd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Concat extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Concat frame = new Concat();
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
	public Concat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 615, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LB1 = new JLabel("");
		LB1.setBounds(301, 122, 225, 14);
		contentPane.add(LB1);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "1");
			}
		});
		btnNewButton.setBounds(70, 184, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "2");
			}
		});
		btnNewButton_1.setBounds(182, 184, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "3");
			}
		});
		btnNewButton_2.setBounds(301, 184, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.setBounds(431, 184, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "4");
			}
		});
		btnNewButton_4.setBounds(70, 230, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "5");
			}
		});
		btnNewButton_5.setBounds(182, 230, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "6");
			}
		});
		btnNewButton_6.setBounds(301, 230, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.setBounds(431, 230, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "7");
			}
		});
		btnNewButton_8.setBounds(70, 276, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("8");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "8");
			}
		});
		btnNewButton_9.setBounds(182, 276, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("9");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "9");
			}
		});
		btnNewButton_10.setBounds(301, 276, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.setBounds(431, 276, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LB1.setText(LB1.getText()+ "0");
			}
		});
		btnNewButton_12.setBounds(70, 323, 89, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.setBounds(182, 323, 208, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("/");
		btnNewButton_14.setBounds(431, 323, 89, 23);
		contentPane.add(btnNewButton_14);
		
		
	}
}
