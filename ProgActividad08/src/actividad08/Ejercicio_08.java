package actividad08;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		//Multiplicar elementos por un número: Escribe un programa que solicite al usuario ingresar 
		//el tamaño de un array de números enteros. A continuación se le pedirá números hasta que el 
		//array esta lleno y por último imprimirá la multiplicación de todos los elementos.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño, en numeros, de un array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Introduce todos los numeros a continuación :");
		
		int multiplicacion = 1;
		int total = 1;
		
		for(int i = 0; i < size ; i++) {
			int num = sc.nextInt();
			total = multiplicacion * num;
			multiplicacion = num;
			System.out.println(total);
		}
		
	}

}
