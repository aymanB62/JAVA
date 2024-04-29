package Actividad23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MainPersona {

	static Scanner sc = new Scanner(System.in);

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
		 * 4. Salir del programa.
		 * 
		 * En caso de que se vaya a introducir una persona con el mismo nombre, hay que
		 * avisar al usuario de que se va a sobrescribir y nos tiene que confirmar con
		 * un "y" o "n".
		 */

		HashMap<String, Persona> hashmapPersonaNombre = new HashMap<>();

		switch (menu()) {

		case 1: {
			System.out.println("¿Cuantas personas vas a introducir?");
			int n = sc.nextInt();
			Persona[] persona = new Persona[n];

			for (int i = 0; i < n; i++) {
				persona[i] = new Persona();
				System.out.println("Introduce el nombre de la persona: ");
				persona[i].setNombre(sc.nextLine());
				sc.nextLine();
				System.out.println("Introduce la edad de la persona: ");
				persona[i].setEdad(sc.nextInt());
				System.out.println("Introduce el nombre de la persona: ");
				persona[i].setPeso(sc.nextDouble());

				hashmapPersonaNombre.put(persona[i].getNombre(), persona[i]);
			}

		}
		case 2: {
			hashmapPersonaNombre.forEach((k, v) -> {
				System.out.print("clave: " + k.toString());
				System.out.println(" valor: " + v.toString());
			});
		}
		case 3: {
			hashmapPersonaNombre.get("pepe");
		}
		default:
		}
	}

	public static int menu() {
		System.out.println("Elige una opcion: ");
		System.out.println("1. Introducir Persona.");
		System.out.println("2. Mostrar Personas.");
		System.out.println("3. Buscar persona por nombre.");
		System.out.println("4. Salir del programa.");

		int opcion = sc.nextInt();
		return opcion;
	}

}
