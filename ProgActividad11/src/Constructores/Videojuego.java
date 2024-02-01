package Constructores;

public class Videojuego {
	/*Parte de diseño de clase

	Crear una clase en java que represente a una entidad Videojuego. Los Videojuegos tendrán 6 atributos.

	id
	nombre
	puntuación
	precio (en euros)
	fecha de creación (DD/MM/YYY)
	es de segunda mano?
	Se tendrán que crear 3 constructores:

	uno sin parámetros en el que se establezca la fecha de creación por defecto a "01/01/1970" (constructor por defecto)
	otro con todos los parámetros en el que podamos crear el objeto con todos los valores que queramos.
	otro en el que solo lo establezcamos con el nombre y la fecha de creación
	

	*/
	
	String id;
	String nombre;
	int puntuacion;
	double precio;
	String creationDate;
	boolean secondHand;	
	
	public Videojuego() {
		this.creationDate = "01/01/1970";
	}
	
	public Videojuego(String id,String nombre,int puntuacion,double precio,String creationDate, boolean secondHand) {
		this.id = id;
		this.nombre = nombre;
		this.puntuacion = puntuacion;
		this.precio = precio;
		this.creationDate = creationDate;
		this.secondHand = secondHand;
	}
	public Videojuego(String nombre, String creationDate) {
		this.creationDate = creationDate;
		this.nombre = nombre; 
	}
	
	/*
	 * Además los objetos tendrán la siguiente funcionalidad (métodos)
	 * Los objetos tendrán la opción de mostrar todos sus datos por pantalla
	 * Los objetos tendrán la opción de mostrar solamente su nombre y su puntuación
	 * Los objetos tendrán la opción de mostrar su precio en libras.
	 * Los objetos tendrán la opción de mostrar su fecha en formato "YYYY-MM-DD"
	 * Los objetos tendrán la opción de devolver un valor con descuento si el videojuego es de segunda mano. Esto es, si el videojuego es de segunda mano, el método devolverá el precio con un 30% de descuento.
	 * Los objetos tendrán la opción de mostrar si un videojuego es apto para jugar o no. Un videojuego es apto para jugar si su puntuación es de 5 o mas.
	 * Los objetos tendrán la opción de mostrar todos los números naturales que hay entre su nota y el número 10;
	 * El objeto tendrá la opción de devolver si un videojuego es más caro que otro. 
	 * Esto es, el método devolverá "true" o "false" en función de si un objeto videojuego 
	 * pasado por parámetro es mas caro o no que el objeto que está invocando el método.
	 * Parte de creación de objetos
	 * 
	 * Habrá que crear otra clase que ejecute el programa principal y cree 
	 * 3 videojuegos diferentes con los tres constructores que hemos creado. 
	 * Al objeto creado con el constructor por defecto, debemos de cambiar
	 * todos sus atributos menos la fecha, pidiendo los valores al usuario 
	 * mediante la clase Scanner. Los otros dos objetos los podemos dejar tal y como se crearon.
	 * A continuación debemos de invocar todos sus métodos y observar los diferentes resultados.*/
	
	public void imprimir() {
		System.out.println("\n\n \'imprimir\' method\n");
		System.out.println("\tID: " + this.id + "\n\tNombre: " +  this.nombre + "\n\tPuntuacion: " + this.puntuacion + "\n\tPrecio: " + this.precio + "\n\tFecha de creacion: " + this.creationDate + "\n\tEs de segunda mano?: " + this.secondHand);
	}
	public void imprimirNombrePuntuacion() {;
		System.out.println("\n\n \'imprimirNombrePuntuacion\' method\n");
		System.out.println("\tPuntuacion: " + this.puntuacion + " Nombre: " + this.nombre);
	}
	public void libras() {
		System.out.println("\n\n \'libras\' method\n");
		System.out.println("\t"+this.precio * 1.2);
	}
	public void fecha() {
		System.out.println("\n\n \'fecha\' method\n");
		String fechaInvertida;
		String[] array = this.creationDate.split("/");
		fechaInvertida = array[2] +"/"+ array[1] +"/"+ array[0];
		System.out.println("\t"+fechaInvertida);
	}
	public double descuento() {
		System.out.println("\n\n \'descuento\' method \n");
		double descuento = this.precio * 0.3;
		double total = this.precio - descuento;
		return total;
	}
	public void apto() {
		System.out.println("\n\n \'apto\' method\n");
		if (this.puntuacion >=5) {
			System.out.println("\tEl juego es apto");
		}
		else {
			System.out.println("\tEl juego no es apto");
			}
	}
	public void numerosNaturales() {
		System.out.println("\n\n \'numerosNaturales\' method\n");
		for(int i = this.puntuacion;i <=10; i ++) {
			System.out.println("\t"+i);
		}
	}
	public boolean cualEsCaro(Videojuego v) {
		System.out.println("\n\n \'cualEsCaro\' method\n");
		if(v.precio>this.precio) {
			System.out.println("¿Es " + v.nombre + " mayor que "+ this.nombre+"?");
			return true;
		}else {
			System.out.println("¿Es " + v.nombre + " mayor que "+ this.nombre+"?");
			return false;
		}
		
	}
}
