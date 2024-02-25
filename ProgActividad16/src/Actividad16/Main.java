package Actividad16;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Equipo equipo1 = new Equipo();
		
		equipo1.nombre = "real";
		equipo1.lista = pedirPorPantalla();
		
		System.out.println("Introduce el nombre del equipo: ");
		String nombreE1 = sc.nextLine();
		
		Equipo equipo2 = new Equipo(pedirPorPantalla(), nombreE1);
		
		equipo2.mostrarJugadores();
		
		equipo2.toString();
		
		System.out.println(equipo2.checkJugador("pedro"));
		
		System.out.println(equipo2.numeroJugadores());
		
		System.out.println(equipo2.esApto());
		
		System.out.println(equipo2.listaEquals(equipo1.lista));
		
		System.out.println(equipo2.equipoEquals(equipo1));
	}
	
	public static ArrayList<String> pedirPorPantalla() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Cuantos jugadores vas ha introducir?");
		int num1 = sc.nextInt(); sc.nextLine();
		
		ArrayList<String> lista = new ArrayList<String>(num1);
		
		for(int i = 0; i < num1; i++) {
			System.out.println("Introduce un jugador: ");
			lista.add(sc.nextLine());
		}
		return lista;
	}
	
}