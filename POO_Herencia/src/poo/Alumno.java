package poo;

public class Alumno {
String Nombre;
String Clase;
int Grado; 
char Grupo;

public Alumno() {
 Nombre = "Alumnos";
 Clase = "Mates";
 Grado = 1; 
 Grupo = 'A';
}

public Alumno(String a, String b, int c, char d) {
	 Nombre = a;
	 Clase = b;
	 Grado = c; 
	 Grupo = d;
	}

public String getNombre(){
	return Nombre;
}

public String getClase(){
	return Clase;
}

public int getGrado(){
	return Grado;
}

public char getGrupo(){
	return Grupo;
}

public void setNombre(String a) {
	Nombre = a;
}

public void setClase(String b) {
	Clase = b;
}
public void setGrado(int c) {
	Grado = c;
}
public void setGrupo(char d) {
	Grupo = d;
}

public void estudiar() {
	System.out.println("estoy estudiando");
}
public void irClase() {
	System.out.println("yendo a clase");
}
}
