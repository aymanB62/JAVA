package actividad08;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		//Contar pares e impares: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno. El programa contará el 
		//número de pares e impares que hay en el array y mostrará dicha cuenta por pantalla.

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño, en numeros, de un array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Introduce todos los numeros a continuación :");
		
		int par = 0;
		int impar = 0;
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
			if(array[i] % 2 == 0) {
				par++;
			}
			if(array[i] % 2 != 0) {
				impar++;
			}
			
		}
		
		System.out.println("Numeros pares: " + par);
		System.out.println("Numeros impares: " + impar);
		
		
		
		
	}

}
