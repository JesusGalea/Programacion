package ifarray;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		int pares[] = new int[20];
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		int numero = 0;
		do {
			System.out.println("introduce un numero");
			numero = sc.nextInt();
			if (numero%2 ==0) {
				pares[contador] = numero;
				contador++;
				numero = 0;
			}
			
		} while (contador < 20);
		System.out.println("los pares son: ");
		for (int e = 0; e < pares.length; e++) {
			System.out.print(pares[e]+ "\t");
		}
	}

}
