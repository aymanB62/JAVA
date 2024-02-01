package Actividad07;

import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		//Escribe un algoritmo que muestre el siguiente menú:
			//Sumar
			//Restar
			//Multiplicar
			//Dividir
			//Salir del programa
		//El programa a continuación pedirá los dos números con los que queremos operar, 
		//y realizará la operación elegida mostrando el resultado al usuario. 
		//Se volverá a mostrar el menú el usuario hasta que el usuario elija la opción “Salir del programa”.

		Scanner sc = new Scanner(System.in);
		
		
		int num;
		int total;
		
		do {
			System.out.println("Calculadora");
			System.out.println("\n\t1. Sumar");
			System.out.println("\n\t2. Restar");
			System.out.println("\n\t3. Multiplicar");
			System.out.println("\n\t4. Dividir");
			System.out.println("\n\t5. Salir del programa");
			
			System.out.println("\nElige la opción :");
			num = sc.nextInt();
			
			if(num >=5) {
				System.out.println("Saliste del programa");
				break;
			}
			System.out.println("Introduce un numero: ");
			int n1 = sc.nextInt();
			System.out.println("Introduce otro numero: ");
			int n2 = sc.nextInt();
			
			
			
			if(num ==1) {
				total = n1 + n2;
				System.out.println("Suma = " + total);
			}
			else if(num ==2) {
				total = n1 - n2;
				System.out.println("Resta = " + total);
			}
			else if(num ==3) {
				total = n1 * n2;
				System.out.println("Multiplicacion = " + total);
			}
			else if(num ==4) {
				total = n1 /n2;
				System.out.println("Division = " + total);
			}
			
		}
		while(num <=5 && num >0); 
	}

}
 