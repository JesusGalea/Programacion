package ejarray;

import java.util.Scanner;

public class EJ7 {

	public static void main(String[] args) {
		Scanner sci = new Scanner(System.in);
		Scanner scd = new Scanner(System.in);
		
		System.out.println("introduce el numero de personas");
		
		double [] d = new double[sci.nextInt()];
		
		for (int i = 0; i < d.length; i++) {
			System.out.println("introduce la altura de la persona nº " + (i+1));
			d[i] = scd.nextDouble();
		}
	}

}
