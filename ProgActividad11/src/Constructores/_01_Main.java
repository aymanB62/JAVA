package Constructores;
import java.util.Scanner;
public class _01_Main {

	public static void main(String[] args) {
		Videojuego v1 = new Videojuego();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la fecha de creacion del videojuego con el formato \"dd/mm/yyyy\": ");
		v1.creationDate = sc.nextLine();
		System.out.println("Introduce el nombre del videojuego: ");
		v1.nombre = sc.nextLine();
		System.out.println("Intrduce su puntuacion del 0 al 10: ");
		v1.puntuacion = sc.nextInt();
		System.out.println("Introduce el precio del videojuego: ");
		v1.precio = sc.nextDouble();
		System.out.println("El videojuego es de segunda mano (true or false)? ");
		v1.secondHand = sc.nextBoolean();
		System.out.println("Introduce el ID del videojuego: ");
		v1.id = sc.nextLine();
		
		v1.apto();
		if(v1.secondHand == true) {v1.descuento();}
		v1.fecha();
		v1.imprimir();
		v1.imprimirNombrePuntuacion();
		v1.libras();
		v1.numerosNaturales();
		
		Videojuego v2 = new Videojuego("Warzone", "10/07/2029");
		
		System.out.println("\nIntrduce su puntuacion del 0 al 10: ");
		v2.puntuacion = sc.nextInt();
		System.out.println("Introduce el precio del videojuego: ");
		v2.precio = sc.nextDouble();
		System.out.println("El videojuego es de segunda mano (true or false)? ");
		v2.secondHand = sc.nextBoolean();
		System.out.println("Introduce el ID del videojuego: ");
		v2.id = sc.nextLine();
		
		System.out.println(v1.cualEsCaro(v2));
		
		Videojuego v3 = new Videojuego("994095X", "Barbie Horse Adventure", 8, 60.67, "21/10/2008", true);
	}

}
