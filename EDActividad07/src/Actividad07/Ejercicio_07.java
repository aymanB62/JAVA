package Actividad07;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		//Escribe un algoritmo que genere los primeros N términos de la secuencia Fibonacci, 
		//donde N es proporcionado por el usuario.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		int a = 0;
		int b = 1;
		int i = 1;
		while(i != num) {
			System.out.print(", " + a);
			System.out.print(", " + b);
			a = a + b;
			b = a + b;
			i++;
		}
	}

}
