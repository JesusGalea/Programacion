package ejarray;

import java.util.Random;
import java.util.Scanner;

public class EJ2 {
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Introduce tamaño del array");
		
		int JGA[] = new int[sc.nextInt()];

	}
	
	public static void rellenar(int a, int b[]) {
		Random JGr = new Random();
		for ( int k = 0; k < b.length; k++) {
			b[k] = JGr.nextInt(a);
		}
	}
	
	public static void leer(int a[]) {
		int total = 0;
		for (int k = 0; k<a.length; k++) {
			System.out.println("posición " + (k+1) + " " + a[k]);
			total = total + a[k];
		}
		System.out.println("total: " + total);
	}

}
