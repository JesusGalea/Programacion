package paquete;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {
	public static void main(String[] args) {
	    //ArrayList no se indica el tipo de datos
	    //(String, Integer, char, float, ...)

	    //ArrayList<Integer> a = new ArrayList<Integer>();

	    ArrayList a = new ArrayList();
	    a.add("Palabras");
	    a.add(4);
	    a.add('a');
	    a.add(23.5);
	    ArrayList lista = new ArrayList();
	    //instanciamos el objeto lista de arraylist
	    lista.add("hola");
	    lista.add(new Integer(6));


	    //tamaño , añadir y obyrnrt ArrayList
	    System.out.println("Añadiendo: " + lista.add("adios"));
	    System.out.println("Tamaño: " + lista.size());
	    System.out.println("Get: " + a.get(3));
	    //remove
	    System.out.println("Remove: " + lista.remove(0));
	    System.out.println("Tamaño: " + lista.size());
	    //indexof la celda en la que esta situado dentro del array
	    System.out.println("indexof: " + lista.indexOf(6));
	    //clear
	    lista.clear();
	    lista.add("hola");
	    lista.add("adios");
	    //sustituir indice, "valor"
	    lista.set(1, "chao");
	    System.out.println("get: " + lista.get(1) );
	    //comprobar
	    System.out.println("Contains: " + lista.contains("chao"));
	    //ultima posicion
	    System.out.println("LastIndexOf " + lista.lastIndexOf("chao"));
	    //saber si esta vacia
	    System.out.println("Esta vacia: " + lista.isEmpty());
	    //Recorrer ArrayList mode1
	    for(int i=0; i<lista.size(); i++) {
	        System.out.println(lista.get(i));
	    }
	    //recorrer arraylist mode2
	    for(Object i:lista) {
	        System.out.println(i);
	    }
	    //recorrer arraylist mode3
	    Iterator it = lista.iterator();
	    while(it.hasNext()) {
	        System.out.println(it.next());
	    }

	}
	}

