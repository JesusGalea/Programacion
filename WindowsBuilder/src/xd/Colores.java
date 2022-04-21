package xd;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Colores extends JFrame {

	protected static java.awt.Color green;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Colores frame = new Colores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param k 
	 * @param j 
	 * @param i 
	 */
	public Colores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 101, 22);
		contentPane.add(menuBar);
		
		JMenu M1 = new JMenu("Cambiar color");
		menuBar.add(M1);
		
		JMenuItem MI1 = new JMenuItem("Rojo");
		MI1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 contentPane.setBackground(new Color (255,0,0));
			}
		});
		M1.add(MI1);
		
		  JMenuItem MI2 = new JMenuItem("Verde");
	        MI2.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                contentPane.setBackground(new Color (0,255,0));
	            }
	        });
	        M1.add(MI2);
		
		JMenuItem MI3 = new JMenuItem("Azul");
		  MI3.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                contentPane.setBackground(new Color (0,0,255));
	            }
	        });
		M1.add(MI3);
	}
}
