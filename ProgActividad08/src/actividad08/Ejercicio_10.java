package actividad08;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		
		//Eliminar elemento específico: Escribe un programa que permita al usuario ingresar un 
		//valor y elimine todas las ocurrencias de ese valor en un array creado al 
		//inicio del programa. Muestra el array resultante.

		Scanner scanner = new Scanner(System.in);

        // Crear el array
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Mostrar el array original
        System.out.println("Array original:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Solicitar al usuario el valor a eliminar
        System.out.print("Ingrese el valor a eliminar: ");
        int valor = scanner.nextInt();

        // Eliminar las ocurrencias del valor en el array
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != valor) {
                array[contador] = array[i];
                contador++;
            }
        }

        // Crear un nuevo array con el tamaño correcto
        int[] nuevoArray = new int[contador];
        for (int i = 0; i < contador; i++) {
            nuevoArray[i] = array[i];
        }

        // Mostrar el array resultante
        System.out.println("Array resultante:");
        for (int i = 0; i < nuevoArray.length; i++) {
            System.out.print(nuevoArray[i] + " ");
        }
        System.out.println();

	}

}
