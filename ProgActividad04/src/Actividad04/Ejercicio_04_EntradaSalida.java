package Actividad04;

import java.util.Scanner;

public class Ejercicio_04_EntradaSalida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero: ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		int n2 = sc.nextInt();
		int n3 = n1 + n2;
		System.out.println(n3);
		//Aquí si se pone un numero menor de –2,147,483,648 o mayor que 2,147,483,647
		
		System.out.println("Introduzca un numero: ");
		double d1 = sc.nextDouble();
		System.out.println("Introduzca otro numero: ");
		double d2 = sc.nextDouble();
		double d3 = d1 + d2;
		System.out.println(d3);
		
		System.out.println("Introduzca valor (true, false): ");
		boolean b1 = sc.nextBoolean();
		System.out.println(b1);
		//En este caso, si se pone un balor que no sea ni false
		// ni true dara un error en tiempo de ejecucio.
		
		System.out.println("Introduzca una frase: ");
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("Introduzca un numero: ");
		float f1 = sc.nextFloat();
		System.out.println(f1);
		//En este caso, si se introduce cualquier caracter que no sea un numero
		//va a dar un error en tiempo de ejecución.
		
		//System.out.println("Introduzca un numero: ");
		//char ch1 = sc.nextChar();
		//System.out.println(ch1);
		//En este caso no se puede leer un caracter por consola con este metodo
		//Para leer un char hay que poner la siguiente instruccion
		System.out.println("Introduzca un caracter solo: ");
		char ch1 = sc.next().charAt(0);
		System.out.println(ch1);
		
		System.out.println("Introduzca un numero: ");
		byte byt1 = sc.nextByte();
		System.out.println(byt1);
		//En este caso, si el numero introducido en mayor de 127
		//o menor se -128. Da un error en tiempo se ejecución
		
		System.out.println("Introduzca un numero: ");
		long lo1 = sc.nextLong();
		System.out.println(lo1);
	}

}