package actividad08;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		//Mayor elemento: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno y por último recorrerá el 
		//array para buscar el mayor número y lo imprimirá.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el tamaño, en numeros, de un array: ");
		int size = sc.nextInt();
		int[] size_A = new int[size];
		
		int i = 1;
		int mayor = 0;
		
		System.out.println("Ingrese un número: ");
        int num = sc.nextInt();
        
		while (i < size) {
			System.out.println("Ingrese otro número: ");
            num = sc.nextInt();
			if(num>mayor) {
				mayor = num;
			}
            i++;
		}
		System.out.println("El mayor de todos es " + mayor);
	}

}
