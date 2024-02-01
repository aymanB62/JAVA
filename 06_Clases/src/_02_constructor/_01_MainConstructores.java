package _02_constructor;

public class _01_MainConstructores {
	
	public static void main(String[] args) {
		//Siempre dentremos que crear un objeto a traves de 
		//un constructor
		Persona p = new Persona();
		System.out.println(p.edad);
		
		Persona p2 = new Persona();
		System.out.println(p.peso);
	
		//Vamos a invocar el constructor con parametros.
		Persona p3 = new Persona("CR7", 40, 90, true);
		
		System.out.println(p3.nombre);
		System.out.println(p3.edad);
		System.out.println(p3.peso);
		System.out.println(p3.estaCasado);
	}
}
