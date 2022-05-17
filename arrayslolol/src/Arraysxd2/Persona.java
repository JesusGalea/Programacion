package Arraysxd2;

public class Persona {
	String nombre = "Carlos";
	int edad = 20;
	
	Persona(){
		
	}
	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}

}
