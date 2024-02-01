package Actividad05;

import java.util.Scanner;

public class Ejercicio_05 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		ej01();
		ej01();
		ej01();
		ej02(5, 9);
		ej02(2, 7);
		System.out.println("El perimetro de tu rectangulo es: " + ej03(4.3,8.5));
		System.out.println("El perimetro de tu rectangulo es: " + ej03(4.4,8.5));
		System.out.println("El area de tu rectangulo es: " + ej04(4.3,8.5));
		System.out.println("El area de tu rectangulo es: " + ej04(4.4,8.5));
		System.out.println("El area de tu rectangulo es: " + ej05(4,6));
		System.out.println("El area de tu rectangulo es: " + ej05(5,7));
		System.out.println(ej06_suma(1,5));
		System.out.println(ej06_resta(1,5));
		System.out.println(ej06_division(1,5));
		System.out.println(ej06_multiplicacion(1,5));
		System.out.println(ej06_suma(2,6));
		System.out.println(ej06_resta(2,6));
		System.out.println(ej06_division(2,6));
		System.out.println(ej06_multiplicacion(2,6));
		ej07(4,7,2);
		ej07(5,8,3);
		ej08(5,6,5,7,8);
		ej09(500, 20, 15);
		ej09(3000, 8, 30);
	}
	// Crea una función que imprima por pantalla un menú como el que sigue:
		//-Entrar en la aplicación
		//-Registrarse en la aplicación
		//-Salir del programa
	//Una vez creada la función, llamar a la función 3 veces desde el método "main"
			
	public static void ej01() {
		System.out.println("Entrar en la aplicacion");
		System.out.println("Registrarse en la aplicacion");
		System.out.println("Salir en la aplicacion");
	}
	
	//-----------------------------------------------------------------
	
	//Crea una función que imprima por pantalla el perímetro de un 
	//rectángulo dada su base y su altura (parámetros de entrada).
	
	public static void ej02(double base, double altura) {
		double perimetro = (base * 2) + (altura * 2);
		System.out.println("El perimtros de tu rectangulo es " + perimetro);
	}
	
	//-----------------------------------------------------------------

	//Crea una función que devuelva el perímetro (parámetro de salida) de un 
	//rectángulo dada su base y su altura (parámetros de entrada). 
	//El valor devuelto deberemos de imprimirlo por pantalla.
	
	public static double ej03(double base, double altura) {
		double perimetro = (base * 2) + (altura * 2);
		return perimetro;
	}
	
	//-----------------------------------------------------------------
	
	//Crea una función que devuelva el área (parámetro de salida) de un rectángulo dada su base y su altura (parámetros de entrada). 
	//El valor devuelto deberemos de imprimirlo por pantalla.
	//Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes.
	
	public static double ej04(double base, double altura) {
		double area = base * altura;
		return area;
	}
	
	//-----------------------------------------------------------------
	
	//Crear una función que dados los catetos de un triángulo rectángulo (parámetros de entrada), 
	//calcular su hipotenusa (parámetros de salida). 
	
	public static double ej05(double cateto1, double cateto2) {
		double hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
		return hipotenusa;
	}
	
	//-----------------------------------------------------------------
	
	//Crear 4 funciones para calcular suma, resta, división y multiplicación de dos números enteros (parámetros de entrada). 
	//El valor calculado se deberá de devolver (parámetro de salida) e imprimir por pantalla.
	
	public static double ej06_suma(double num1, double num2) {
		double suma = num1 + num2;
		return suma;}
	public static double ej06_resta(double num1, double num2) {
		double resta = num1 - num2;
		return resta;}
	public static double ej06_division(double num1, double num2) {
		double division = num1 / num2;
		return division;
		}
	public static double ej06_multiplicacion(double num1, double num2) {
		double multiplicacion = num1 * num2;
		return multiplicacion;
		}
	
	//-----------------------------------------------------------------

	//Crear una función que imprima la media de tres números (parámetros de entrada) 
	//Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes.
	
	public static void ej07(double num1, double num2, double num3) {
		double media = (num1 + num2 + num3) /3;
		System.out.println(media);
	}
	
	//-----------------------------------------------------------------
	
	//Un alumno desea saber cuál será su calificación final en la materia de programación. Dicha calificación se compone de los siguientes porcentajes: 
		//55% del promedio de sus tres calificaciones parciales (parámetros de entrada)
		//30% de la calificación del examen final (parámetro de entrada)
		//15% de la calificación de un trabajo final (parámetro de entrada)
	//Crear una función que calcule la nota final (parámetro de salida) del alumno en base a los porcentajes anteriores.
	//Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes.
	
	public static double ej08(double nota1, double nota2, double nota3, double nota4, double nota5) {
		double parcial = ((nota1 + nota2 + nota3) * 55) / 100;
		double exfinal = (nota4 * 30)/100;
		double trafinal = (nota5 * 15)/100;
		double fin = parcial + exfinal + trafinal;
		return fin;
	}
	
	//-----------------------------------------------------------------

	//Un trabajador desea saber su sueldo total. Su sueldo total se basa en lo siguiente
		//Salario base (parámetro de entrada)
		//Número de horas extra trabajadas (parámetro de entrada)
		//Precio de hora extra trabajada (parámetro de entrada)
	//Crear una función que imprima por pantalla el salario del trabajador según los parámetros de entrada anteriores.
	//Una vez creada la función, llamar a la función 2 veces desde el método "main" con parámetros de entrada diferentes.
	
	public static void ej09(double base, double hextra, double phextra) {
		double salario = base + (hextra * phextra);
		System.out.println(salario);
	}
}
