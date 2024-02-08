package Actividad13;

import java.util.Arrays;

public class Usuario {
//	Parte de diseño de clase
//
//	Crear una clase en java que represente a una entidad Usuario. Los usuario tendrán 3 atributos.
//
//	id
//	nombre
//	valoraciones, que representará un array de valoraciones puestas por otros usuarios, del 1 al 10.
	
	String id;
	String nombre;
	double[] valoraciones;
	
//	Se tendrán que crear 2 constructores:
//
//	uno sin parámetros, en el que se dejarán los valores por defecto.
	
	public Usuario() {
		
	}
	
//	otro con todos los parámetros en el que podamos crear el objeto con todos los valores que queramos.
	
	public Usuario(String id, String nombre, double[] array) {
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = array;
	}

//	Además los objetos tendrán la siguiente funcionalidad (métodos)
//
//	Los objetos tendrán la opción de mostrar todos sus datos por pantalla (mediante el método toString())
	
//	private void imprimirValoraciones() {
//		for(int i = 0; i < this.valoraciones.length; i++) {
//			System.out.println(this.valoraciones[i]);
//		}
//	}
//	
//	public void imprimir() {
//		System.out.println("ID : " + this.id + "\tNombre : " + this.nombre + "\nLista de valoraciones : ");
//		imprimirValoraciones();
//	}

	public String toString() {
		return "Usuario [id = " + id + ", nombre = " + nombre + ", valoraciones = " + Arrays.toString(valoraciones) + "]";
	}
	
//	Los objetos tendrán la opción de devolver su valoración media. Por ejemplo, si un objeto tiene [3,5,7], devolverá 5.
	
	public int mediaDeValoraciones() {
		int sumador = 0;
		for(int i = 0; i < this.valoraciones.length; i++) {
			sumador += this.valoraciones[i];
		}
		int media = sumador / this.valoraciones.length;
		return media;
	}
	
//	Los objetos tendrán la opción de mostrar todas sus valoraciones.
	
	public void imprimirValoraciones() {
		System.out.println(Arrays.toString(valoraciones));
	}
	
//	Los objetos tendrán la opción de decir cuantas valoraciones superan una valoración dada. 
	
	public void valoracionMayorMenor(Usuario v) {
		int sumador = 0;
		for(int i = 0; i < this.valoraciones.length; i ++) {
			v.valoraciones[1] = this.valoraciones[i];
				if(this.valoraciones[i] > v.valoraciones[1]) {
					sumador++;
				}
		}
		System.out.println("Hay  " + sumador + "mayor");
	}
	
//	Esto es, tendrán un método que reciba como parámetro de entrada un numero del 1 al 10, dicho método devolverá 
//	cuantas valoraciones superan dicha valoración. Por ejemplo, si un usuario tiene las valoraciones [1,4,7,10] 
//			y le pasamos un 5, el método me tiene que devolver un 2.
//	Los objetos tendrán la opción de devolver si una valoración dada supera o no la valoración medía del usuario. 
//	Por ejemplo, si un objeto tiene  [3,5,7] y le pasamos un 4, devolverá false, pero si le pasamos un 6 devolverá true.
//	Parte de creación de objetos
//
//	Habrá que crear otra clase que ejecute el programa principal y cree 3 usuarios diferentes. 
//	Los valores de los usuarios serán los que se metan por teclado. Los usuarios tendrán que ser introducidos en un array de usuarios.
//
//	A continuación debemos de invocar todos sus métodos y observar los diferentes resultados. 
//	Tendremos que invocar los métodos recorriendo el array de usuarios con un bucle, no podemos invocar los métodos fuera de dicho bucle.
	
	
}
