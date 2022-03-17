package ejarray;

import java.util.Scanner;

public class EJ6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[20];
		int ceros = 0;
		int positivos = 0;
		int negativos= 0;
		System.out.println("introduce 20 numeros");
		for (int i = 0; i<num.length; i++) {
			num[i] = sc.nextInt();
			if (num[i]> 0) {
				positivos = positivos + 1;
			} else if (num[i] == 0) {
				ceros = ceros + 1;
			} else {
				negativos = negativos + 1;
			}
		}
		System.out.println("negativos: " + negativos);
		System.out.println("positivos: " + positivos);
		System.out.println("ceros: " + ceros);
		
	}

}
