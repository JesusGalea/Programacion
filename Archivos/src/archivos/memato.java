package archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class memato {
    public static void main(String[] args) throws Exception{
        FileWriter writer = new FileWriter("C://file1.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Contenido del archivo");
        buffer.close();
        System.out.println("Sucess");
    }

}