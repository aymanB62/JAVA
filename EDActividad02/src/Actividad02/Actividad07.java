
package Actividad02;
import java.util.Scanner;

public class Actividad07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ej7. Escribir un algoritmo para calcular la nota final de un estudiante,  
		//considerando que: 
		//- Por cada respuesta correcta 5 puntos, por una incorrecta -1 y por  
		//respuestas en blanco 0. 
		
		System.out.println("Bienvenido!!");
		System.out.println("Calcula aquí cuanto vas ha sacar a final!!");
		
		System.out.println("Introduce cuantas respuestas has tenido bien: ");
		int bien = sc.nextInt();
		System.out.println("Introduce cuantas respuestas has tenido mal: ");
		int mal = sc.nextInt();
		System.out.println("¿Y cuantas preguntas has dejado en blanco?");
		int blanco = sc.nextInt();
		
		int nota = (bien * 5) + (mal * (-1));
		System.out.println("Tu nota final es: " + nota);
		
	}

}
