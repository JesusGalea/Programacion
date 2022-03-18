package xml;

import javax.swing.*;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Main extends JFrame implements ActionListener {
	
	

	Container c1 = getContentPane();
	JButton b1 = new JButton("leer");
	JButton b2 = new JButton("nodos");
	JButton b3 = new JButton("Resetear");
	JButton b4 = new JButton("Resetear");
	JButton b5 = new JButton("Resetear");
	
	
	
	Main(){
		setLayoutManager();
		setLocationAndSize();
		addComponents();
		addActionEvent();
		
	}
	
	public void setLocationAndSize () {
		
		b1.setBounds(50,300,100,30);
		b2.setBounds(200,300,100,30);	
		b3.setBounds(200,200,100,30);	
		b4.setBounds(100,100,100,30);	
		b5.setBounds(200,150,100,30);	
	}
	
	public void setLayoutManager() {
		c1.setLayout(null);
	}
	
	public void addComponents() {
		
		c1.add(b1);
		c1.add(b2);
		c1.add(b3);
		c1.add(b4);
		c1.add(b5);
	}
	
	public void addActionEvent() {
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		
		Main ej = new Main();
		ej.setTitle("XML");
		ej.setBounds(10,10,370,600);
		ej.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ej.setResizable(false);
		ej.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
	
		if (e.getSource() == b1) {
			XML1 x1 = new XML1();
			x1.leer();
			}
			
		if (e.getSource() == b2) {
			XML2 x2 = new XML2();
			try {
				x2.nodos();
			} catch (ParserConfigurationException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SAXException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			
		}
		
	}


