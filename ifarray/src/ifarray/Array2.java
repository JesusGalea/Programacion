package ifarray;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {

		
			Scanner sc = new Scanner(System.in);
			double pares = 0;
			int contador = 0;
			double numeros[] = new double[10];
			
			for (int i = 0 ; i < numeros.length; i++) {
				System.out.println("introduce un numero");
				numeros [i] = sc.nextDouble();
				if (numeros[i]%2 ==0) {
					pares = pares + numeros[i];
					contador++;
				}
			}
			
			System.out.println("la media de los numeros pares es: " + (pares/contador));
			
		}
	

	}


