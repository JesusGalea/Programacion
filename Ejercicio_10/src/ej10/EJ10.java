package ej10;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// las opciones que tengo en este caso son archivo1.txt, archivo2.txt y
		// archivo3.txt
		
		System.out.println("introduce el nombre del archivo a leer");
		String leer = sc.next();
		Path ruta = (Path) Paths.get(leer);
		System.out.println("introduce la palabra a contar");
		String comp = sc.next();
		try {

			String l = Files.readString(ruta);
			String[] palabras = l.split(" ");

			int cont = 0;

			for (int i = 0; i < palabras.length; i++) {
				if (palabras[i].equals(comp)) {
					cont++;
				}
			}
			System.out.println("la palabra " + comp + " ha aparecido " + cont + " veces");
		} catch (Exception e) {

		}

	}

}
