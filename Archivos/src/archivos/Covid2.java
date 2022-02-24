package archivos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Covid2 extends JFrame implements ActionListener {
	
	

	Container c1 = getContentPane();
	JLabel Label1 = new JLabel("Sevilla");
	JLabel Label2 = new JLabel ("Huelva");
	JTextField tf = new JTextField();
	JTextField tf2 = new JTextField();
	JButton b1 = new JButton("Calcular");
	JButton b2 = new JButton("Resetear");
	
	Covid2(){
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
		
		Covid2 uwu2 = new Covid2();
		uwu2.setTitle("ojala morirme");
		uwu2.setBounds(10,10,370,600);
		uwu2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		uwu2.setResizable(false);
		
		uwu2.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == b1) {
			String s1;
			String s2;
			
			s1 = tf.getText();
			s2 = tf2.getText();
			
			// modo profesional
//			
//			ArrayList<String> arrayTest2 = new ArrayList<String>();
//			arrayTest2.add(s1);
//			arrayTest2.add(s2);
//			
//			System.out.println("ArrayList: " + arrayTest2.get(0));
//			System.out.println("ArrayList: " + arrayTest2.get(1));
//			
			//modo basico
			
			int i,j = 0;
			
			i = Integer.parseInt(s1);
			j = Integer.parseInt(s2);
			
			int[] arrayTest;
			arrayTest = new int[2];
			
			arrayTest [0] = Integer.parseInt(s1);
			arrayTest [1] = Integer.parseInt(s2);
			
			int media = 0, mayor = 0;
			
			
			for (int k = 0; k<=1;k++) {
				media += arrayTest[k];
				
				if(arrayTest[k] > mayor) {
					mayor = arrayTest[k];
				}
			}
			
			System.out.println("el valor mayor es: " + mayor);
		}
		
	}

}
