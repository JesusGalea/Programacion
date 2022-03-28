package tres;

import java.awt.TextArea;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.*;
public class Lista {

	public static void main(String[] args) {
		// Crear objeto de la App
		

		
	}

	class IHM3 {
		public IHM3() {
			
			TextArea miAreaTexto = new TextArea("",5,20, TextArea.SCROLLBARS_VERTICAL_ONLY);
			
			for (int i = 0; i<10; i++) {
				miAreaTexto.append("linea" + i+ "\n");
			}
			
			miAreaTexto.addTextListener(new MiTextListener(miAreaTexto));
			
			Frame f = new Frame("AWT");
			
			f.setLayout(new FlowLayout());
			f.add(miAreaTexto);
			f.setSize(250,150);
			f.setVisible(true);
			
		}
	}
		
		class MiTextListener implements TextListener {
			TextArea oAreaTexto;
			
			MiTextListener (TextArea iAreaTexto){
				oAreaTexto = iAreaTexto;
			}
		

	
		public void textValueChanged(TextEvent e) {
			System.out.println(oAreaTexto.getText());
			
		}
		
	//	class Conclusion3 extends 
	
}
}


