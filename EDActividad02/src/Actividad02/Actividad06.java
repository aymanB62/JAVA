
package Actividad02;
import java.util.Scanner;

public class Actividad06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ej6. Un alumno desea saber cuál será su calificación final en la materia de  
		//Entornos de Desarrollo. Dicha calificación se compone de los siguientes porcentajes: 
		//* 55% del promedio de sus tres calificaciones parciales. 
		//* 30% de la calificación del examen final. 
		//* 15% de la calificación de un trabajo final. 
		//Habrá que pedir los datos de las calificaciones parciales, del examen final y del trabajo final 
		
		System.out.println("Bienvenido!!");
		System.out.println("Calcula aquí cuanto vas ha sacar a final de curso!!");

		System.out.println("¿Cuanto sacaste en el primer examen parcial?");
		double nota1 = sc.nextDouble();
		System.out.println("¿Y en el segundo examen parcial?");
		double nota2 = sc.nextDouble();
		System.out.println("Solo me queda el tercer examen parcial");
		double nota3 = sc.nextDouble();
		double promedio = (((nota1 + nota2 + nota3)/3) *55)/100;
		
		
		System.out.println("Ahora necesito la nota del examen final que has hecho");
		double notaf = sc.nextDouble();
		double notafinal = (notaf*30) / 100;
		
		System.out.println("Para concluir, necesito tu nota del trabajo final");
		double trabajof = sc.nextDouble();
		double trabajofinal = (trabajof*15)/100;
		
		double notacurso = trabajofinal + promedio + notafinal;
		if (notacurso <= 4.9) {
			System.out.println("Tristemente has SUSPENDIDO el curso");
		}
		else
			{
			System.out.println("MUY BIEN!! HAS APROBADO!!! Además tu nota es " + notacurso);	
			}

		

		
	}

}
