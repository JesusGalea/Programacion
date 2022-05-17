package builder.clasesActividad1;

import java.util.Scanner;

/**
 * 
 * @author Sara
 *
 */
public class ArraysEjercicio3 {

public static void main(String[]args) {
int media = 0;
Scanner sc = new Scanner (System.in);
int [] nota= new int[6] ;
int contador = 0;
int debajo=0;
int encima=0;
for(int i=0;i<nota.length;i++) {
	
		System.out.println("Por favor introduce una nota");
	   System.out.print("Alumno " + (i + 1) + " Nota final: ");
		nota[i]= sc.nextInt();
	
	if(nota[i]<=10)	{
		media= media+nota[i];	
		contador++;
		
}else {
	System.out.println("ERROR");
}
	
	
	
}
media = media/contador;
System.out.println("La media del grupo es: "+media);
for (int i=0; i < nota.length; i++) {
	if(nota[i]<media) debajo++; 
	if(nota[i]>media) {
		++encima;
		System.out.println("El alumno"+(i + 1) + "tiene una nota superior a la media "+nota[i]);
	}
 }
 System.out.println("Notas por encima de la media: "+ encima);
 System.out.println("Notas por debajo de la media: "+ debajo);
}     	


}		

