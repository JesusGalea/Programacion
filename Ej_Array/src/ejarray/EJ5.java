package ejarray;

import java.util.ArrayList;
import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("introduce tu mensaje");
		String mensaje = new String(sc.next());
	     ArrayList<Character> sample = new ArrayList<Character>();
	     for(int i = 0; i<mensaje.length(); i++){
	         sample.add(mensaje.charAt(i));
	     }
	}

}
