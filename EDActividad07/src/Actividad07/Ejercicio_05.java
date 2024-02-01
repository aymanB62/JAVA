package Actividad07;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		//Crea un juego donde el programa genera un número aleatorio y el usuario tiene que adivinarlo. 
		//El programa debe dar pistas como "muy alto" o "muy bajo" hasta que el usuario adivine. 
		//Para generar números aleatorios podemos usar las siguientes sentencias:
		
		Random r = new Random();
		int numrandom = r.nextInt(10)+1;// Genera un número aleatorio del 1 al 10, ambos incluidos.
		
		System.out.println("Adivinar el numero entre 1 y 10");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Adivina el número: ");
		int numusuario = sc.nextInt();
		
		while (numusuario != numrandom) {
			numusuario = sc.nextInt();
			if (numusuario > numrandom) {
				System.out.println("Muy alto");
			}
			else if (numusuario > numrandom) {
				System.out.println("Muy bajo");
			}
		}
		System.out.println("Buen trabajo, gracias por perder tu tiempo");
	}
	

}
