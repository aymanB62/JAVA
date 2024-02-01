package Actividad05;
import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) {
		//Calcular el factorial de un número pedido por pantalla. El factorial de un número es el 
		//número multiplicado por sus anteriores hasta el 1. EJ: 5!= 5*4*3*2*1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un numero: ");
		int suma = 1;
		for (int num = sc.nextInt();num >= 1; num--) {
			suma *= num; 
		}
		System.out.println(suma);
		
		}

}
