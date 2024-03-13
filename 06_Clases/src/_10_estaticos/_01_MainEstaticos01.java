package _10_estaticos;

public class _01_MainEstaticos01 {

	private int atributo1;
	private static int atributo2;
	
	public static void main(String[] args) {
		presentarse();
		_01_MainEstaticos01.presentarse();

		//presentarseDinamicamente();
		_01_MainEstaticos01 me = new _01_MainEstaticos01();
		me.presentarseDinamicamente();
		
		//atributo1 = 9;
		me.atributo1 = 9;
		
		atributo2 = 10;
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		Persona.numeroPersonas = 2;
		
		p1.edad = 45;
		p2.edad = 56;
		
		p1.imprimirEdadDinamico();
		p2.imprimirEdadDinamico();
		
		Persona.imprimirEdadEstatico(p1);
		Persona.imprimirEdadEstatico(p2);
	}
	
	public static void presentarse() {
		atributo2 = 89;
		//this.
		System.out.println("Hola parte estatica");
	}
	
	public void presentarseDinamicamente() {
		atributo1 = 9;
		this.atributo1 = 9;
		
		atributo2 = 23;
		_01_MainEstaticos01.atributo2 = 34;
		System.out.println("Hola parte dinamica");
	}

}
