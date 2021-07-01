package Logica;

public class Alumno extends Persona {

	// creamos sus atributos
	
	private String curso;
	private double nota;
	private int anio_cursa;
	
	
	// creamos su constructor vacio y con parametros
	
	public Alumno() {
		
	}



	public Alumno(String curso, double nota, int anio_cursa, String nombre, String apellido, int edad, String telefono) {
		super(nombre,apellido,edad,telefono);
		this.curso = curso;
		this.nota = nota;
		this.anio_cursa = anio_cursa;
	}


	// creamos sus getters y setters para acceder a sus metodos
	
	public String getCurso() {
		return curso;
	}



	public void setCurso(String curso) {
		this.curso = curso;
	}



	public double getNota() {
		return nota;
	}



	public void setNota(double nota) {
		this.nota = nota;
	}



	public int getAnio_cursa() {
		return anio_cursa;
	}



	public void setAnio_cursa(int anio_cursa) {
		this.anio_cursa = anio_cursa;
	}



	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", nota=" + nota + ", anio_cursa=" + anio_cursa + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
