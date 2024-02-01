package Actividad09;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		//Palíndromo:
		//Desarrolla un programa que determine si una palabra ingresada por el usuario es un palíndromo 
		//(se lee igual de izquierda a derecha que de derecha a izquierda), ignorando mayúsculas y minúsculas.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Palíndromo");
		System.out.println("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		
		String invertida = ("");
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
		}
		
		if(invertida.equalsIgnoreCase(cadena)) {
			System.out.println("La palabra es polinbroma");
		}
		else {
			System.out.println("La palabra NO es polinbroma");
		}
	}

}
