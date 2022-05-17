package builder.clasesActividad1;
import java.util.Scanner;

/**
*
* @author  Sara Jordana
*/

public class Ejercicio1 {

	 public static void main(String[] args) {
	        
		 Scanner sc = new Scanner(System.in);
		 int i;
		 int positivo = 0, negativo = 0; 
		 int[] numeros = new int[10];
		 double sumaPositivo = 0, sumaNegativo = 0;                  
	        
	
		 System.out.println("Lectura de los elementos del array: ");
		 	for (i = 0; i < numeros.length; i++) {
	            System.out.print("numero " + i + " = ");
	            numeros[i]=sc.nextInt();
	        }

	      
	        for (i = 0; i < numeros.length; i++) {
	            if (numeros[i] > 0){
	                sumaPositivo += numeros[i];
	                positivo++;
	            } else if (numeros[i] < 0){ 
	                sumaNegativo += numeros[i];
	                negativo++;
	            }
	        }

	        if (positivo != 0) {
	            System.out.println("Media de los valores positivos: " + sumaPositivo / positivo);                
	        } else {
	            System.out.println("No has introducido números positivos");
	        }
	        if (negativo != 0) {
	            System.out.println("Media de los valores negativos: " + sumaNegativo / negativo);
	        } else {
	            System.out.println("No has introducido números negativos");
	        }
	    }
	}
