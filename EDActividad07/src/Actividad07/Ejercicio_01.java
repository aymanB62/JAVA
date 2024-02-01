package Actividad07;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		//Contador de Números Pares: Escribe un algoritmo que cuente y muestre la cantidad de números pares en un rango dado por el usuario.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int num1 = sc.nextInt();
	
		System.out.println("Introduzca un numero: ");
		int num2 = sc.nextInt();
		int pares = 0;
		while(num1<=num2) {
			if (num1 % 2==0) {
				System.out.println(num1);
				pares++;
			}
			num1++;
		}
		System.out.println("Hay " + pares + " numeros pares");
	}

}
