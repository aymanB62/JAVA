package Actividad07;

import java.util.Scanner;

public class Ejercicio_06 {

	public static void main(String[] args) {
		//Desarrolla un algoritmo que determine si un número ingresado por el usuario es primo o no. 
		//Un número es primo SOLAMENTE cuando es divisible por sí mismo y por 1.

		Scanner sc = new Scanner(System.in);
		System.out.println("Detector de numero primo");
		
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		
        boolean esPrimo = true;

		
        if (num <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) { 
            	//si un número es divisible por un número mayor a su raíz cuadrada, también será divisible por un número menor a su raíz cuadrada.
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        if (esPrimo) {
            System.out.println(num + " es un número primo.");
        } else {
            System.out.println(num + " no es un número primo.");
       }
	}
	}
