package actividad08;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		//Promedio: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números reales. 
		//A continuación se le pedirá números hasta que el array esta lleno y por último imprimirá la media aritmética de todos ellos.
		
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
		System.out.println("La suma es " + (suma/size));


		//Mayor elemento: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno y por último recorrerá el 
		//array para buscar el mayor número y lo imprimirá.

		//Invertir array: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno. El siguiente paso será invertir 
		//el orden de los valores  e imprimirlos por pantalla.

		//Eliminar duplicados: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno. El programa recorrerá el 
		//array para eliminar los números duplicados y por último imprimirá el nuevo array.

		//Buscar elemento: Desarrolla un programa que permita al usuario ingresar un valor y 
		//determine si ese valor está presente en un array dado. Se tendrá que crear un array con valores al inicio del programa.

		//Contar pares e impares: Escribe un programa que solicite al usuario ingresar el tamaño de un array de números enteros. 
		//A continuación se le pedirá números hasta que el array esta lleno. El programa contará el 
		//número de pares e impares que hay en el array y mostrará dicha cuenta por pantalla.

		//Multiplicar elementos por un número: Escribe un programa que solicite al usuario ingresar 
		//el tamaño de un array de números enteros. A continuación se le pedirá números hasta que el 
		//array esta lleno y por último imprimirá la multiplicación de todos los elementos.

		//Unir arrays: Escribe un programa que solicite al usuario ingresar el tamaño de dos arrays de 
		//números enteros. A continuación se le pedirá números hasta que los arrays estén llenos. 
		//A continuación, el programa unirá los dos arrays en otro array más grande, y 
		//por último imprimirá la suma de todos los elementos de ese array nuevo.

		//Eliminar elemento específico: Escribe un programa que permita al usuario ingresar un 
		//valor y elimine todas las ocurrencias de ese valor en un array creado al 
		//inicio del programa. Muestra el array resultante.

	}

}
