package xd;

public class POOHerenciaPolimorfismo {
	static String titulo;
	static String autor;
	
	POOHerenciaPolimorfismo(String t, String a) {
		
		titulo = t;
		autor = a;
		
	}
	public static void main(String[] args) {
		
	}
	public void setTitulo (String t) {
		titulo = t;
	}

	public void setAutor (String a) {
		
	}
	public String getTitulo () {
		return titulo;
	}
	public String getAutor () {
		return autor;
	}
}
