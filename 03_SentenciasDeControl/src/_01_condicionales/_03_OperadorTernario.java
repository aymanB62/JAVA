package _01_condicionales;

public class _03_OperadorTernario {

	public static void main(String[] args) {
		//OPERADOR TERNARIO
		//-----------------
		//Con este operador buscamos haver una sentencia "IF-ELSE"
		//de una manera rapida y en unsa sola linea
		
		//La estructura es la siguiente
		//EXPRESION_BOOLEAN ? CASO_VERDADERO : CASO_FALSO;
		//En caso será lo que devuelva la expresion, que normalmente lo almacenaremos
		//en una variable.
		
		//Ejemplo
		int numero = 5;
		String cadena = (numero<=5) ? "Numero menor o igual que 5" : "Numero mayor que 5";
		System.out.println(cadena);
		
		//Equivalente al ternario
		if(numero<=5) {
			System.out.println("Numero menor o igual que 5");
		}else {
			System.out.println("Numero mayor que 5");
		}
		
		//Otro ejemplo
		String text = (numero%2 == 0)? "Numero impar":"Numero impar";
		System.out.println(text);
	}

}
