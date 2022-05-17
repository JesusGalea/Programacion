package grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Grafico extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grafico frame = new Grafico();
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
	public Grafico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton B1 = new JButton("Tomar prestado");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tomar obj1 = new Tomar();
				obj1.main(null);
			}
		});
		B1.setBounds(39, 116, 170, 55);
		contentPane.add(B1);
		
		JLabel LB1 = new JLabel("Biblioteca");
		LB1.setBackground(Color.GRAY);
		LB1.setForeground(Color.LIGHT_GRAY);
		LB1.setFont(new Font("Tahoma", Font.BOLD, 25));
		LB1.setBounds(171, 42, 189, 23);
		contentPane.add(LB1);
		
		JButton B2 = new JButton("Devolver");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Devolver obj2 = new Devolver();
				obj2.main(null);
			}
		});
		B2.setBounds(298, 116, 141, 55);
		contentPane.add(B2);
		
		JButton B3 = new JButton("Darse de baja");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Baja obj3 = new Baja();
				obj3.main(null);
			}
		});
		B3.setBounds(171, 225, 162, 69);
		contentPane.add(B3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Administrador\\Documents\\GitHub\\Programacion\\TFC\\src\\images\\libro.jpg"));
		lblNewLabel.setBounds(0, 0, 480, 444);
		contentPane.add(lblNewLabel);
	}
}
