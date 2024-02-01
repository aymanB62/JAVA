package Actividad07;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		//Convertidor de Temperatura: Diseña un algoritmo que convierta temperaturas entre Celsius y Fahrenheit. 
		//El usuario debe elegir la dirección de la conversión y proporcionar la temperatura.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿De que unidad a que unidad quieres cambiar la temperatura? \n\t1. Celsius a Farenheit \n\t2. Farenheit a Celsius");
		int unidad = sc.nextInt();
		
			/*if(unidad == 1) {
			System.out.println("Se cambiara de Celsius a Farenheit");
			}else if(unidad == 2) {
			System.out.println("Se cambiara de Farenheit a Celsius");
			}
			while(unidad ==3) {
				System.out.println("Introduce un numero correcto");
				unidad = sc.nextInt();
				}*/
		
		while(unidad>2 || unidad <1) {
			System.out.println("Introduce un numero correcto: ");
			unidad = sc.nextInt();
		}
		
		System.out.println("Introduce la temperatura: ");
		double temp = sc.nextInt();

		if(unidad == 1) {
			temp = (10 * 9 / 5) + 32;
			System.out.println(temp);
		}else if(unidad == 2) {
			temp = (temp - 32) * 5 / 9;
			System.out.println(temp);
		}
	}

}
