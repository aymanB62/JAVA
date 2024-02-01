package Actividad03;

public class Ejercicio_03 {

	public static void main(String[] args) {
		//Crea un programa que utilice un número entero y luego convierta ese número en punto flotante. 
		//Muestra el valor resultante en la pantalla. ¿Hace falta hacer un casting en este caso?¿Hemos perdido información?
		int numeroEntero = 10;
		float numeroFlotante;
		numeroFlotante = numeroEntero;
		System.out.println(numeroFlotante);
		
		
		//Realmente no hace falta hacer el casting, porque los numero flotantes ocupan más espacio que los numeros enteros
		//por lo tanto un flotante puede contener un entero.
		//Al transformar el número entero a coma flotante, el número no ha perdido información.
		
//-------------------------------------------------------------------------------------------------------------------------------------------
		
		//Conversión de Flotantes a Enteros: Crea un programa que utilice un número de punto flotante y 
		//luego convierta ese número en un número entero. 
		//Muestra el valor resultante en la pantalla. ¿Hace falta hacer un casting en este caso?¿Hemos perdido información?
		float numeroFlotante2 = 11.6F;
		int numeroEntero2;
		numeroEntero2 = (int)numeroFlotante2;
		System.out.println(numeroEntero2);
		
		//En este caso si hace falta porque el operador 'float' ocupa más espacio que el
		//operador 'int', y si no "casteo" no me deja ejecutar el programa.
		//Tambien hemos perdido información, pero ese es el coste de hacer este casteo.
		
//-------------------------------------------------------------------------------------------------------------------------------------------
		
		//Conversión de Double a Enteros: Crea un programa que utilice un número double 
		//y luego convierta ese número en un número entero. 
		//Muestra el valor resultante en la pantalla. 
		//¿Hace falta hacer un casting en este caso? ¿Hemos perdido información?
		
		double numeroDoble = 2.2;
		int numeroEntero3;
		numeroEntero3 = (int)numeroDoble;
		System.out.println(numeroEntero3);
		
		//En este caso si hace falta porque el operador 'double' ocupa más espacio que el
		//operador 'int', y si no "casteo" no me deja ejecutar el programa.
		//Tambien hemos perdido información, pero ese es el coste de hacer este "casteo".
		
//-------------------------------------------------------------------------------------------------------------------------------------------

		//Conversión de Enteros a Double: Crea un programa que utilice un número entero y 
		//luego convierta ese número en un número double. 
		//Muestra el valor resultante en la pantalla. 
		//¿Hace falta hacer un casting en este caso?¿Hemos perdido información?
		
		int numeroEntero4 = 8;
		double numeroDoble2;
		numeroDoble2 = numeroEntero4;
		System.out.println(numeroDoble2);
		
		//En este caso no hace falta porque el operador 'int' ocupa menos espacio que el
		//operador 'double'.
		//No hemos perdido ninguna informacion
		
//-------------------------------------------------------------------------------------------------------------------------------------------

		//Conversión de Caracteres (char) a Enteros: Escribe un programa que utilice un carácter y 
		//luego convierte ese carácter en su valor entero y muestra el valor 
		//resultante en la pantalla. 
		//¿Podemos realizar la operación? ¿Hace falta hacer un casting?
		
		char caracterChar = 'g';
		int numeroEntero5;
		numeroEntero5 = caracterChar;
		System.out.println(numeroEntero5);
		
		//En este caso no hace falta porque el operador 'int' ocupa menos espacio que el
		//operador 'double'.
		//No hemos perdido ninguna información
		
//-------------------------------------------------------------------------------------------------------------------------------------------

		//Conversión de Enteros a Caracteres: Escribe un programa que utilice un entero y 
		//luego convierte ese entero en su valor de carácter y muestra el valor resultante en la pantalla. 
		//¿Podemos realizar la operación? ¿Hace falta hacer un casting?
		int numeroEntero6 = 1;
		char  caracterChar2;
		caracterChar2 = (char) numeroEntero6;
		System.out.println(caracterChar2);
		
		//En este caso no se puede hacer el casting. Aunque no de error el programa
		//al ejecutarlo sale un simbolo "". En este caso no se tendira que hacer 
		//casting ya que no devuelve un resultado.
		
//-------------------------------------------------------------------------------------------------------------------------------------------
		
		//Conversión de Cadenas a Entero: Escribe un programa que utilice una cadena y luego convierte 
		//ese carácter en su valor entero y muestra el valor resultante en la pantalla. 
		//¿Podemos realizar la operación? ¿Hace falta hacer un casting?
		
		//String cadenaCaracteres = "hola";
		//int  numeroEntero7;
		//cadenaCaracteres = (String)numeroEntero7;
		//System.out.println(numeroEntero7);
		
		//Aquí directamente no se puede hacer el casting de ninguna manera.
		//No se deberia de hacer el casting. Si se ejecuta nos dará error, por ello lo comento
		
//-------------------------------------------------------------------------------------------------------------------------------------------
		
		//Conversión de Cadenas(String) a Caracteres (char): Escribe un programa que utilice una cadena con un 
		//solo caracter y luego convierte ese valor a una variable de tipo carácter y lo muestre en la pantalla. 
		//¿Podemos realizar la operación? ¿Hace falta hacer un casting?
		
		//String cadenaCaracteres = "hola";
		//char  caracterChar3;
		//cadenaCaracteres = (String)caracterChar3;
		//System.out.println(caracterChar3);
		
		//Cannot cast from char to String. En este caso es igual que el anterior. No se puede hacer nada
		//para transformar una cadena de caracateres a caracteres char individuales.
		//No hay que hacer casting.
	}

}
