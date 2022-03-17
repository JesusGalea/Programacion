package paquete;

import java.util.Arrays;

public class Array1 {
	public static void main(String[] args) {
	    boolean[] boolArr = new boolean[] { true, true, false, true };
	    char[] charArr = new char[] { 'a', 'a', 's', 's', 's' };
	    int[] intArr = new int[] { 1, 2, 3, 4 };
	    double[] dblArr = new double[] { 1.2, 2.3, 3.9, 4.3 };
	    Object[] objArr = new Object[] { 1, 2, 3, 4 };
	    System.out.println("boolean array: " + Arrays.toString(boolArr));
	    System.out.println("Char array: " + Arrays.toString(charArr));
	    System.out.println("Char array: " + Arrays.toString(intArr));
	    System.out.println("Char array: " + Arrays.toString(objArr));
	    System.out.println("Char array: " + Arrays.toString(dblArr));
	}
	}

