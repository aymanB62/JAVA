public class _03_variables {

	public static void main(String[] args) {
		//Llamamos "declaracion de una variable" cuando creamos una variable
		//por primera vez para usarla durante su ciclo de vida
		//Para declarar una variable en java primero especificamos el tipo,
		//luego el nombre y lo igualamos a un valor
		//TIPO_VARIABLE NOMBRE_VARIABLE
		
		//Ejemplo de variable entera
		int numero1 = 1;
		
		//Una vez declaramda una variable NO podemos volver a declararla mientras exista
		//Podemos imprimir por pantalla valores de una variable llamandolas por su nombre
		System.out.println(numero1);
		
		//Podemos crear variables de distintos tipos
		//Variables boobleaneas
		boolean variableBoolean = true;
		System.out.println(variableBoolean);
		//Las variables en java no puede empezar por numero
		//int 1numero = 0; (error)
		//Las variables en java DEBEN empezar por:
		//1. caracter alfabetico
		//2. guion bajo'_'
		//3. simbolo del dolar $
		
		//variable de tipo double 
		double variableDouble = 12.23;
		System.out.println(variableDouble);
		
		
		//Variable de tipo long
		long variableLarga = 23L;
		System.out.println(variableLarga);
	}

}
