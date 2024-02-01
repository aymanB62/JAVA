package Actividad02;

import java.util.Scanner;

public class Actividad03{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Ej3. Dados dos números, mostrar la suma, resta, división y multiplicación  de ambos
		
		System.out.println("Bienvenido!!");
		System.out.println("Introduce un número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Ahora introduce otro número: ");
		double numero2 = sc.nextDouble();
		double suma = numero1 + numero2;
		double resta = numero1 - numero2;
		double division = numero1 / numero2;
		double multiplicacion = numero1 * numero2;

		System.out.println("La suma de tus numeros es: " + suma);
		System.out.println("La resta de tus numeros es: " + resta);
		System.out.println("La division de tus numeros es: " + division);
		System.out.println("La multiplicacion de tus numeros es: " + multiplicacion);
	}

}
