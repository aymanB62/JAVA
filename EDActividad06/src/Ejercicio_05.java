import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		//Pedir un número al usuario e imprimir su tabla de multiplicar.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num1 = scan.nextInt();
		int i = 1;
		do {
			int tnum1 = i*num1;
			System.out.println(tnum1);
			i++;
		}while(i<=10);
	}

}
