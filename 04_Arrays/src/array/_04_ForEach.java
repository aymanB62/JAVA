package array;

public class _04_ForEach {

	public static void main(String[] args) {
		//Hay una manera mas sencilla de recorrer arrays sin tener que usar
		//el for normal, qeu es el llamado "for-each"
		
		String[] blackWidow = new String[4];
		blackWidow[0] = "Natasha";
		blackWidow[1] = "Romanoff";
		blackWidow[2] = "+0049983095430";
		blackWidow[3] = "Molotov";
		
		//La estructura es la siguiente:
		//for(VARIABLE : ARRAY) {}
		//Variable : va ha contener el VALOR de cada una de las posiciones del arrat 
		//para cada una de las iteraciones. Debe de ser del mismo tipo que el array (de momento)
		
		for(String s: blackWidow) {
			System.out.println(s);
		}
		
		//Esta manera tiene ventajas e incovenientes:
		//ventajas
		//1- Es muy sencillo de recorrer completamente un array contodas sus pociciones
		//2- Es mas rapido de escribir
		
		//Inconvenientes
		//1- No tenemos acceso al indice
		//2- No podemos alterar la manera de recorrer el array.Por ejemplo,
		//no podemos acceder solamente a los pares
		
		//Podemos utilizar variables auxiliares para controlar el indice.
		int posicion = 1;
		for(String s : blackWidow) {
			System.out.println(posicion + " - " +s);
			posicion++;
		} 
	}

}
