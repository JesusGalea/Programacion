package builder.clasesActividad1;

import java.util.Scanner;
/**
 * 
 * @author Sara
 *
 */

public class ArraysEjercicio4 {

  public static void main(String[] args) {

	      
	        int i;
	        int contador = 2;

	        int[] pares = new int[10];

	        for (i = 0; i < pares.length; i++) {
	            pares[i] = contador;
	            contador += 2;
	        }
	       
	            //Mostrar el array
	        for (i = 0; i < pares.length; i++) {
	            System.out.println(pares[i]);
	        }
	    }
	
}
