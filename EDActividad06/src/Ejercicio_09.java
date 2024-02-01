import java.util.Scanner;

public class Ejercicio_09 {

	public static void main(String[] args) {
		//Calcular la potencia de un número introducido por pantalla (por ejemplo, 2^3). 
		//No se puede utilizar la función Math.pow. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe la base de la potencia: ");
		int num1 = scan.nextInt();
		
		System.out.println("Escribe el exponente de la potencia: ");
		int num2 = scan.nextInt();
		
		int potencia = 1;
		
		int i = 0;
		do {
			potencia *=num1;
			i++;
		}while(i < num2);
		System.out.println(potencia);
	}

}
