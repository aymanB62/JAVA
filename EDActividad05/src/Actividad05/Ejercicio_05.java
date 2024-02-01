package Actividad05;

import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		//Pedir un número al usuario e imprimir su tabla de multiplicar.
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num1 = scan.nextInt();
		
		for(int i = 1;i <=10;i++) {
			int tnum1 = i*num1;
			System.out.println(tnum1);
		}
		
	}

}
