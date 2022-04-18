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
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Ascensor extends JFrame {

	private JPanel contentPane;
	private JLabel L1;
	private JLabel L2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ascensor frame = new Ascensor();
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
	public Ascensor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		JButton boton1 = new JButton("1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoActual = Integer.parseInt(L1.getText());
				if (1 < pisoActual)
					L2.setText("Baja");
				else
					L2.setText("Piso actual");
				L1.setText("Hola");
			}
		});
		boton1.setBackground(Color.LIGHT_GRAY);
		boton1.setBounds(22, 164, 44, 40);
		contentPane.add(boton1);
		

		JButton boton2 = new JButton("2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoActual = Integer.parseInt(L1.getText());
				if (2 < pisoActual)
					L2.setText("Baja");
				else
					if (2 > pisoActual)
						L2.setText("Sube");
					else
					L2.setText("Piso actual");
				L1.setText("2");
			}
		});
		boton2.setBackground(Color.LIGHT_GRAY);
		boton2.setBounds(22, 113, 44, 40);
		contentPane.add(boton2);
		
		
		
		JButton boton3 = new JButton("3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int pisoActual = Integer.parseInt(L1.getText());
				if (3 < pisoActual)
					L2.setText("Baja");
				else
					if (3 > pisoActual)
						L2.setText("Sube");
					else
					L2.setText("Piso actual");
				L1.setText("3");
			}
		});
		boton3.setBackground(Color.LIGHT_GRAY);
		boton3.setBounds(22, 62, 44, 40);
		contentPane.add(boton3);
		

		JButton boton4 = new JButton("4");
		boton4.setForeground(Color.BLACK);
		boton4.setBackground(Color.LIGHT_GRAY);
		boton4.setBounds(22, 11, 44, 40);
		contentPane.add(boton4);
		
		
		
		JLabel lblNewLabel = new JLabel("Piso");
		lblNewLabel.setBounds(149, 37, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setBounds(137, 88, 73, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel L1 = new JLabel("1");
		L1.setBounds(220, 37, 46, 14);
		contentPane.add(L1);
		
		JLabel L2 = new JLabel("Baja");
		L2.setBounds(220, 88, 46, 14);
		contentPane.add(L2);
	}
}