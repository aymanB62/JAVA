public class _06_Conversiones {
	public static void main(String [] args) {
		long numeroLargo = 1_000L;
		//podemos igualar siempre variable del mismo tipo
		//sin problema
		long numeroLargo2 = numeroLargo;
		//Java no puede saber cuando ejecuta el programa el
		//valor de la variable. Por lo que no va ha dejar 
		//igualar un entero con un largo
		int numeroEntero = 0;
		numeroLargo = numeroEntero;
		
		//Conversion de datos
		//Si queremos convertir un tipo de dato a otro,
		//debemos usar el 'casting'.
		numeroLargo = 10000L;
		//Cateamos el numero largo. Para castear se pone el tipo de dato 
		//al que queremos cambiarlo entre parentesis justo antes del
		//tipo de dato que queremos 'castear'
		numeroLargo = 2_147_483_648L;//No entra en un entero
		//Hay que ser responsable con los casting, porque
		//java va a hacer lo posible para hacer el cast, pero eso
		//no significa que este bien hecho.
		numeroEntero = (int)numeroLargo;
		//En este caso, java da la vuelta al numero, y empieza
		//a contar desde los negativos.
		System.out.println(numeroEntero);
		
		numeroEntero = (int)numeroLargo * 2;//Casting
		System.out.println(numeroEntero);//Volvemos al cero
		
		double numeroDouble = 20.55;
		//numeroLargo = numeroDouble
		numeroLargo = (long)numeroDouble;
		System.out.println(numeroLargo);
		//Con estas cosas porque es posible que se pierda información
		numeroDouble = 30.00;
		numeroLargo = (long)numeroDouble;
		
		//Boolean
		boolean bool1 = false;
		System.out.println(bool1);
		
		
	}
}
