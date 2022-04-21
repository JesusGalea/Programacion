package xd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton B1 = new JButton("EJ1");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Concat ej1 = new Concat();
				ej1.main(null);
			}
		});
		B1.setBounds(62, 53, 89, 23);
		contentPane.add(B1);
		
		JButton B3 = new JButton("EJ3");
		B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Colores ej3 = new Colores();
				ej3.main(null);
			}
		});
		B3.setBounds(62, 122, 89, 23);
		contentPane.add(B3);
		
		JButton B2 = new JButton("EJ2");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Sumatoria ej2 = new Sumatoria();
				ej2.main(null);
			}
		});
		B2.setBounds(251, 53, 89, 23);
		contentPane.add(B2);
		
		JButton B4 = new JButton("EJ4");
		B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Embalse ej4 = new Embalse();
				ej4.main(null);
			}
		});
		B4.setBounds(251, 122, 89, 23);
		contentPane.add(B4);
	}

}
