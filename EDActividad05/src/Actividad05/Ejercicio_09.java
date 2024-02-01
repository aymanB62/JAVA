package Actividad05;

import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {
		//Realizar las tareas 3, 5 y 8 mediante funciones. 
		//La función debe de hacer la funcionalidad sin pedir los valores, los 
		//valores los deberá pedir la clase "main" y 
		//pasarlos como parámetros de entrada a las funciones
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Esto es parte del EJERCICIO 03");
		System.out.println("\nIntroduce un número: ");
		int num1 = scan.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = scan.nextInt();
		Ejercicio03(num1, num2);
		
		System.out.println("Esto es parte del EJERCICIO 05");
		System.out.println("\nIntroduce un número: ");
		int num3 = scan.nextInt();
		Ejercicio05(num3);
		
		System.out.println("Esto es parte del EJERCICIO 08");
		System.out.println("\nIntroduce un número: ");
		int num4 = scan.nextInt();
		Ejercicio08(num4);
	}
	
	
	public static void Ejercicio03(int n1, int n2){
		for (int i = n1; i <= n2; i++) {
            System.out.println(i);
            }
	}	
	public static void Ejercicio05(int n){
		for(int i = 1;i <=10;i++) {
			int tnum1 = i*n;
			System.out.println(tnum1);
		}
	}	
	public static void Ejercicio08(int n){
		int suma = 1;
		for (int num = n;num >= 1; num--) {
			suma *= num; 
		}
		System.out.println("El factoria es" + suma);
		
	}
}