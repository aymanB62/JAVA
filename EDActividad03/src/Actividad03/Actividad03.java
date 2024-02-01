package Actividad03;

import java.util.Scanner;

public class Actividad03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce otro numero: ");
		int num2 = sc.nextInt();
		mayorMenor(num1,num2);
		diasSemana();
		aprobadoSuspenso();
		edadCategoria();
		calculadora();
		parImpar();
		descuento();
	}

	//Ejercicio de Mayor o Menor: 
	
			//Escribe una función en Java que tome dos números como entrada e imprima "El primer número es mayor", 
			//"El segundo número es mayor" o "Los dos números son iguales" según cada caso. 
			//Luego, la función main pedirá los dos números por pantalla e invocará a dicha función.
			
			public static void mayorMenor(double num1, double num2) {
				if(num1>num2) {
					System.out.println("El primer número es mayor");
					}
				else if(num1<num2) {
					System.out.println("El segundo número es mayor");
				}
				else {
					System.out.println("Los dos números son iguales");
				}				
			}
			
	//Ejercicio de Días de la Semana: 
			
			//Escribe un programa que pida al usuario que introduzca 
			//un número del 1 al 7 y muestre el día de la semana correspondiente. Por ejemplo, 
			//si el usuario ingresa 1, el programa debería imprimir "Lunes"
			
			public static void diasSemana() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce un numero del 1 al 7");
				int num1 = sc.nextInt();
				if(num1 == 1) {
					System.out.println("LUNES");
					}
				else if(num1 == 2) {
					System.out.println("MARTES");
				}
				else if(num1 == 3) {
					System.out.println("MIERCOLES");
				}
				else if(num1 == 4) {
					System.out.println("JUEVES");
				}
				else if(num1 == 5) {
					System.out.println("VIERNES");
				}
				else if(num1 == 6) {
					System.out.println("SABADO");
				}
				else if(num1 == 7) {
					System.out.println("DOMINGO");
				}
				else {
					System.out.println("Vives en otro mundo");
				}
			}
			
	//Ejercicio de Evaluación de Notas: 
			
			//Crea un programa que solicite al usuario una nota (un número entre 0 y 100)
			//y muestre "Aprobado" si la nota es mayor o igual a 50, o "Suspenso" si la nota es menor a 50.
			
			public static void aprobadoSuspenso() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce tu nota (Entre 0 y 100)");
				int num1 = sc.nextInt();
				if(num1 >= 50) {
					System.out.println("APROBADO");
					}
				else {
					System.out.println("Suspenso :(");
				}
			}
			
	//Ejercicio de Categoría de Edad: 
			
			//Escribe un programa que pida la edad de una persona y 
			//determine en qué categoría de edad se encuentra. Las categorías son: 
				//"Niño" (0-12 años), 
				//"Adolescente" (13-19 años), 
				//"Adulto" (20-64 años) y "Adulto Mayor" (65 años en adelante). 
			//El programa debe imprimir la categoría correspondiente.
			
			public static void edadCategoria() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Introduce tu edad");
				int num1 = sc.nextInt();
				if(num1<= 12) {
					System.out.println("NIÑO");
					}
				else if(num1<=19) {
					System.out.println("ADOLESCENTE");
				}
				else if(num1<=64) {
					System.out.println("ADULTO");
				}
				else {
					System.out.println("ANCIANO");
				}				
			}
			
	//Ejercicio de Calculadora Simple: 
			
			//Diseña una calculadora básica que permita a los usuarios 
			//realizar operaciones de suma, resta, multiplicación, división y resto de la división entera(%). 
			//El programa mostrará un menú de opciones con las operaciones a realizar. A continuación, el programa 
			//debe solicitar dos números y mostrar el resultado. Las operaciones de calculo tienen que estar 
			//hechas en funciones y la función devolverá el resultado de la operación. 
			//El menú que muestre el programa puede ser como el siguiente ejemplo:
			
				//-Para sumar pulse 1
				//-Para restar pulse 2
				//-Para multiplicar pulse 3
				//-Para dividir pulse 4
				//-Para saber el resto de la división entera pulse 5
			
				public static void calculadora() {
					Scanner sc = new Scanner(System.in);
					System.out.println("BIENVENIDO A ESTA CALCULADORA BASICA");
					System.out.println(" \r\t-Para sumar pulse 1\r\n"
							+ "	-Para restar pulse 2\r\n"
							+ "	-Para multiplicar pulse 3\r\n"
							+ "	-Para dividir pulse 4\r\n"
							+ " \t-Para saber el resto de la división entera pulse 5");
					int num1 = sc.nextInt();
					System.out.println("Ahora ingresa un numero");
					int num2 = sc.nextInt();
					System.out.println("Necesito otro numero");
					int num3 = sc.nextInt();

					if(num1 == 1) {
						System.out.println("El resultado de la suma es: " + (num2 + num3));
						}
					else if(num1 == 2) {
						System.out.println("El resultado de la resta es: " + (num2 - num3));
					}
					else if(num1 == 3) {
						System.out.println("El resultado de la multiplicacion es: " + (num2 * num3));
					}
					else if(num1 == 4) {
						System.out.println("El resultado de la division es: " + (num2 / num3));
					}
					else {
						System.out.println("El resto de la division es: " + (num2 % num3));
					}	
				}
				
		//Ejercicio de Par o Impar: 
				
			//Crea un programa que solicite un número al usuario y determine 
			//si es par o impar. Debe imprimir "Es un número par" o "Es un número impar" según corresponda.
				
				public static void parImpar() {
					Scanner sc = new Scanner(System.in);
					System.out.println("DETERMINAREMOS SI UN NUMERO ES PAR O IMPAR");
					System.out.println("Introduce un numero:");
					double num1 = sc.nextInt();
					if (num1%2==0) {
						System.out.println("El numero es par");
					}
					else {
						System.out.println("El numero es impar");
					}
				}
				
		//Ejercicio de Descuento de Compra: 
				
			//Un supermercado desea implementar un sistema de 
			//descuentos para premiar a sus clientes. El descuento se basa en el monto total de la compra:

				//Si el importe total de la compra es igual o superior a $100, el cliente recibe un descuento del 10%.
				//Si el importe total de la compra es igual o superior a $50 pero menos de $100, el cliente recibe un descuento del 5%.
				//Si el importe total de la compra es inferior a $50, no hay descuento.
				
			//Escribe un programa en Java que solicite al usuario el importe total de la compra y determine 
			//el descuento que debe aplicarse y el importe final a pagar. 
				
			//El programa debe imprimir el descuento y el importe final. Ejemplo:
				//Ingrese el monto total de la compra: 120
				//Ingrese el descuento aplicado (en %): 10
				//Importe total final a pagar: $108.0	
				
				public static void descuento() {
					Scanner sc = new Scanner(System.in);
					System.out.println("DESCUENTO EN LA COMPRA");
					System.out.println("Introduce un el valor de la compra:");
					double num1 = sc.nextInt();		
					if (num1>=100) {
						double descuento = (num1*10)/100;
						double importe = num1 - descuento;
						System.out.println("Si el valor de su compra fue "+ num1 + 
								"\r\nEntonces el descuento que se le aplicará sera de 10% " + 
								"\r\nPor lo tanto, debe pagar: "+ importe);
					}
					else if (num1<=99 && num1>=51) {
						double descuento = (num1*5)/100;
						double importe = num1 - descuento;
						System.out.println("Si el valor de su compra fue "+ num1 + 
								"\r\nEntonces el descuento que se le aplicará sera de 5%\r\n" + 
								"Por lo tanto, debe pagar: "+ importe);
					}
					else if (num1<=49) {
						System.out.println("Si el valor de su compra fue "+ num1 + 
								"\r\nEntonces no se le aplicará decuento \r\n" + "El precio a pagar es " + num1);
					}
				}
}
