public class _09_Funciones_02 {

	public static void main(String[] args) {


		imprimirLong(34);
		imprimirSuma(45, 55);
		//imprimirLong("pepe");
		imprimirCadena("pepe");
		imprimirCadena("maria", "luisa");
		imprimirCadena("manolo", 3.33);
		
		//Gracias a la sobrecarga puedo usar la funcion imprimir
		//y dependiendo del parametro de entrada, se invocara una 
		//funcion u otra
		imprimir(34.78);
		imprimir("pepe");
		imprimir(2_000_000_000);
		
		System.out.println("Fin del programa");
	}
	
	//Las funciones tienen las siguientes partes
	//1. Visibilidad, desde donde se puede invocar a la función. De momentos haremos
	//que se pueda invocar desde cualquier parte -> public
	//2. Tipo de función, que puede ser estatica o dinamica. De momento todas 
	//nuestras funciones seran estaticas -> static
	//3. Parámetro de salida, el tipo de valor devuelto por la función. En caso 
	//de que no devuelva nada se usa la palabra "void". Solo se puede devolver 
	//un valor y se debe hacer con la palabra "return" se acabara la funcion
	//Cuando se ejecute la palabra "return" se acabara la funcion
	//4. Nombre de la función, representa como identificar e invocar la función
	//El nombre de la función sigue la misma regla que los nombres de las funciones.
	//Ademas se debe usar 'lowerCamelCase'
	//5. Parámetros de entrada, se ponen entre parentesis las variables que necesita 
	//la función para hacer su operación. Puede haber varios parametros de entrada 
	//separados por ","
	//6. Las funciones siempre van con un bloque '{}'
	public static double estaEsMiFuncion(int numero1, double numero2, String cadena1) {
		//Operaciones que realiza la funcion
		return 0;
		//System.out.println("PEPE"); //No se va a ejecutar porque esta depsues de la 'return'
	}
	//Podemos invocar a funciones dentro de otras funciones y suele ser habitual
	public static void imprimirLong(long n1) {
		System.out.println("----------------------------");
		System.out.println("salida: " + n1);
		System.out.println("----------------------------");	
	}
	
	public static void imprimirSuma(int n1, int n2) {
		long resultado = n1 + n2;
		imprimirLong(resultado);
	}
	
	public static void imprimirCadena(String s1) {
		System.out.println("----------------------------");
		System.out.println("salida: " + s1);
		System.out.println("----------------------------");
	}
	//En java existe el concepto de Firma de Funcion
	//La firma de una funcion es lo que hace que Java distinga univocamente
	//una funcion de otra
	//En Java la firma de una funcion esta compuesta de_
	//1. El nombre de funcion
	//2. El numero de parametros de entrada de una funcion
	//3. El tipo de parametros de entrada de una funcion
	//NO pertenece el parametro de salida 
	
	//La siguiente funcion daria error, porque tiene la MISMA FIRMA que la 
	//funcion de arriba. Para Java ambas funciones son iguales

	/*public static void imprimirCadena(String s1) {
		System.out.println("----------------------------");*/
	
	//La funcion de arriba no daria error si cambiamos el nombre 
	
	//Creamos otra funcion que se llame igual, PERO cambiamos el numero
	//de parametros de entrada. Por lo tanto, la firma es diferente
	public static void imprimirCadena(String s1, String s2) {
			System.out.println("----------------------------");
			System.out.println("Salida 1: " + s1);
			System.out.println("Salida 1 :" + s2);
			System.out.println("----------------------------");
	}
	//Ahora cambiamos la firma de la funcion, variando el TIPO de parametros de entrada
	public static void imprimirCadena(String s1, double d2) {
		System.out.println("----------------------------");
		System.out.println("Salida 1: " + s1);
		System.out.println("Salida 1 :" + d2);
		System.out.println("----------------------------");
	}
	
	//Concepto de SOBRECARGA de funciones
	//En Java sobrecargamos una funcion cuando dos o mas funciones tienen
	//el mismo nombre pero distinta firma, es decir, cambia el numero de 
	//parametros de entrada o cambia el tipo de parametros de entrada.
	
	//La funcion System.out.println() esta sobrecargada, tiene segun el parametro 
	//de entrada que se pase se invoca a un println o a otro.
	
	//Vamos a sobrecargar la funcion imprimir(), para hacerla generica
	
	public static void imprimir(long valor) {
		System.out.println("----------long--------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");	
	}
	
	public static void imprimir(String valor) {
		System.out.println("---------String-------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");	
	}
	
	public static void imprimir(double valor) {
		System.out.println("----------double------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");	
	}
	//La siguiente funcion daria error en tiempo de compilacion porque 
	//tiene la misma firma que el metodo de arriba. El parametro de 
	//salida NO pertenece a la firma de un metodo, por lo tanto 
	//Java no tiene manera de distinguirlos
	/*
	public static String imprimir(double valor) {
		System.out.println("----------double------------");
		System.out.println("salida: " + valor);
		System.out.println("----------------------------");	
		return "Manuel no te arrime a la pared, que te va a llenar de cal";
	}*/
	
	
}
	
	


