package Actividad09;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		//Mayúsculas y Minúsculas:
		//Desarrolla un programa que solicite al usuario ingresar una cadena y 
		//luego muestre la misma cadena en mayúsculas y minúsculas.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Mayúsculas y Minúsculas");
		System.out.println("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		
		System.out.println("Cadena en mayuscula " + cadena.toUpperCase());
		System.out.println("Cadena en minuscula  " + cadena.toLowerCase());
	}
}
