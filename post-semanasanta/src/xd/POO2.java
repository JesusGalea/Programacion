package xd;

public class POO2 extends POOHerenciaPolimorfismo {

	static int NumPagina = 0;
	
	POO2(String t, String a, int n) {
		super(t, a);
		NumPagina = n;
	}
	

	public static void main(String[] args)  {
		getData();

	}

	public static void getData () {
		System.out.println(titulo+ " " + autor + " " + NumPagina);
	}
	
}
