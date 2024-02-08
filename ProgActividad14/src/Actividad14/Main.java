package Actividad14;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Equipo equipo1 = new Equipo();
		
		Equipo equipo2 = new Equipo();
	}
	
	public static String[] pedirPorPantalla() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantas valoraciones vas ha introducir?");
		int num1 = sc.nextInt();
		
		String[] lista = new String[num1];
		
		for(int i = 0; i < num1; i++) {
			System.out.println("Introduce un numero: ");
			lista[i] = sc.nextDouble();
		}
		return lista;
	}
	
}
