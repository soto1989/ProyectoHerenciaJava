package Logica;

public class Profesor extends Persona {
	
	// creamos sus atributos 
	
	private int matricula;
	private String curso;
	
	// creamos su constructor vacio y con parametros
	public Profesor() {
		
	}


	public Profesor(int matricula, String curso, String nombre, String apellido, int edad, String telefono) {
		super(nombre,apellido,edad,telefono);
		this.matricula = matricula;
		this.curso = curso;
	}


	// creamos sus getters y setters para poder acceder a sus metodos
	
	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}


	@Override
	public String toString() {
		return "Profesor [matricula=" + matricula + ", curso=" + curso + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", telefono=" + telefono + "]";
	}




	


	
	



	
	
	
	

}
