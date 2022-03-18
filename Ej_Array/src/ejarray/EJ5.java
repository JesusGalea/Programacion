package ejarray;


import java.util.Scanner;

public class EJ5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce tu mensaje");
		String mensaje = new String(sc.nextLine());
		char[] c = mensaje.toCharArray();
	     
	    
	   for (int i = 0 ; i < c.length; i++) {
		   System.out.println(c[i]);
	   }
	   
	     
	}

}
