package Actividad02;

import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//Ej4. Calcular la media de tres números pedidos por teclado 

		System.out.println("Bienvenido!!");
		System.out.println("Necesitamos 3 numeros para sacer la media!!");

		System.out.println("Introduce un número: ");
		double numero1 = sc.nextDouble();
		System.out.println("Ahora introduce otro número: ");
		double numero2 = sc.nextDouble();
		System.out.println("Solo queda este, introduce el últimos número: ");
		double numero3 = sc.nextDouble();
		double media = (numero1 +numero2 + numero3)/ 3; 
		
		System.out.println("La media de tus tres números es " + media);
		
	}

}
