package files;

import java.io.FileWriter;
import java.io.IOException;

public class OSdetect {

	public static void main(String[] args) throws IOException {
		getOperatingSystem();

	}
	public static void getOperatingSystem() throws IOException {
		
		String os = System.getProperty("os.name").toLowerCase();
		switch (os) {
		case "windows": 
			FileWriter fw = new FileWriter("C:\\testout.txt");
			fw.write("me quiero ir a mi casa");
			fw.close();
			break;
			
		case "ubuntu":
			FileWriter fw2 = new FileWriter ("//users//file1.txt");

			//Windows
			// FileWriter fw = new FileWriter ("C:\\testout.txt");
			//Linux
			// FileWriter fw = new FileWriter ("//users//file1.txt")
			
			
		}
	}
}
