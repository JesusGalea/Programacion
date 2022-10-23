package grafico;

import java.awt.EventQueue;
import logica.Logica;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class Grafico {

	private JFrame frame;
	static Grafico j1;
	private JTextField textField;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Grafico window = new Grafico();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Grafico() {
		
		initialize();
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		
	}

	private void initialize() {
	
		frame = new JFrame();
		frame.setLocationRelativeTo(null);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Grafico.class.getResource("/images/libros.png")));
		frame.setBounds(100, 100, 769, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton B1 = new JButton("Devolver");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Devolver obj1 = new Devolver(j1);
				frame.setVisible(false);
			}
		});
		B1.setBounds(89, 225, 133, 61);
		frame.getContentPane().add(B1);

		JButton B2 = new JButton("Tomar prestado");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tomar obj1 = new Tomar(j1);
				frame.setVisible(false);
			}
		});
		B2.setBounds(519, 225, 144, 61);
		frame.getContentPane().add(B2);

		JLabel LB2 = new JLabel("Biblioteca municipal");
		LB2.setFont(new Font("Comic Sans MS", Font.BOLD, 44));
		LB2.setForeground(Color.PINK);
		LB2.setBackground(SystemColor.activeCaptionBorder);
		LB2.setBounds(150, 75, 525, 50);
		frame.getContentPane().add(LB2);

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBackground(SystemColor.activeCaptionBorder);
		textField.setBounds(107, 75, 516, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Usuarios");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuarios obj3 = new Usuarios(j1);
				frame.setVisible(false);

			}
		});
		btnNewButton.setBounds(303, 225, 144, 61);
		frame.getContentPane().add(btnNewButton);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Grafico.class.getResource("/images/libro.jpg")));
		lblNewLabel.setBounds(0, 0, 753, 474);
		frame.getContentPane().add(lblNewLabel);

	}

	public JFrame XD() {
		return frame;
	}
}
