package grafico;


import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Devolver extends Grafico{
	
	private JFrame frameito;
	

	public Devolver(Grafico frame) {
		initialize();
		frameito.setVisible(true);
	  	
	}
	
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameito = new JFrame();
		frameito.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
              XD().setVisible(true);
            }
        });
        frameito.setBounds(100, 100, 450, 300);
		frameito.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
