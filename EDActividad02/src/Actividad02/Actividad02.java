package Actividad02;

import java.util.Scanner;

public class Actividad02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ej2. Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.  
		
		System.out.println("Bienvenido!!");
		System.out.println("Introduce la longitud en cm de uno de los catetos: ");
		Double cateto1 = sc.nextDouble();
		System.out.println("Introduce el otro cateto: ");
		Double cateto2 = sc.nextDouble();
		double cuadrado1 = Math.pow(cateto1, 2);
		double cuadrado2 = Math.pow(cateto2, 2);
		double hipotenusa = Math.sqrt(cuadrado1 + cuadrado2);
		System.out.println("La hipotenusa de tu triangulo mide " + hipotenusa + "cm");


	}

}
