package poo;

public class Main {

	public static void main(String[] args) {
		AlumnoRegular pepe = new AlumnoRegular();

		pepe.setNombre("Pepe");

		pepe.setClase("Biologia,matematicas");

		pepe.setGrado(2);

		pepe.setGrupo('G');

		pepe.irClase();

	    AlumnoIntercambio luis = new AlumnoIntercambio("Luis","Fisica,Ecologia",3,'B');

		luis.irClase();

		luis.estudiar();

		luis.irClase();



	}

}
