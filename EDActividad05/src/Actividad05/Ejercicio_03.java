package Actividad05;

import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		//Pedir 2 números por pantalla y que muestre los números desde el 
		//primer número hasta el segundo
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num1 = scan.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = scan.nextInt();
		
		for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            }
		
	}

}
