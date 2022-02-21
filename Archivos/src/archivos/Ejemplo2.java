package archivos;

import javax.swing.*;
import java.awt.event.*;

public class Ejemplo2 extends JFrame implements ActionListener {

	JButton boton2;
	JButton boton1;
	JButton boton3;
	String titulo1 = "titulo";
	JLabel l1;

	public Ejemplo2() {

		setLayout(null);

		setBounds(0, 0, 400, 200);

		setTitle(titulo1);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		l1 = new JLabel("Programacion dan");
		l1.setBounds(10, 20, 300, 30);
		add(l1);

		boton1 = new JButton("1");
		boton1.setBounds(10, 120, 50, 30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("2");
		boton2.setBounds(180, 120, 50, 30);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("3");
		boton3.setBounds(330, 120, 50, 30);
		add(boton3);
		boton3.addActionListener(this);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Ejemplo2();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton1) {
			titulo1 = "alvaro parguela";
		}
		if (e.getSource() == boton2) {
			titulo1 = "alvaro parguela 2 ";

		}
		if (e.getSource() == boton3) {
			titulo1 = "alvaro parguela 3";
		}
	}
}
