package jframe;

	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class EJ3 extends JFrame implements ActionListener {
		
		

		Container c1 = getContentPane();
		JLabel Label1 = new JLabel("Numero 1");
		JLabel Label2 = new JLabel ("Numero 2");
		JTextField tf = new JTextField();
		JTextField tf2 = new JTextField();
		JButton b1 = new JButton("Calcular");
		JButton b2 = new JButton("Resetear");
		
		EJ3(){
			setLayoutManager();
			setLocationAndSize();
			addComponents();
			addActionEvent();
			
		}
		
		public void setLocationAndSize () {
			Label1.setBounds(50,150,100,30);
			Label2.setBounds(50,220,100,30);
			tf.setBounds(150,150,150,30);
			tf2.setBounds(150,220,150,30);
			b1.setBounds(50,300,100,30);
			b2.setBounds(200,300,100,30);											
		}
		
		public void setLayoutManager() {
			c1.setLayout(null);
		}
		
		public void addComponents() {
			c1.add(Label1);
			c1.add(Label2);
			c1.add(tf);
			c1.add(tf2);
			c1.add(b1);
			c1.add(b2);
		}
		
		public void addActionEvent() {
			b1.addActionListener(this);
			b2.addActionListener(this);
		}
		
		public static void main(String[] args) {
			
			EJ3 ej = new EJ3();
			ej.setTitle("suma multi");
			ej.setBounds(10,10,370,600);
			ej.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ej.setResizable(false);
			ej.setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource() == b1) {
				String s1;
				String s2;
				
				s1 = tf.getText();
				s2 = tf2.getText();
				
				int i,j = 0;
				
				i = Integer.parseInt(s1);
				j = Integer.parseInt(s2);
				
				System.out.println("suma: " + (i+j));
				System.out.println("multiplicación: " + (i*j));
				
				
		
				
				
				
				}
				
				
			}
			
		}

	
