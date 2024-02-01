package Actividad09;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		//Extracción de Subcadena:
		//Pide al usuario que ingrese una cadena y dos índices. 
		//Luego, muestra la subcadena comprendida entre esos dos índices.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Extracción de Subcadena");
		System.out.println("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		
		System.out.println("Cadena en mayuscula " + cadena.toUpperCase());
		System.out.println("Cadena en minuscula  " + cadena.toLowerCase());
	}

}
