package JuegoPeleas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Vamos a hacer un videojuego aplicando todas las técnicas de herencia que
		 * hemos aprendido hasta ahora. Las reglas son las siguientes:
		 * 
		 * Podemos tener varios tipos de personajes (Mago, Guerrero, Curanderos)
		 * 
		 * Todos podrán tener un arma y un nombre, además tendrán unos puntos de vida y
		 * un atributo especifico, los magos tendrán inteligencia, los guerreros tendrá
		 * fuerza y los Curanderos tendrá Sabiduría.
		 * 
		 * Habrá diferentes tipos de armas: Espadas, Arcos, Hechizos y Rezos, y cada
		 * arma hará un daño especifico. Las espadas y arcos serán armas que los
		 * guerreros usen mejor, los magos usaran de mejor manera los hechizos, mientras
		 * que los curanderos usaran mejor los Rezos
		 * 
		 * Los personajes podrán atacar a otro personaje, y cuando le ataque le restara
		 * una vida equivalente al daño del arma, pero si usa un arma de su tipo, además
		 * le añadirá un daño equivalente al valor de su atributo especifico
		 * 
		 * La clase main creara dos personajes, y los enfrentara entre ellos por turnos,
		 * el combate acabará cuando uno de los dos muera, es decir sus puntos de vida
		 * sean inferiores a 0. Se mostrará el vencedor. Se puedo usar una clase combate
		 * como en el Muniemon.
		 */

		Personaje guerrero1 = new Guerrero();
		Arma espada1 = new Espada();
		Scanner scanner = new Scanner(System.in);

		guerrero1.setArma(espada1);
		guerrero1.setNombre("pepe");
		guerrero1.setVida(5);

		guerrero1.checkArma(espada1);
		
		Personaje mago1 = new Mago();
		Arma hechizo1 = new Hechizo();

		mago1.setArma(espada1);
		mago1.setNombre("juan");
		mago1.setVida(5);

		mago1.checkArma(hechizo1);
		
		
		while (mago1.getVida() > 0 && guerrero1.getVida() > 0) {
            System.out.println("Turno de " + mago1.getNombre());
            System.out.println(mago1.getNombre() + " ataca a " + guerrero1.getNombre());
            mago1.atacar(guerrero1);

            if (guerrero1.getVida() <= 0) {
                System.out.println(guerrero1.getNombre() + " ha sido derrotado! " + mago1.getNombre() + " gana.");
                break;
            }

            System.out.println("Turno de " + guerrero1.getNombre());
            System.out.println(guerrero1.getNombre() + " ataca a " + mago1.getNombre());
            guerrero1.atacar(mago1);

            if (mago1.getVida() <= 0) {
                System.out.println(mago1.getNombre() + " ha sido derrotado! " + guerrero1.getNombre() + " gana.");
                break;
            }

            System.out.println("Presiona Enter para continuar...");
            scanner.nextLine();
        }

	}

}
