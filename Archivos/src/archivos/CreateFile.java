package archivos;
import java.io.*;

public class CreateFile {

	public static void main(String[] args) {
		// averiguar si un archivo existe o no
try {
	File file = new File("record.txt");
	if (file.createNewFile()) {
		System.out.println("New file is created");
	} else {
		System.out.println("File already exists");
	}
} catch(IOException e) {
	e.printStackTrace();
}

	}

}
