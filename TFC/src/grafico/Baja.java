package grafico;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Baja extends Grafico {

	private JFrame frameito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Baja window = new Baja();
					window.frameito.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Baja() {
		initialize();
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
