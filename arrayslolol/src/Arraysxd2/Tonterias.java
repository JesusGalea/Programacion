package Arraysxd2;

import java.util.ArrayList;

public class Tonterias extends Persona{
	public static void main(String args[]) {
		Persona obj1 = new Persona();
		Persona obj2 = new Persona("Jose", 25);
		ArrayList<Persona> arr1 = new ArrayList();
		arr1.add(obj1);
		arr1.add(obj2);
		int suma = 0;
		String nombre = "";
		for(int i=0; i<arr1.size();i++) {
			arr1.get(i).getEdad();
			if(arr1.get(i).getEdad()>suma) {
				suma = arr1.get(i).getEdad();
				nombre = arr1.get(i).getNombre();
			}
			
		}
		
		System.out.println("La mayor edad es: " + suma+  " y su nombre es: "+ nombre);
		
	
	}
	
	
	

}
