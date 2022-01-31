package ifarray;

import java.util.Scanner;

public class Array5 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int [10];
        int ceros = 0;
        int pos = 0;
        int neg = 0;

        for (int i = 0; i<num.length; i++) {
            System.out.println("mete un numero");
            num[i] = sc.nextInt();

             if (num[i] < 0) {
                 neg++;
             } else if (num[i] > 0) {
                 pos++;
             } else {
                 ceros++;
             }

        }
    System.out.println("hay " + pos + " numeros positivos " + neg + " negativos " + ceros + " ceros");

    }

}

