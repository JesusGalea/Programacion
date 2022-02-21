package archivos;

import javax.swing.*;
import java.awt.event.*;

public class Ejemplo1 extends JFrame implements ActionListener {

	
		JButton boton2;
		JButton boton1;
		JButton boton3;
		JTextField jt;
		JLabel l1;
		
		public Ejemplo1() {
			
			setLayout(null);
			
			setBounds(0,0,450,350);
			 
			setTitle("Botón");
			
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			l1 = new JLabel ("Programacion dan");
			l1.setBounds(10,20,300,30);
			add(l1);
			
			
			
			boton1=new JButton("Finalizar");
			boton1.setBounds(300,250,100,30);
			add(boton1);
			boton1.addActionListener(this);
			
			boton2 = new JButton("Alvaro hace curry");
			boton2.setBounds(30, 250,200,30);
			add(boton2);
			boton2.addActionListener(this);
			
			boton3 = new JButton("idk");
			boton3.setBounds(30, 150, 100, 30);
			add(boton3);
			boton3.addActionListener(this);
			
			setVisible(true);
		}
		
		
	public static void main(String[] args) {
		new Ejemplo1();
	
	}
	
	public void actionPerformed(ActionEvent e) {
if (e.getSource()== boton1) {
	System.exit(0);
}
if (e.getSource()== boton2) {
	System.out.println("no vea lo weno que esta el curry del alvaro");

}
if (e.getSource() == boton3)  {
	DetectOSPRO xd = new DetectOSPRO();
	xd.main(null);
}
	}
	}
	


