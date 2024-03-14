package Actividad20;

public class Coche {
	
	/*Parte de diseño de clase

	Crear una clase en java que represente a una entidad Coche. Los coches tendrán 3 atributos dinámicos.

	id
	matricula
	marca
	
	Además, tendrá un atributo estático que llevará un contador del atributo id. Dicho contador NO lo podrá cambiar nadie, será gestionado por la propia clase.

	contadorID (estático)
	
	También tendrá 2 constantes que se podrá acceder a ellas desde cualquier lugar de la aplicación. Representarán como valor las dos marcas más utilizadas, que serán "TOYOTA" y "RENAULT".

	La clase tendrá solamente el constructor por defecto, que cuando se invoque, asignará automáticamente el id al coche. 
	Dicho id será el valor que tenga el atributo "contadorID", y luego le incrementará el valor en 1 para que no se dupliquen los ID del los coches. 

	Además los objetos tendrán la siguiente funcionalidad (métodos)

	Los objetos tendrán la opción de mostrar todos sus datos por pantalla (mediante el método toString())
	La clase tendrá la opción de mostrar el valor actual del contadorID
	La clase tendrá la opción de resetear el contadorID a cero.*/
	
	private String marca;
	private String matricula;
	private int id;
	
	static int contadorID;
	
	final String TOYOTA = "TOYOTA";
	final String RENAULT = "RENAULT";
	public Coche() {
		super();
		this.id = contadorID;
		contadorID ++;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", matricula=" + matricula + ", id=" + id + ", TOYOTA=" + TOYOTA + ", RENAULT="
				+ RENAULT + "]";
	}
	
	public void mostrarContadorID() {
		System.out.println(contadorID);
	}
	
	public void resetearContadorID() {
		contadorID = 0;
		
	}
	
	
}
