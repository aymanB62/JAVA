package Actividad07;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		//Desarrolla un algoritmo que determine cual es el mayor de los números ingresados por teclado. 
		//El programa pedirá un número tendrá que valorar si es el mayor. 
		//El programa continuará pidiendo números hasta se ingrese un número negativo y acabará mostrando el número mayor.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cual es el mayor?");
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
		int mayor = 0;
		
		while (num>=0) {
			if(num>mayor) {
				mayor = num;
			}
			System.out.println("Ingrese otro número: ");
            num = sc.nextInt();
		}
		System.out.println("El mayor de todos es " + mayor);
	}
}
