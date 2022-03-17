package paquete;

import java.util.ArrayList;
import java.util.Arrays;

public class Array3 {
	public static void main(String[] args) {
	    ArrayList<int[]> arrList = new ArrayList<int[]>();
	    int[] arr1 = {2, 4, 6};
	    int[] arr2 = {3, 6, 9};
	    int[] arr3 = {5, 10, 15};
	    arrList.add(arr1);
	    arrList.add(arr2);
	    arrList.add(arr3);
	    int[] arrAtIdx1 = arrList.get(1);
	    System.out.println("The Second array: " + Arrays.toString(arrAtIdx1));
	    int secondElement = arrAtIdx1[1];
	    System.out.println("Second Element " + secondElement);
	}
}
