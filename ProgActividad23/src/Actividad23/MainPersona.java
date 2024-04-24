package Actividad23;

import java.util.HashMap;
import java.util.Scanner;

public class MainPersona {

	public static void main(String[] args) {
		/*
		 * 2. Hacer un programa que guarde objetos de tipo persona en una estructura
		 * HashMap. El valor será un objeto de tipo Persona y la clave será el nombre de
		 * la persona. Los objetos tendrán un nombre, una edad y un peso con estructura
		 * JavaBean. El programa dará las siguientes opciones:
		 * 
		 * 1. Introducir Persona.
		 * 
		 * 2. Mostrar Personas.
		 * 
		 * 3. Buscar persona por nombre.
		 * 
		 * 3. Salir del programa.
		 * 
		 * En caso de que se vaya a introducir una persona con el mismo nombre, hay que
		 * avisar al usuario de que se va a sobrescribir y nos tiene que confirmar con
		 * un "y" o "n".
		 */

		HashMap<String, Double> hashmapPersonaNombre = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		while (menu(sc) != 4) {

			while (menu(sc) == 1) {
				
			}
		}

		System.out.println("Introduce el nombre del contacto y el número de teléfono");
		for (int i = 0; i < 5; i++) {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Telefono: ");
			numeroTelefono = sc.nextLine();

			hashmapNombreNumero.put(nombre, numeroTelefono);

			hashmapNombreNumero.forEach((k, v) -> {
				System.out.print("clave: " + k.toString());
				System.out.println(" | valor: " + v.toString());
			});
		}
	}

	public static int menu(Scanner sc) {
		System.out.println("Elige una opcion: ");
		System.out.println("1. Introducir Persona.");
		System.out.println("2. Mostrar Personas.");
		System.out.println("3. Buscar persona por nombre.");
		System.out.println("4. Salir del programa.");

		int opcion = sc.nextInt();
		return opcion;
	}

}
