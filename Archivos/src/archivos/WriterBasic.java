package archivos;
import java.io.*;
public class WriterBasic {

	public static void main(String[] args) {
	
		try {
			Writer w = new FileWriter("file1.txt");
			String content = "arriba españa";
			w.write(content);
			w.close();
			System.out.println("done");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
