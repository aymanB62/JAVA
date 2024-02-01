package actividad08;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		//Realizar los siguientes ejercicios. Hay que usar en todos ellos Arrays.

		//Suma de elementos: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno y por último imprimirá la suma de todos los elementos.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño, en numeros, de un array: ");
		int size = sc.nextInt();
		int[] size_A = new int[size];
		
		int i = 0;
		int suma = 0;
		
		while(i < size) {
			System.out.println("Introduce un numero: ");
			int num = sc.nextInt();
			suma += num;
			
			i++;
		}
		System.out.println("La suma es " + suma);


	}

}
