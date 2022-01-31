package ifarray;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


        System.out.println("Introduzca numero por teclado ");

        int num = sc.nextInt();

    String par = "par", impar = "impar";

    String c;

    c = (num%2 == 0)?par: impar;


        System.out.println(c);
    }


	}


