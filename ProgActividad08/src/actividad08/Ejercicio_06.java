package actividad08;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		//Buscar elemento: Desarrolla un programa que permita al usuario ingresar un valor y 
		//determine si ese valor está presente en un array dado. Se tendrá que crear 
		//un array con valores al inicio del programa.
		
		Scanner sc = new Scanner(System.in);
		
		int[] x = createRandom(5);
	      
		System.out.println("Intenta adivinar si un número del array, tienes 5 intentos\n");
		
		System.out.println("El array tiene numeros entre 0 y 20\n");
		
		for(int i = 0, j = 5; i < x.length; i++, j--) {
			System.out.println("Te quedan " + j);
			System.out.println();
			int value = sc.nextInt();
			
			if(value == x[i]) {
				System.out.println("Lo has adivinado!. Posición " + (i + 1) + " Valor " + x[i]);
				break;
			}
			else {
				continue;
			}
		}
		
        System.out.print("Los valores eran\n");  
		for (int i = 0; i < x.length; i++) {  
            System.out.print(x[i] + " ");
        }  
		
	}
	public static int[] createRandom(int n) {
		Random rd = new Random();
	      int[] array = new int[n];
	      int min = 0;
	      int max = 20;

	      for (int i = 0; i < array.length; i++) {
	         array[i] = rd.nextInt(max - min) + min;
	      }
	      return array;
    }
}
