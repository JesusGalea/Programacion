package repaso;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ej2 {

	public static void main(String[] args) throws IOException {
		
		Reader reader = new FileReader ("C:\\JavaSamples\\OSDetect.txt");
		int data = reader.read();
		
		while (data != -1) {
			System.out.print((char)data);
			data = reader.read();
		} 
	
		

	}

}
