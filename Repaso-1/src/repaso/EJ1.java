package repaso;

import java.io.FileWriter;
import java.io.IOException;

public class EJ1 {

	public static void main(String[] args) throws IOException {
		
		
		String os = System.getProperty("os.name").toLowerCase();
		switch (os.charAt(0)) {
		case 'w': 
			FileWriter fw = new FileWriter("C:\\JavaSamples\\OSDetect.txt");
			fw.write("me quiero ir a mi casa");
			fw.close();
			break;
			
		case 'u':
			FileWriter fw2 = new FileWriter ("//users//file1.txt");
			fw2.write("me muero");
			fw2.close();
			break;
			
			
		case 'l':
			FileWriter fw3 = new FileWriter ("//users//file1.txt");
			fw3.write("me muero");
			fw3.close();
			break;

	}

}
}
