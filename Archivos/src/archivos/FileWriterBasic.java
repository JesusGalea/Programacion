package archivos;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBasic {

	public static void main(String[] args) throws IOException  {
		FileWriter fw = new FileWriter("C:\\testout.txt");

		//Windows
		// FileWriter fw = new FileWriter ("C:\\testout.txt");
		//Linux
		// FileWriter fw = new FileWriter ("//users//file1.txt")
		
		fw.write("me quiero ir a mi casa");
		fw.close();
	}

}
