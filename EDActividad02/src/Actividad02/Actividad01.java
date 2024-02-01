package Actividad02;

import java.util.Scanner;

public class Actividad01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Ej1. Calcular el perímetro y área de un rectángulo dada su base y su altura 

		System.out.println("Introduce cuanto mide, en cm, la base: ");
		Double base = sc.nextDouble();
		System.out.println("Ahora introduce cuanto mide la altura: ");
		Double altura = sc.nextDouble();
		double area= base * altura;
		System.out.println("El area de tu rectangulo es: " + area);
		
	}

}
