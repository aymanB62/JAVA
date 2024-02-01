package depuracion;

import java.util.Scanner;

public class _02_DepuracionSentenciasControl {

	public static void main(String[] args) {
		//Podemos depurar sentencias de control con la misma
		//metodologia
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int numero1 = sc.nextInt();
		if(numero1 == 0) {
			int numero2 = 56;
			System.out.println("El numero es 0");
		}

		for (int i = 0; i<=10; i++) {
			System.out.println("La variable de control del bucles es: " + i);
		}
		System.out.println("Fin de programa");
	}

}
