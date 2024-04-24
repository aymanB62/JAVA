package Actividad23;

import java.util.HashMap;
import java.util.Scanner;

public class NombreNumero {

	public static void main(String[] args) {
		/*
		 * Hacer los siguientes ejercicios con estructura HashMap
		 * 
		 * 1. Hacer un programa que almacene un listín de números de teléfono, es decir,
		 * cada nombre tendrá asignado un número de teléfono. Los datos se le pedirá al
		 * usuario por pantalla (5 números de teléfono) y se mostrarán después de
		 * introducirlos.
		 * 
		 */

		HashMap<String, String> hashmapNombreNumero = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		String numeroTelefono;
		
		System.out.println("Introduce el nombre del contacto y el número de teléfono");
		for(int i = 0; i < 5; i++) {
			System.out.println("Nombre: ");
			nombre = sc.nextLine();
			System.out.println("Telefono: ");
			numeroTelefono = sc.nextLine();
			
			hashmapNombreNumero.put(nombre, numeroTelefono);
			
			hashmapNombreNumero.forEach((k,v) -> {
				System.out.print("clave: " + k.toString());
				System.out.println(" | valor: " + v.toString());
			});
		}
		
		
	}

}
