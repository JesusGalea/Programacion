package archivos;
import javax.swing.*;
public class FirstSwingExample {

	public static void main(String[] args) {
 
		JFrame f = new JFrame();
		JButton b = new JButton("Darle una galletita a Sara");
		b.setBounds(130, 100, 200, 40);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
