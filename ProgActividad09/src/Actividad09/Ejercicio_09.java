package Actividad09;

import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {
		//Conteo de Caracteres:
		//Escribe un programa que cuente el número de veces que aparece un carácter específico 
		//ingresado por el usuario en una cadena ingresada por el usuario.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Conteo de Caracteres");
		System.out.println("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		
		System.out.println("¿Que caracter quieres que cuente? : ");
		char caracter = sc.next().charAt(0);
		
		int num = 0;
		
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i) == caracter) {
				num++;
			}
		}	
		System.out.println(num);

	}
}