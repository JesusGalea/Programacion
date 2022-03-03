package ejarray;

import java.io.IOException;
import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) throws IOException {

		int ar[] = new int[15];
		rellenar(ar);
		leer(ar);

	}

	public static void rellenar(int a[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce 15 numeros");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	

	}
	
	public static void leer(int b[]) {
		
		for (int k = 0 ; k < b.length; k++) {
			System.out.println("posición " + (k+1)+ " " + b[k]);
		}
		
	}

}
