package ifarray;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


        System.out.println("Introduzca numero por teclado ");

        int a = sc.nextInt();




    String con1,con2,con3,con4;

    con1 = (a>0)?"positivo, ": "negativo, ";

    con2 = (a%2==0)?"par, ": "impar, ";

    con3 = (a%5== 0)?"Multiplo de 5, ": "No multiplo de 5, ";

    con4 = (a<100)?"menor a 100, ": "mayor a 100, ";




        System.out.print(con1+con2+con3+con4);

	}

}
