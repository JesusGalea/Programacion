package ifarray;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media = 0;
		System.out.println("introduce el tamaño del array");
		int numeros[] = new int[sc.nextInt()];
		
		for (int i = 0 ; i < numeros.length; i++) {
			System.out.println("introduce un numero");
			numeros [i] = sc.nextInt();
			media = media + numeros[i];
		}
		
		System.out.println("la media es: " + (media/numeros.length));
		
	}

}
