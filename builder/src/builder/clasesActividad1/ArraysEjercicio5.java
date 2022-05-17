package builder.clasesActividad1;

import java.util.Scanner;

public class ArraysEjercicio5 {
/**
 * 
 * @author sara
 */
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int positivo = 0, negativo = 0, cero = 0; 
        int i;
       
                                                    
        System.out.println("Introduce 10 números: ");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("numero[" + i + "]= ");
            numeros[i] = sc.nextInt();
        }     
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivo++;
            } else if (numeros[i] < 0) {
                negativo++;
            } else {
                cero++;
            }
        }
  
        System.out.println("Positivos: " + positivo);                                                                  
        System.out.println("Negativos: " + negativo);
        System.out.println("Ceros: " + cero);
    }
}
