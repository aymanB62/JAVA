package _02_bucles;
import java.util.Scanner;

public class _02_WHILE {
	//Los bucles 'for' estan pensados principalmente para realizar
			//un numero determinado de saltos. Ej: 1 al 30, de 30 a 1, etc.
			
			//Tenemos otro tipo de bucles que estan pensados para hacer un
			//numero indeterminado de saltos, es decir, que no estamos 
			//muy seguros del numero de interaciones que vamos a realizar.
			
			//Para este tipo de bucles utilizaremos el llamado bucle 'while'
			//Este tipo de bucle es una 'mezcla' entre un 'for' y un 'if'.
			
			//Para utilizar este tipo de bucle usaremos la siguiente sentencia
			//while (EXPRESION_WHILE)
			
			//El 'while' se ejecutará siempre y cuando la expresion boolean de
			//dentro de los parentesis sea 'true'.
			
			//OJO, en este tipo de bucles es mucho mas facil hacer bucles
			//infinitos
	public static void main(String[] args) {
		//El ejemplo mas facil seria un bucle infinito
		/*while(true)
			System.out.println("Esto es un bucle infinito");
		*/
		//Normalmente pondremos siempre bloque dentro del while
		//y debemos de concluir el bucle en algun momento
		
		//Imprimir los 10 primeros numero mediante un bucle while
		int num = 1;
		while(num <=10) {
			System.out.println(num++);
		}
		//Todo algoritmo tiene su equivalente de 'for' a 'while'
		//(incluso a la inversa, aunque no sea lo habitual)
		
		//La filosofia de un bucle 'while' es ejecutar una serie
		//de competencias entre 0
		
		
		
		
		//Lo mas habitual es usar un 'while' cuando no sabemos el numero de
		//iteraciones que vamos a realizar.
		
		
		//Manera equivalente con una variable booleana que hace efecto de 'flag'
		Scanner scann = new Scanner(System.in);	
		boolean correcto = false;//Esta variable hace efecto de 'flag' o 'bandera'
								//es decir, va a hacer que se siga ejecutando
								//el bucle 'while' o no.
								//En este caso parto de la base en que el usuario
								//va a introducir mal los datos, por lo tanto
								//establezco correcto = false.
		while (!correcto) {
			System.out.println("Introduzca un numero entre el 1 y el 10");
			int numero = scann.nextInt();
			if(numero <=10 && numero>=1) {
				System.out.println("El numero esta entre 1 y 10");
				correcto = true;
			}else {
				System.out.println("El numero es incorrecto");
			}
		}
		
		//Vamos ha pedirle un numero al usuario hasta que los valores esten
		//entre 1 y 10.
		System.out.println("Introduzca un numero entre el 1 y el 10");
		int numero1 = scann.nextInt();
		while(numero1<1 || numero1 >10) {
			System.out.println("Introduce un numero entre el 1 y el 10");
			numero1 = scann.nextInt();
		}
		System.out.println("El numero esta entre 1 y 10");
	}

}
