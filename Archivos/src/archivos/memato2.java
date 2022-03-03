package archivos;

import java.io.BufferedReader;
import java.io.FileReader;

abstract


public class memato2 {
    public static void main(String[] args) throws Exception{
        FileReader reader = new FileReader("C://file1.txt");
        BufferedReader buffer = new BufferedReader(reader);
     
  int i;
  while ((i=buffer.read()) != -1) {
	  System.out.print((char)i);
  }
  buffer.close();
  reader.close();
  
    }

}
