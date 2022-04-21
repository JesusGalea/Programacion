package xd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sumatoria extends JFrame {

	private JPanel contentPane;
	private JTextField TF2;
	private JTextField TF1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sumatoria frame = new Sumatoria();
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
	public Sumatoria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LB1 = new JLabel("Ingresa el primer valor: ");
		LB1.setBounds(34, 73, 122, 14);
		contentPane.add(LB1);
		
		JLabel LB2 = new JLabel("Ingresa el segundo valor: ");
		LB2.setBounds(34, 114, 137, 14);
		contentPane.add(LB2);
		
		JLabel LB3 = new JLabel(" ");
		LB3.setBounds(291, 158, 46, 14);
		contentPane.add(LB3);
		
		TF1 = new JTextField();
		TF1.setBounds(183, 70, 86, 20);
		contentPane.add(TF1);
		TF1.setColumns(10);
		
		TF2 = new JTextField();
		TF2.setBounds(183, 111, 86, 20);
		contentPane.add(TF2);
		TF2.setColumns(10);
		
		
		JButton B = new JButton("Sumar");
		B.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == B) {
					
					int num1=Integer.parseInt(TF1.getText());
		            int num2=Integer.parseInt(TF2.getText());
		            int suma=num1 + num2;
		            LB3.setText(String.valueOf(suma));
					
					
					
					
				}
			}
		});
		B.setBounds(183, 154, 89, 23);
		contentPane.add(B);
		
	
	}
}
