package Actividad09;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		//Reemplazo de Caracteres:
		//Crea un programa que tome una cadena y reemplace todas las ocurrencias de un 
		//carácter específico con otro carácter ingresado por el usuario.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Reemplazo de Caracteres");
		System.out.println("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		System.out.println("¿Que caracter quieres cambiar? : ");
		char caracter = sc.next().charAt(0);
		System.out.println("¿Con que caracter lo quieres reemplazar? : ");
		char reemplazador = sc.next().charAt(0);
		
		String cadenaReemplazada = cadena.replace(caracter, reemplazador);
		System.out.println(cadenaReemplazada);
		
		
	}

}
