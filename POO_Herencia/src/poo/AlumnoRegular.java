package poo;

public class AlumnoRegular extends Alumno {

	public void Matricularse() {
		System.out.println(this.Nombre + " se ha matriculado");
	}
	
	public void PagarInscripcion() {
		System.out.println(this.Nombre + "ha pagado la inscripcion");
	}
}
