package fase1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Como primera parte del videojuego se pide hacer el diseño de las clases y una
		 * aplicación principal que pedirá al usuario dar de alta a un Muniemon con un
		 * menú. El menú será el siguiente:
		 * 
		 * Dar de alta Muniemon . Mostrar Muniemon Salir del programa En principio solo
		 * se podrá tener un Pokemon en la aplicación.
		 * 
		 * Con la opción 1 se pedirán todos los datos al usuario y se guardaran en
		 * memoria (un objeto)
		 * 
		 * Con la opción 2 se mostrarán todos los datos que se han guardado en memoria.
		 * 
		 * El programa se ejecutará hasta que el usuario pulse salir del programa.
		 */

		Scanner sc = new Scanner(System.in);
		Muniemon munion1 = new Muniemon();
		menu();
		int eleccion = sc.nextInt();
		while (eleccion > 3 || eleccion < 1) {
			System.out.println("Elige una opcion correcta porfa ●﹏●: ");
			eleccion = sc.nextInt();
		}
		while (eleccion < 3 && eleccion >=1) {
			if (eleccion == 1) {
				System.out.println("Introduce el nombre del Munion : ");
				munion1.setNombre(sc.nextLine());
				sc.nextLine();
				System.out.println("Introduce el ataque del Munion (no lo cheates) : ");
				munion1.setAtaque(sc.nextInt());
				System.out.println("Introduce la defensa del Munion (tampoco crees a Godzilla) : ");
				munion1.setDefensa(sc.nextInt());
				System.out.println("Introduce la vida del Munion : ");
				munion1.setVida(sc.nextInt());
				System.out.println("Elige un tipo poniendo el numero de la opcion: \n" + "\t1. FUEGO\n" + "\t2. AGUA\n"
						+ "\t3. TIERRA\n" + "\t4. PLANTA\n");
				int selection = sc.nextInt();
				if (selection == 1) {
					munion1.setTipoMuniemon(Tipo.FUEGO);
				} else if (selection == 2) {
					munion1.setTipoMuniemon(Tipo.AGUA);
				} else if (selection == 3) {
					munion1.setTipoMuniemon(Tipo.TIERRA);
				} else if (selection == 4) {
					munion1.setTipoMuniemon(Tipo.PLANTA);
				}
				while (selection < 1 || selection > 4) {
					System.out.println("Introduce un numero valido pls : ");
					eleccion = sc.nextInt();
				}

			} else if (eleccion == 2) {
				System.out.println(munion1.toString());
			}
			
			menu();
			eleccion = sc.nextInt();
			if (eleccion == 3) {
				System.out.println("Saliste del programa");
			}
		}
	}

	private static void menu() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Elige una opcion poniendo el numero de la opcion: \n" + "\t1. Dar de alta Muniemon\n"
				+ "\t2. Mostrar Muniemon\n" + "\t3. Salir del programa");
	}
}