package xd;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Embalse extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Embalse frame = new Embalse();
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
	public Embalse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner SP1 = new JSpinner();
		SP1.setBounds(40, 48, 59, 20);
		contentPane.add(SP1);
		
		JSpinner SP2 = new JSpinner();
		SP2.setBounds(40, 93, 59, 20);
		contentPane.add(SP2);
		
		JSpinner SP3 = new JSpinner();
		SP3.setBounds(40, 148, 59, 20);
		contentPane.add(SP3);
		
		JLabel LB1 = new JLabel("Compuerta 1");
		LB1.setBounds(121, 51, 87, 14);
		contentPane.add(LB1);
		
		JLabel LB2 = new JLabel("Compuerta 2");
		LB2.setBounds(121, 96, 87, 14);
		contentPane.add(LB2);
		
		JLabel LB3 = new JLabel("Compuerta 3");
		LB3.setBounds(121, 151, 87, 14);
		contentPane.add(LB3);
		
		JLabel LB4 = new JLabel("Resultado: ");
		LB4.setBounds(195, 208, 69, 14);
		contentPane.add(LB4);
		
		JLabel LB5 = new JLabel("");
		LB5.setBounds(278, 208, 59, 14);
		contentPane.add(LB5);
		
		JButton B1 = new JButton("Actualizar caudal");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1=Integer.parseInt(SP1.getValue().toString());
                int num2=Integer.parseInt(SP2.getValue().toString());
                int num3=Integer.parseInt(SP3.getValue().toString());
                
                int suma=num1+num2+num3;
                if (suma<=100)
                    LB5.setText("Bajo");
                else
                    if (suma<=200)
                        LB5.setText("Medio");
                    else
                        LB5.setText("Alto"); 
			}
		});
		B1.setBounds(40, 204, 145, 23);
		contentPane.add(B1);
	}
}
