package archivos;

import java.io.File;
import java.io.IOException;

public class Delete2 {
	private final static String File_Name = "record.txt";
	public static void main(String[] args) throws IOException {
		
		cleanUpFiles();
		}
	
	public static void cleanUpFiles() {
		File targetFile = new File(File_Name);
		targetFile.delete();
	}

}
