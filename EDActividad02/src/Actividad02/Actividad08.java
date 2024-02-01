
package Actividad02;
import java.util.Scanner;

public class Actividad08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ej8. Calcula el sueldo de un trabajador, cuyo valor es su sueldo base  
		//más un número de horas extra trabajadas. Cada hora trabajada extra se pagará a 40€.
		
		System.out.println("Bienvenido!!");
		System.out.println("Calcula aquí cuanto vas a cobrar este mes!!");
		
		System.out.println("Lo primero que voy a necesitar es tu sueldo base: ");
		double sueldo = sc.nextDouble();
		
		System.out.println("Lo siguiente que necesito es el número de horas extras has hecho este mes: ");
		double horas = sc.nextDouble();
		
		double facturacion = sueldo + (horas * 40);
		System.out.println("Este mes vas ha facturar " + facturacion + "€");
	}

}
