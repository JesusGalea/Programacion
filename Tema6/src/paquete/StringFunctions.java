package paquete;

import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
		// Transformar datos antes de BBDD, XML, Texto, ..
		
		String valueString = "   DAM 2021-2022   ";
		
		System.out.println("Valor Inicial: " + valueString);
		System.out.println("Cantidad de Caracteres: " + valueString.length());
		System.out.println("Minusculas: " + valueString.toLowerCase());
		System.out.println("Mayusculas: " + valueString.toUpperCase());
		System.out.println("Quitar espacios laterales: " + valueString.trim());
		System.out.println("Caracter posicion 5: " + valueString.charAt(5));
		System.out.println("Concatenando: " + valueString.concat(" - Primero"));
		String s1 ="cadenagrande";
		System.out.println(s1.substring(2,4));
		System.out.println("Reemplazando contenido: " + valueString.replace('A', 'u'));
		System.out.println("Indice de caracter: " + valueString.indexOf('A'));
		
		// parseo
		
		int valor1 = 10;
		String str1 = String.valueOf(valor1);
		
		System.out.println("valueOf: " + str1);
		System.out.println("valueOf String: " + String.valueOf(valueString));
		
		String str2 = "12";
		int valor2 = Integer.parseInt(str2.trim());
		System.out.println("de String a int: " + valor2);
		
		String str3 = "12.35";
		double numdouble1 = Double.valueOf(str3.trim()).doubleValue();
		System.out.println("de string a double: " + numdouble1);
		
		char[] charArr = new char[]
				{'D', 'A', 'M', '2', '2'};
		
		System.out.println("From ArrayChat St: " + Arrays.toString(charArr));
	
		String s = "uno:dos:tres:cuatro";
		
		String[] v = s.split(":");
		
		for (int i = 0; i <v.length; i++) {
			System.out.println("Split : V["+i+"]:" + v[i]);
		}
		
	}
}
