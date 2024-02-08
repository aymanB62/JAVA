package Actividad14;

import java.util.Arrays;

public class Equipo {
	
//	Parte de diseño de clase
	
//	Crear una clase en java que represente a una entidad Equipo. El equipo tendrá 2 atributos
	
//	nombre
//	lista con los nombres de los jugadores del equipo.
	
	String[] lista;
	String nombre;
	
	public Equipo(){
	}
//	Se tendrán que crear 2 constructores:
//
//	uno sin parámetros, en el que se dejarán los valores por defecto.
//	otro con todos los parámetros en el que podamos crear el objeto con todos los valores que queramos.
//	Además los objetos tendrán la siguiente funcionalidad (métodos)
	
	public Equipo(String[] lista, String nombre) {
		this.lista = lista;
		this.nombre = nombre;
	}

//	Los objetos tendrán la opción de mostrar todos sus datos por pantalla (mediante el método toString())
	
	@Override
	public String toString() {
		return "Equipo [lista=" + Arrays.toString(lista) + ", nombre=" + nombre + "]";
		}
	
//	Los objetos tendrán la opción de mostrar todos sus jugadores
		
	public void mostrarJugadores() {
		for(int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	}
		
//	Los objetos tendrán la opción de devolver si existe un jugador pasado por parámetro.
//	Los objetos tendrán la opción de devolver el numero de jugadores que tienen.
//	Los objetos tendrán la opción de devolver si el número de jugadores que tienen es apto para jugar. 
	//Un equipo es apto para jugar si tiene al menos 7 jugadores.
//	Los objetos tendrán la opción de devolver si una lista de jugadores pasada por parámetro es exactamente igual a su lista de jugadores
//	Los objetos tendrán la opción de devolver si un equipo pasado por parámetro es exactamente igual al mismo. 
	//Un equipo es exactamente igual si tiene el mismo nombre y la misma lista de jugadores con los mismos nombres.
//	Parte de creación de objetos
//
//	Habrá que crear otra clase que ejecute el programa principal y cree 2 equipos diferentes. Los valores de los equipos serán los que se metan por teclado. 
	// equipos tendrán que ser introducidos en un array de equipos.
//
//	A continuación debemos de invocar todos sus métodos y observar los diferentes resultados. 
	//Tendremos que invocar los métodos recorriendo el array de equipos con un bucle, no podemos invocar los métodos fuera de dicho bucle.
}
