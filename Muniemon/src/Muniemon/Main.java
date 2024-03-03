package Muniemon;

import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        
	    	/*
			 * En esta segunda parte del videojuego se pide que podamos trabajar con 2
			 * Muniemon, ya que los tendremos que enfrentar entre ellos. El menú quedará
			 * como sigue:
			 * 
			 * Dar de alta primer Muniemon Dar de alta segundo Muniemon Mostrar primer
			 * Muniemon Mostrar segundo Muniemon Atacar primer Muniemon a segundo Muniemon.
			 * Atacar segundo Muniemon a primer Muniemon. Salir del programa Con la opción 1
			 * y 2 se pedirán todos los datos al usuario y se guardaran en memoria (dos
			 * objeto diferentes)
			 * 
			 * Con la opción 3 y 4 se mostrarán todos los datos que se han guardado en
			 * memoria, del primer Muniemon o del segundo Muniemon respectivamente.
			 * 
			 * Con la opción 5 y 6 los muniemon se atacaran. Para ello, lo muniemon tendran
			 * un método llamado atacar(Muniemon) el cual se le pasará al objeto Muniemon
			 * que queremos atacar. En método restará una cantidad de vida al Muniemon
			 * pasado por parametro igual al ataque del Muniemon que ha invocado el método,
			 * ahora bien, antes de restar la vida, deberá comprobar la defensa del Muniemon
			 * atacado, ya que le restará ataque igual a la defensa del objetivo. Ejemplo,
			 * si el Muniemon atacante tiene un ataque de 5 y el muniemon atacado una
			 * defensa de 2, solo le restará 3 puntos de vida. Este método tambien tiene que
			 * controlar, que si un Muniemon tiene la vida igual o menos que 0, no podrá
			 * atacar porque estará muerto. Es interesante tambien decir quien ataca a quien
			 * y la vida que le ha restado.
			 * 
			 * Notese que con la opción 3 y 4 podemos ir viendo las vidas que tienen los
			 * respectivos Muniemon. Si el Muniemon está muerto, también habrá que decirlo.
			 * 
			 * El programa se ejecutará hasta que el usuario pulse salir del programa.
			 * 
			 * Una vez acabada la actividad se deberá versionar en un nuevo commit para
			 * tenerlo localizado. Se deberá crear un tag con la versión 0.2
			 */
	    	
	    	Scanner sc = new Scanner(System.in);
	        Muniemon munion1 = new Muniemon();
	        Muniemon munion2 = new Muniemon();

	        int todosLosDatos = 0;

	        while (true) {
	            menu();
	            int eleccion = sc.nextInt();

	            switch (eleccion) {
	                case 1:
	                case 2:
	                    if (todosLosDatos < 2) {
	                        pedirDatos(eleccion == 1 ? munion1 : munion2);
	                        todosLosDatos++;
	                    } else {
	                        System.out.println("Ya has añadido todos los datos de los Muniemon.");
	                    }
	                    break;
	                case 3:
	                case 4:
	                    System.out.println((eleccion == 3 ? munion1 : munion2).toString());
	                    break;
	                case 5:
	                case 6:
	                	 if (todosLosDatos < 2) {
	                	        System.out.println("Tienes que añadir todos los datos de los Muniemon antes de continuar!");
	                	    } else {
	                	        munion2.atacar(munion1);
	                	    }
	                	 break;
	                case 7:
	                    System.out.println("Saliste del programa");
	                    return;
	                default:
	                    System.out.println("Elige una opción válida.");
	            }
	        }
	    }

		private static void menu() {
			Scanner sc = new Scanner(System.in);

			System.out.println("Elige una opción:\n" + "1. Dar de alta primer Muniemon\n"
					+ "2. Dar de alta segundo Muniemon\n" + "3. Mostrar primer Muniemon\n"
					+ "4. Mostrar segundo Muniemon\n" + "5. Atacar primer Muniemon a segundo Muniemon\n"
					+ "6. Atacar segundo Muniemon a primer Muniemon\n" + "7. Salir del programa");
		}

	// Metodo para pedir los datos del munion al usuario. Se precisa de un Muniemon
	// como parametro de entrada que sera el munion que habra creado el usuario en
	// el main.
	// Despues de ello se ingresaran los datos del munion a medida que se imprima la
	// sentencia por pantalla.
	// Al final del metodo se verificara that the selection of the 'Tipo' class is
	// valid and if it's not, it will ask for a valid type until the type is valid.
	// The method returns the munion;
	public static Muniemon pedirDatos(Muniemon munion) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el nombre del Munion : ");
		munion.setNombre(sc.nextLine());
		System.out.println("Introduce el ataque del Munion (no lo cheates) : ");
		munion.setAtaque(sc.nextInt());
		System.out.println("Introduce la defensa del Munion (tampoco crees a Godzilla) : ");
		munion.setDefensa(sc.nextInt());
		System.out.println("Introduce la vida del Munion : ");
		munion.setVida(sc.nextInt());
		System.out.println("Elige un tipo poniendo el numero de la opcion: \n" + "\t1. FUEGO\n" + "\t2. AGUA\n"
				+ "\t3. TIERRA\n" + "\t4. PLANTA\n");
		int selection = sc.nextInt();
		if (selection == 1) {
			munion.setTipoMuniemon(Tipo.FUEGO);
		} else if (selection == 2) {
			munion.setTipoMuniemon(Tipo.AGUA);
		} else if (selection == 3) {
			munion.setTipoMuniemon(Tipo.TIERRA);
		} else if (selection == 4) {
			munion.setTipoMuniemon(Tipo.PLANTA);
		}
		while (selection < 1 || selection > 4) {
			System.out.println("Introduce un numero valido pls : ");
			selection = sc.nextInt();
		}
		return munion;
	}
}