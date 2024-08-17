package Ejercicio05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*Crear una clase en java que represente a una entidad Usuario. Los usuario tendrán 3 atributos.

		id
		nombre
		valoraciones, que representará un array de valoraciones puestas por otros usuarios, del 1 al 10.
		
		Se tendrán que crear 2 constructores:

		uno sin parámetros, en el que se dejarán los valores por defecto.
		otro con todos los parámetros en el que podamos crear el objeto con todos los valores que queramos.
		Además los objetos tendrán la siguiente funcionalidad (métodos)

		Los objetos tendrán la opción de decir cuantas valoraciones superan una valoración dada. Esto es, tendrán un método que reciba como 
		parámetro de entrada un numero del 1 al 10, dicho método devolverá cuantas valoraciones superan dicha valoración. Por ejemplo, si 
		un usuario tiene las valoraciones [1,4,7,10] y le pasamos un 5, el método me tiene que devolver un 2.
		Los objetos tendrán la opción de devolver si una valoración dada supera o no la valoración medía del usuario. 
		Por ejemplo, si un objeto tiene  [3,5,7] y le pasamos un 4, devolverá false, pero si le pasamos un 6 devolverá true.
		Parte de creación de objetos

		Habrá que crear otra clase que ejecute el programa principal y cree 3 usuarios diferentes. Los valores de los usuarios serán 
		los que se metan por teclado. Los usuarios tendrán que ser introducidos en un array de usuarios.

		A continuación debemos de invocar todos sus métodos y observar los diferentes resultados. Tendremos que invocar los métodos 
		recorriendo el array de usuarios con un bucle, no podemos invocar los métodos fuera de dicho bucle.*/
		
		Scanner sc = new Scanner(System.in);

		System.out.println("tamaño del array");
		int tamañoArray = sc.nextInt();
		
		double[] valoraciones = new double[tamañoArray];

		
		Usuario u1 = new Usuario("name", "oeoe", valoraciones);
		
		u1.valoraciones[0] = 2;
		u1.valoraciones[1] = 4;
		u1.valoraciones[2] = 6;
		u1.valoraciones[3] = 4;
		
		//System.out.println(u1.mediaValoraciones());
		//u1.mostrarValoraciones();
		u1.valoracionSuperior(5);
		
	}

}
