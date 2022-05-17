package builder.clasesActividad1;

import java.util.Scanner;
/**
*
* @author  sara jordana
*/

public class Ejercicio2 {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int i;
        int[] numeros = new int[10];
        double media = 0;

        
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numero " + i + " = ");
            numeros[i] = sc.nextInt();
        }
        
    
        for (i = 0; i < numeros.length; i++) {
            if (i % 2 == 0){ 
                media = media + numeros[i]; 
            }
        }
        System.out.println("");
        
       
        System.out.println("Media de los números que están en posiciones pares: "+ media/5);              
    }
}
