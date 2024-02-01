package Actividad09;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		//Longitud de una Cadena:
		//Escribe un programa que solicite al usuario ingresar una cadena y muestre la longitud de la cadena ingresada.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Longitud de una cadena");
		System.out.println("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		
		System.out.println("La longitud de la cadena es " + cadena.length());
	}

}
