package actividad08;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		//Eliminar duplicados: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno. El programa recorrerá el 
		//array para eliminar los números duplicados y por último imprimirá el nuevo array.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño, en numeros, de un array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
	
		System.out.println("Introduce todos los numeros a continuación :");
		
		int i = 0;
		
		while(i < size) {
			array[i] = sc.nextInt();		
			i++;
		}
		int[] newArray = eliminarDuplicados(array);
		
		int j = 0;
		while(j < newArray.length) {
			System.out.print(newArray[j]);
			j++;
		}
		
	}
	public static int[] eliminarDuplicados(int[] array) {
		int[] newArray = new int[array.length];
	     int newIndex = 0;

	     for (int i = 0; i < array.length; i++) {
	         boolean isDuplicate = false;

	         for (int j = 0; j < newIndex; j++) {
	             if (array[i] == newArray[j]) {
	                 isDuplicate = true;
	                 break;
	             }
	         }

	         if (!isDuplicate) {
	             newArray[newIndex] = array[i];
	             newIndex++;
	         }
	     }

	     int[] finalArray = new int[newIndex];

	     for (int i = 0; i < newIndex; i++) {
	         finalArray[i] = newArray[i];
	     }

	     return finalArray;
	}
 }

	



