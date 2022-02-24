package jframe;




	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	public class EJ2 extends JFrame implements ActionListener {
		
		

		Container c1 = getContentPane();
		JLabel Label1 = new JLabel("Numero 1");
		JLabel Label2 = new JLabel ("Numero 2");
		JLabel Label3 = new JLabel ("Numero 3");
		JLabel Label4 = new JLabel ("Numero 4");
		JTextField tf = new JTextField();
		JTextField tf2 = new JTextField();
		JTextField tf3 = new JTextField();
		JTextField tf4 = new JTextField();
		JButton b1 = new JButton("Calcular");
		
		EJ2(){
			setLayoutManager();
			setLocationAndSize();
			addComponents();
			addActionEvent();
			
		}
		
		public void setLocationAndSize () {
			Label1.setBounds(50,100,100,30);
			Label2.setBounds(50,150,100,30);
			Label3.setBounds(50,200,100,30);
			Label4.setBounds(50,250,100,30);
			tf.setBounds(150,100,150,30);
			tf2.setBounds(150,150,150,30);
			tf3.setBounds(150,200,150,30);
			tf4.setBounds(150,250,150,30);
			b1.setBounds(150,350,100,30);
												
		}
		
		public void setLayoutManager() {
			c1.setLayout(null);
		}
		
		public void addComponents() {
			c1.add(Label1);
			c1.add(Label2);
			c1.add(Label3);
			c1.add(Label4);
			c1.add(tf);
			c1.add(tf2);
			c1.add(tf3);
			c1.add(tf4);
			c1.add(b1);

		}
		
		public void addActionEvent() {
			b1.addActionListener(this);
		
		}
		
		public static void main(String[] args) {
			
			EJ2 ej2 = new EJ2();
			ej2.setTitle("calcular el menor");
			ej2.setBounds(10,10,370,600);
			ej2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ej2.setResizable(false);
			
			ej2.setVisible(true);
		}

		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource() == b1) {
				String s1;
				String s2;
				String s3;
				String s4;
				
				s1 = tf.getText();
				s2 = tf2.getText();
				s3 = tf3.getText();
				s4 = tf4.getText();
				
				int i,j, k , l = 0;
				
				i = Integer.parseInt(s1);
				j = Integer.parseInt(s2);
				k = Integer.parseInt(s3);
				l = Integer.parseInt(s4);
				
				int[] arrayTest;
				arrayTest = new int[4];
				
				arrayTest [0] = Integer.parseInt(s1);
				arrayTest [1] = Integer.parseInt(s2);
				arrayTest [2] = Integer.parseInt(s3);
				arrayTest [3] = Integer.parseInt(s4);
				int menor = arrayTest[0];
				
				
				for (int m = 0; m<arrayTest.length ;m++) {
					
					if(arrayTest[m] < menor) {
						menor = arrayTest[m];
					}
				}
				
				System.out.println("el valor menor es: " + menor);
			}
			
		}

	}
