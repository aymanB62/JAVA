package Actividad06;

import java.util.Scanner;

public class Ejercicio_06 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		suma(1.5,2.5);
		suma(1,2);
		resta(1.5,2.5);
		resta(1,2);
		multiplicacion(1.5,2.5);
		multiplicacion(1,2);
		division(1.5,2.5);
		division(1,2);
		
//--------------------------------------------------------------------------
	
		figuraGeometrica(4);
		figuraGeometrica(2.2,4);
		figuraGeometrica(4.4);
		
//--------------------------------------------------------------------------
	
		llamar();
		
	}
	//Crea una clase llamada "Calculadora" que contenga varios métodos para realizar operaciones matemáticas básicas 
	//como suma, resta, multiplicación y división. Los métodos deben de estar sobrecargados para realizar las 
	//operaciones tanto en punto flotante como con números enteros. 
	//Una vez creadas las funciones se invocarán desde el método 'main'.
	public static void suma(double n1, double n2) {
		double resultado = n1 + n2;
		System.out.println("Resultado = " + resultado);
	}
	public static void suma(int n1, int n2) {
		int resultado = n1 + n2;
		System.out.println("Resultado = " + resultado);
	}
	public static void resta(double n1, double n2) {
		double resultado = n1 - n2;
		System.out.println("Resultado = " + resultado);
	}
	public static void resta(int n1, int n2) {
		int resultado = n1 - n2;
		System.out.println("Resultado = " + resultado);
	}
	public static void multiplicacion(double n1, double n2) {
		double resultado = n1 * n2;
		System.out.println("Resultado = " + resultado);
	}
	public static void multiplicacion(int n1, int n2) {
		int resultado = n1 * n2;
		System.out.println("Resultado = " + resultado);
	}
	public static void division(double n1, double n2) {
		double resultado = n1 / n2;
		System.out.println("Resultado = " + resultado);
	}
	public static void division(int n1, int n2) {
		int resultado = n1 / n2;
		System.out.println("Resultado = " + resultado);
	}
//--------------------------------------------------------------------------
	
	//Crea una clase llamada "FiguraGeometrica" que tenga varios métodos sobrecargados para calcular el área de 
	//diferentes figuras geométricas, como un cuadrado, un círculo y un triángulo. Cada método de cálculo debe 
	//tomar los parámetros necesarios para calcular el área de la figura correspondiente. 
	//Una vez creadas las funciones se invocarán desde el método 'main'.
	
	public static void figuraGeometrica(double n1) {
		double areaCuadrado = n1 * n1;
		System.out.println("El area del cuadrado es : " + areaCuadrado);
	}
	public static void figuraGeometrica(double n1, int n2) {
		double areaTriandulo = (n1 * n2) / 2;
		System.out.println("El area del cuadrado es : " + areaTriandulo);
	}
	public static void figuraGeometrica(int n1) {
		final double PI = 3.14;
		double areaCirculo = Math.pow(n1, 2) * PI;
		System.out.println("El area del cuadrado es : " + areaCirculo);
	}
	
//--------------------------------------------------------------------------

	//Crea una función que pida 2 números enteros por pantalla y luego llame a las 4 funciones del ejercicio 1. 
	//Esta función será invocada desde el método 'main'
	
	public static void llamar() {
		System.out.println("Introduce un numero");
		double n1 = sc.nextInt();
		System.out.println("Introduce un numero");
		double n2 = sc.nextInt();
		suma(n1,n2);
		resta(n1,n2);
		division(n1,n2);
		multiplicacion(n1,n2);

	}
	

}
