package _01_condicionales;
import java.util.Scanner;

public class _01_IF_01 {

	public static void main(String[] args) {
		//Los programas como hemos visto, se ejecutan linea a linea, hasta
		//que llegan al fin del bloque del metodo 'main' y entonces se acaba
		//el programa.
		
		//Existen diferentes maneras de alterar este secuencialidad, y muchas
		//veces es necesaria para crear algoritmos o hacer determinadas
		//funcionalidades.
		
		//Una manera es mediante los CONDICIONALES. Los condicionales evaluan
		//una expresion BOOLEAN, y en funcion de si la expresion es TRUE 
		//o FALSE, se tomara como una ruta u otra.
		
		//Una manera para haver condiciones es mediante la palabra reservada
		//'if'. La condicion a evaluar ira siempre entre parentesis.
		
		boolean cierto = true;
		if(cierto) //Como la variable 'cierto' es TRUE, entramos dentro del condicional
			System.out.println("La variable tiene valor TRUE");
		
		cierto = false;
		if(cierto) //Como la variable 'cierto' es TRUE, entramos dentro del condicional
			System.out.println("La variable tiene valor FALSE");
		
		if(!cierto)
			System.out.println("La variable tiene valor de FALSE");
		
		int numero = 7;
		if (numero>5)
			System.out.println("La variable 'numero' es mayor que 5");
		
		numero = 4;
		if (numero>5)
			System.out.println("La variable 'numero' es menor que 5");
		
		numero = 6;
		if (numero>5) {
			System.out.println("La variable 'numero' es menor que 5");
		}
		//NOTA: se considera buena practica de programacion en Java
		//hacer siempre bloque en los condicionales, ya que facilita 
		//la lectura. Es decir no importa si se hacer una linea o varias,
		//siempre es conveniente poner un bloque.
		
		//La palabra 'if' puede contener otra palabra reservada en caso
		//de que no se cumpla la condicion. La palanra es 'else'.
		if(numero>5) {
			System.out.println("El numero es mayor que 5");
		}else {
			System.out.println("El numero es menor o igual que 5");
		}
		
		//Normalmente las condiciones se basan en entradas de usuario o parametros
		//de entrada
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un numero para saber si es mayor, igual o menor 5");
		numero = sc.nextInt();
		
		if(numero>5) {
			System.out.println("El numero es mayor que 5");
		}else {
			System.out.println("El numero es menor o igual que 5");
		}
				
		//Existe otra variante del 'if' que nos da la opcion de poner mas condiciones
		//a valorar, que es el 'else if'. Podemos poner tantos 'else if' como queramos.
		
		if(numero>5) {
			System.out.println("El numero es mayor que 5");
		}else if(numero < 5) {
			//Si no se cumple la condicion 'if', valora esta otra opcion
			//pero ojo! Si la condicion del 'if' se cumple NO se valora 
			//esta otra opcion
		}
		
		else {
			System.out.println("El numero es menor o igual que 5");
		}
		
		System.out.println("Fin del programa");
	}

}
