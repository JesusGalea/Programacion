package ejarray;

public class EJ4 {

	public static void main(String[] args) {
		
		int [] cien = new int[100];
		int suma = 0;
		int mayor = 0;
		
		for (int i = 0 ; i < cien.length; i++) {
			cien[i] = (i+1);
			suma = suma + (i+1);
			if (mayor < i) {
				mayor = i+1;
			}
		}
		
		System.out.println("valor mayor: " + mayor);
		System.out.println("media: " + (suma/cien.length));
		System.out.println("total: " + suma);
		
		
	}

}
