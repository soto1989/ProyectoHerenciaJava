package Logica;


import java.util.List;
import java.util.Scanner;

public class Herencia {

	public static void main(String[] args) {

		/*******************************************************************************************************************************************************/
		
		// REALIZAMOS EL PROGRAMA COMPLETO DE DAR DE ALTA UN PROFESOR Y UN ALUMNO Y VER SUS DATOS. LAS ENTIDADES O CLASES SON PERSONA (CLASE PADRE), PROFESOR Y  
		// ALUMNO (CLASES HIJAS). APLIQUE  EN ESTE PROGRAMA HERENCIA Y  ENCAPSULAMIENTO. APLIQUE TAMBIEN BUCLES (FOR, DO-WHILE) Y LA SENTENCIA SWITCH.
		
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		// Realizar Menu para que el profe elija una opcion
	

		String respuesta = "si";	// variable local para realizar la condicion
		
		// Elegi el metodo do-while porque asi siempre que el profe coloque que quiere seguir cargando datos le aparezca el menu aunque sea una vez
		
		do {
			System.out.println("                         MENU PRINCIPAL");
			System.out.println("***************************************************************************");	
			System.out.println("1-Dar De Alta Profesor		");
			System.out.println("2-Dar de Alta Alumnos		");
			System.out.println("0-Salir		");
			System.out.println("\n");
			System.out.println("***************************************************************************");
			System.out.println("Elija una opcion: ");
			opcion = sc.nextInt();
			
		// realizamos un SWITCH para que el profesor elija la opcion deseada y el switch se acopla muy bien a este caso	
		switch (opcion) {

		case 0:
			System.out.println("Esta seguro que quiere salir?");
			respuesta = sc.next();
			break;

		case 1:
			Profesor profe = new Profesor();

			System.out.println("Ingrese nombre del profesor: ");
			profe.setNombre(sc.next());
			System.out.println("Ingrese apellido del profesor: ");
			profe.setApellido(sc.next());
			System.out.println("Ingrese la edad del profesor: ");
			profe.setEdad(sc.nextInt());
			System.out.println("Ingrese el telefono del profesor: ");
			profe.setTelefono(sc.next());
			System.out.println("Ingrese la matricula  del profesor: ");
			profe.setMatricula(sc.nextInt());
			System.out.println("Ingrese el curso al cual da de alta  al profesor: ");
			profe.setCurso(sc.next());

			System.out.println("los datos del profesor son:: " + "Nombre Completo: "+profe.getNombre() + " " + profe.getApellido() + ", su edad es "
					+ profe.getEdad() + "años, su Matricula es  " + profe.getMatricula() + "y el curso que se le asgno es:  " + profe.getCurso());
			
			System.out.println("Quiere salir del programa: ");
			respuesta = sc.next();
			
			

			break;

		case 2:

			// damos de alta al alumno

			Alumno alumno[] = new Alumno[2];

			// Le solicito al profesor cuantos alumnos va a dar de alta

			int cant_alum;
			System.out.println("Cuantos alumnos va a dar de alta: ");
			cant_alum = sc.nextInt();

			// Realizo el bucle para cargar los datos del Alumno a crear

			for (int i = 0; i < cant_alum; i++) {

				System.out.println("Ingrese el nombre del alumno: ");
				String nombre = sc.next();
				System.out.println("Ingrese el apellido del alumno: ");
				String apellido = sc.next();
				System.out.println("Ingrese la edad del alumno: ");
				int edad = sc.nextInt();
				System.out.println("Ingrese el telefono de contacto del alumno: ");
				String telefono = sc.next();
				System.out.println("Ingrese el curso al cual se anoto el alumno: ");
				String curso = sc.next();
				System.out.println("Ingrese la nota del alumno: ");
				int nota = sc.nextInt();
				System.out.println("Ingrese el año que esta cursando el alumno: ");
				int anio_cursa = sc.nextInt();

				// creo al alumno
				alumno[i] = new Alumno(curso, nota, anio_cursa, nombre, apellido, edad, telefono);

			}

			// Muestro los alumnos Ingresados y sus datos

			for (int i = 0; i < alumno.length; i++) {

				System.out.println("El nombre completo del alumno es: " + alumno[i].getNombre() + " "
						+ alumno[i].getApellido() + ", tiene " + alumno[i].getEdad() + ", Su telefono Particular es "
						+ alumno[i].getTelefono() + ", cursa la materia " + alumno[i].getCurso()
						+ ", y su nota de Diagnostico fue de  " + alumno[i].getNota() + ", por tal motivo cursa  "
						+ alumno[i].getAnio_cursa()

				);
			}
			
			System.out.println("Quiere salir del programa: ");
			respuesta = sc.next();

			break;

		}
		
		}while(respuesta.equals("no"));

		
		/******************************************************************************************************************************************************/		
		/*****************************************************************************************************************************************************/
		// DAMOS DE ALTA AL PROFESOR

		/*
		 * Profesor profe = new Profesor();
		 * 
		 * 
		 * 
		 * 
		 * System.out.println("Ingrese nombre del profesor: ");
		 * profe.setNombre(sc.next());
		 * System.out.println("Ingrese apellido del profesor: ");
		 * profe.setApellido(sc.next());
		 * System.out.println("Ingrese la edad del profesor: ");
		 * profe.setEdad(sc.nextInt());
		 * System.out.println("Ingrese el telefono del profesor: ");
		 * profe.setTelefono(sc.next());
		 * System.out.println("Ingrese la matricula  del profesor: ");
		 * profe.setMatricula(sc.nextInt());
		 * System.out.println("Ingrese el curso al cual da de alta  al profesor: ");
		 * profe.setCurso(sc.next());
		 * 
		 * 
		 * System.out.println("los datos del profesor son:: "+ profe.getNombre()+" "+
		 * profe.getApellido()+" "+ profe.getEdad() +" "+
		 * profe.getMatricula()+" "+profe.getCurso());
		 */
		/****************************************************************************************************************************************************/
		// DAMOS DE ALTA AL ALUMNO

		/*
		 * Alumno alumno[] = new Alumno[2];
		 * 
		 * // Le solicito al profesor cuantos alumnos va a dar de alta
		 * 
		 * int cant_alum; System.out.println("Cuantos alumnos va a dar de alta: ");
		 * cant_alum = sc.nextInt();
		 * 
		 * // Realizo el bucle para cargar los datos del Alumno a crear
		 * 
		 * for (int i = 0; i < cant_alum; i++) {
		 * 
		 * System.out.println("Ingrese el nombre del alumno: "); String nombre =
		 * sc.next(); System.out.println("Ingrese el apellido del alumno: "); String
		 * apellido = sc.next(); System.out.println("Ingrese la edad del alumno: "); int
		 * edad = sc.nextInt();
		 * System.out.println("Ingrese el telefono de contacto del alumno: "); String
		 * telefono = sc.next();
		 * System.out.println("Ingrese el curso al cual se anoto el alumno: "); String
		 * curso = sc.next(); System.out.println("Ingrese la nota del alumno: "); int
		 * nota = sc.nextInt();
		 * System.out.println("Ingrese el año que esta cursando el alumno: "); int
		 * anio_cursa = sc.nextInt();
		 * 
		 * // creo al alumno alumno[i] = new Alumno(curso, nota, anio_cursa, nombre,
		 * apellido, edad, telefono);
		 * 
		 * 
		 * }
		 * 
		 * // Muestro los alumnos Ingresados y sus datos
		 * 
		 * for (int i = 0; i < alumno.length; i++) {
		 * 
		 * System.out.println("El nombre completo del alumno es: " +
		 * alumno[i].getNombre() + " " + alumno[i].getApellido() + ", tiene " +
		 * alumno[i].getEdad() + ", Su telefono Particular es " +
		 * alumno[i].getTelefono() + ", cursa la materia " + alumno[i].getCurso() +
		 * ", y su nota de Diagnostico fue de  " + alumno[i].getNota() +
		 * ", por tal motivo cursa  " + alumno[i].getAnio_cursa()
		 * 
		 * ); }
		 */

	}

}
