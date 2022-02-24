package archivos;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Galleta {

	public static void main(String[] args) {

		JFrame f = new JFrame ("galleta de los webo");
		JButton button = new JButton ("te hago galleta?");
		
		
		f.setSize(300,200);
		f.add(button);
		
		f.setVisible(true);
		
		button.addActionListener(new ActionListener() {
			
			
		
			public void actionPerformed(ActionEvent e) {
				System.out.println("galleteao");
				
		
			}
	});
	}		
}
