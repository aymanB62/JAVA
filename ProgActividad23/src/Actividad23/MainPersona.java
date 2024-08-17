package Actividad23;

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

		HashMap<String, Persona> personMap = new HashMap<>();
		boolean ejecutandose = true;
		
		
		
		while (ejecutandose) {
			menu();
			int opcion = sc.nextInt();
			switch (opcion) {

			case 1: {
				System.out.println("Introduce el nombre de la persona: ");
				String name = sc.nextLine();
				sc.nextLine();
				System.out.println("Introduce la edad de la persona: ");
                int age = sc.nextInt();
                System.out.println("Introduce el nombre de la persona: ");
                double weight = sc.nextDouble();
                
				if (personMap.containsKey(name)) {
                    System.out.println("Ya existe una persona con el mismo nombre. "
                    		+ "Deseas sobreescribir esta? Escribe \"y\", si quieres o \"n\" si no quieres");
                    String confirm = sc.nextLine();
                    if (confirm.equalsIgnoreCase("y")) {
                        personMap.put(name, new Persona());
                    }
                } else {
                    personMap.put(name, new Persona());
                }
                break;

			}
			case 2: {
				personMap.forEach((k, v) -> {
					System.out.print("clave: " + k.toString());
					System.out.println(" valor: " + v.toString());
				});
				break;
			}
			case 3: {
				System.out.print("Introduce el nombre: ");
                String searchName = sc.nextLine();
                if (personMap.containsKey(searchName)) {
                    System.out.println("Persona encontrada: " + personMap.get(searchName));
                } else {
                    System.out.println("Persona no encontrada");
                }
                break;
			}
			case 4:
				ejecutandose = false;
                System.out.println("Exiting program.");
                break;
			
            default:
                System.out.println("Opcion invalida. Prueba de nuevo");
			}
		}

	}
	
	
	
	public static void menu() {
		System.out.println("Elige una opcion: ");
		System.out.println("1. Introducir Persona.");
		System.out.println("2. Mostrar Personas.");
		System.out.println("3. Buscar persona por nombre.");
		System.out.println("4. Salir del programa.");

	}
}
