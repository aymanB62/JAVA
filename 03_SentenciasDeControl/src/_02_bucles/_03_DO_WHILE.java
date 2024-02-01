package _02_bucles;
import java.util.Scanner;

public class _03_DO_WHILE {
	//Existe una variable del bucle 'while', que se llama 'do-while'
	
	//La filosofia es la misma que la del bucle ¡While pero esta vez
	//en vez de ejecutarse entre 0 y N veces, se ejecutará entre
	//1 y N veces. Es decir, al menos el bloque de sentencias se
	//ejecutara UNA vez.
	
	
	public static void main(String[] args) {
		//La sentencia do-while tiene el siguiente formato
		/*
		 * do{
		 * 		//sentencia a ejecutar
		 * }while(EXPRESION_BOOLEAN);		
		 */
		
		//Vamos ha pedirle un numero al usuario hasta que los valores esten
		//entre 1 y 10.
		int numero = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduzca un numero entre el 1 y el 10");
			numero = sc.nextInt();
		}while(numero<1 || numero>10);
		
		System.out.println("El numero esta entre 1 y 10");
	}

}
