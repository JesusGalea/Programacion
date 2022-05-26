package grafico;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Devolver2 {
	static String username;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Devolver2 window = new Devolver2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Devolver2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel LB1 = new JLabel("Bienvenido/a " + username);
		LB1.setBounds(10, 80, 159, 14);
		frame.getContentPane().add(LB1);
	}
	
	 static void setName(String a) {
		username = a;
	}

}
