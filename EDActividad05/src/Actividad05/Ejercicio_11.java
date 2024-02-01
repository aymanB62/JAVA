package Actividad05;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		//Calcular la potencia de un número introducido por pantalla (por ejemplo, 2^3). 
		//No se puede utilizar la función Math.pow. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe la base de la potencia: ");
		int num1 = scan.nextInt();
		System.out.println("Escribe el exponente de la potencia: ");
		int num2 = scan.nextInt();
		int potencia = 1;
		for(int i = 0; i < num2; i++) {
			potencia *=num1;
		}
		System.out.println(potencia);
	}
}