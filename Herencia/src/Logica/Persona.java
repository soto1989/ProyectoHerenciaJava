package Logica;

public class Persona {
	
	// creamos los atributos de la clase Persona (sus caractersticas)
	
	protected String nombre;
	protected String apellido;
	protected int edad;
	protected String telefono;
	
	
	// creamos el contructor vacio y con parametros
	
	public Persona() {		// constructor vacio 
		
	}


	public Persona(String nombre, String apellido, int edad, String telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.telefono = telefono;
	}


	// Generamos los getters y los setters que nos ayudan a obtener y setear los atributos de persona
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", telefono=" + telefono
				+ "]";
	}
	
	
	

}
