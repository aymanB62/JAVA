package actividad08;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		//Invertir array: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno. El siguiente paso será invertir 
		//el orden de los valores  e imprimirlos por pantalla.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño, en numeros, de un array: ");
		int size = sc.nextInt();
		
		int[] size_A = new int[size];
		
		

		for(int i = 0; i<size; i++) {
			System.out.println("Introduce otro numero: ");
			size_A[i] = sc.nextInt();
			
		}
		
		int x = size-1;
		
		do {
			System.out.println(size_A[x]);
			x--;
		}while(x>=0);
	}

}
