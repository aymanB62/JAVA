package Actividad07;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		//Crea un algoritmo que solicite al usuario ingresar números positivos. 
		//El programa debe calcular la suma de esos números hasta que se ingrese 
		//un número negativo y acabará mostrando dicha suma.

		Scanner sc = new Scanner(System.in);
		System.out.println("Calcular la suma de numeros hasta que se introduzca uno negativo");
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		int suma = 0;
		
		while (num>0) {
			suma += num;
			
			System.out.println("Introduce un numero: ");
			num = sc.nextInt();
			if(num<0) {
				break;
			}
		}
		System.out.println("La suma de todos ellos es " + suma);
	}

}
