package Actividad09;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		//Conteo de Palabras:
		//Desarrolla un programa que cuente el número de palabras en una cadena ingresada por el usuario. 
		//Considera que las palabras están separadas por espacios.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Conteo de Palabras");
		System.out.println("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		
		String[] cadenaSeparada = cadena.split(" ");
		
		System.out.println("La cadena tiene " + cadenaSeparada.length + " palabras");
	}

}
