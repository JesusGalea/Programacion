package ifarray;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media = 0;

		double numeros[] = new double[10];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduce una nota");
			numeros[i] = sc.nextDouble();
			media = media + numeros[i];
		}
		media = media / numeros.length;
		System.out.println("la nota media es: " + media);
		System.out.println("las notas por encima de la media son: ");
		for (int j = 0; j < numeros.length; j++) {
			if (numeros[j] > media) {
				System.out.println(numeros[j]);
			}
		}
	}

}
