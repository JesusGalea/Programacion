package builder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import builder.clasesActividad1.ArraysEjercicio3;
import builder.clasesActividad1.ArraysEjercicio4;
import builder.clasesActividad1.ArraysEjercicio5;
import builder.clasesActividad1.Ejercicio1;
import builder.clasesActividad1.Ejercicio2;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class Actividad1 extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Actividad1 frame = new Actividad1();
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
	public Actividad1() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Ejercicio 1");
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				builder.clasesActividad1.Ejercicio1 obj1= new builder.clasesActividad1.Ejercicio1();
				obj1.main(null);			
				
			}
		    });
		btnNewButton.setBounds(162, 78, 101, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ejercicio 2");
		btnNewButton_1.setBackground(Color.RED);
		btnNewButton_1.setForeground(Color.YELLOW);
		btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			builder.clasesActividad1.Ejercicio2 obj2= new builder.clasesActividad1.Ejercicio2();
			obj2.main(null);			
		}
	    });
	    btnNewButton_1.setBounds(162, 112, 101, 23);
	    contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Men\u00FA Principal");
		lblNewLabel.setFont(new Font("Sensa Sans Demo", Font.BOLD, 21));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(95, 37, 249, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("Ejercicio 3");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setForeground(Color.YELLOW);
		btnNewButton_2.setBounds(162, 146, 101, 23);
		contentPane.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				builder.clasesActividad1.ArraysEjercicio3 obj3= new builder.clasesActividad1.ArraysEjercicio3();
				obj3.main(null);			
			}
		    });
		JButton btnNewButton_3 = new JButton("Ejercicio 4");
		btnNewButton_3.setBackground(Color.RED);
		btnNewButton_3.setForeground(Color.YELLOW);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				builder.clasesActividad1.ArraysEjercicio4 obj4= new builder.clasesActividad1.ArraysEjercicio4();
				obj4.main(null);
			}
		});
		btnNewButton_3.setBounds(162, 180, 101, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Ejercicio 5");
		btnNewButton_4.setBackground(Color.RED);
		btnNewButton_4.setForeground(Color.YELLOW);
		btnNewButton_4.setBounds(162, 214, 101, 23);
		contentPane.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				builder.clasesActividad1.ArraysEjercicio5 obj5= new builder.clasesActividad1.ArraysEjercicio5();
				obj5.main(null);
			}
		});
	}
}
