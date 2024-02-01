import java.util.Scanner;

public class _07_EntradaSalida {

	public static void main(String[] args) {
		//Es muy habitual en las app's tener entradas de datos del usuario
		//y salida de datos una vez procesada la informcaion
		
		//En java tenemos dos maneras de presentar la informacion:
		//1. System.out -> Salida estandar de consola
		//2. System.err -> Salida de errores de consola
		
		System.out.println("Salida estandar de consola");
		System.err.println("Salida de errores de consola");
		
		//Ojo: System.out y System.err trabajan con flujos diferentes
		//de salidas, por lo tanto si dos sentencias estan muy juntas
		//puede que salgan de manera diferente
		
		//En java tenemos una manera de recoger informacion a taraves de 
		//la consola, y es mediante "System.in"
		//Lamentablemente debemos de apoyarnos en otras clases para
		//poder recoher la informacion a partir de este "System.in"
		//El caso más habitual es mediante la clase "Scanner".
		
		//Para ello debemos de crear una variable de tipo Scanner y
		//su correspondiente Objeto, diciendole que lea de "System.in"
		Scanner sc = new Scanner(System.in);
		
		//Una vez creada la variable y el objeto podemos empezar a usar
		//metodos del objeto para capturar la información. Los metodos
		//son funcionalidades que puedes aplicar los objetos.
		//Invocamos un metodo de un objeto mediante el operador "."
		
		//Mediante el metodo "nextLine()",
		//El programa se quedara parado en esa linea hasta que el usuario
		//introduzca una frase para leer.
		System.out.println("Introduzca una frase para leer:");
		//Normalmente, el valor que introduzca el usuario debemos
		//de almacenarla en algun lugar, en una variable.
		//En este caso como queremos leer una frase, vamos a utilizar
		//un "String" para almacenar el resultado
		String frase = sc.nextLine();
		System.out.println("hola:" + frase);
		
		//Una vez creado el "Scanner" tiene metoso para recoger distintos tipos de dato.
		//Si queremos recoger un entero, debemos utilizar "nextLine()"
		System.out.println("Introduzca un numero");
		String s1 = sc.nextLine();
		System.out.println("Introduzca otro numero:");
		String s2 =sc.nextLine();
		String s3 = s1 + s2;
		System.out.println(s3);
		
		//La clase "Scanner" tiene metodos para recoger distintos tipos de datos.
		//Si queremos recoger un entero, debemos utilizar "nextInt()"
		//No podemos guardar un "int" en una variable "String"
		
		System.out.println("Introduzca un numero: ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca otro numero: ");
		int n2 = sc.nextInt();
		int n3 = n1 + n2;
		System.out.println("El resultado de la suma de n1 y n2 es: " + n3);
		
		//La clase escaner tiene un pequeño problema. Siempre que queramos recoger
		//una cadena despues de haber recogido cualquier dato que no sea cadena
		//Ejemplo, recogemos un int y luego una cadena
		//En este caso, debemos de recoger dos veces la cadena para que no de problemas.
		
		System.out.println("Introduzca la cadena a recoger: ");
		//Como el ultimo dato que recogimos con Scanner fue un 'int'
		//ahora debemos hacer dos nextLine() para que el siguiente funcione.
		sc.nextLine();
		String cadena = sc.nextLine();
		System.out.println("La cadena recogida es: " + cadena);
		
	}

}
