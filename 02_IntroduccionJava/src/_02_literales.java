public class _02_literales {
	
	//Un proyecto java puede tener varias clases con
	//metodos "main". El main que se ejecutara sera
	//sobre aquel fichero que hagamos el "Run us"
	public static void main(String[] args) {
		System.out.println("Literales en java");
		
		//En java, como en todos los lenguajes de programacion, tenemos
		//lo que llamamos literales
		
		//Una literal es un valor constante formado por una secuencia de caracteres. 
		//Cualquier declaración en Java que defina un valor constante 
		//-un valor que no pueda ser cambiado durante la ejecución del programa- 
		//es una literal.
		
		//Tenemos los siguientes tipos de literales en java
		//Literales de cadena de texto, van entre comillas dobles
		System.out.println("Esto es un literal de cadena");
		
		//Literales de caracter, van entre comillas simples y solo puede haber uno
		System.out.println('a');
		
		//Literales booleanos, pueden ser de dos tipos, verdadero (true)
		//y falso (false). Se utilizan las palabras reservadas 'true' y 'false'
		//respectivamente
		System.out.println(true);
		System.out.println(false);
		
		//Literales de numeros enteros (int), caracteres numericos que van desde
		//–2,147,483,648 a 2,147,483,647
		//los numeros enteros van sin coma y sin punto
		System.out.println(214783647);
		//Podemos utilizar "_" para separar los numeros y leerlo mejor
		System.out.println(1000000000);
		System.out.println(1_000_000_000);//equivalente a la anterior, pero se lee mejor
		
	}
	
}
