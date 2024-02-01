package _02_constructor;

//Siempre que queramos construir un objeto,, necesitamos de la ayuda de lo que se
//conoce como "Constructor"

//Un Constructor en POO es un metodo especial el cual se usa para la creacion
//de los objetos. Es imperativo usar siempre algun constructor para crear un objeto

//En java se permite crear mas de nu constructor. El constructor de un objeto en java
//sigue la misma regla de los metodos, es decir, la fierma de un
//metodo o funcion se puede extrapolar al constructor, pero no podemos cambiar
//el nombre del constructor. El nombre del constructor SIEMPRE tendra que 
//ser el nombre de la clase. Los constructores cuando se crean no devuelven NADA,
//ni siquiera "void"

public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean estaCasado;
	
	//En java si no creamos un constructor, la JVM de java nos proporcionara 
	//el llamado "constructor por defecto", que es un constructor sin parametros de entrada.
	
	//El constructor por defecto es el siguiente:
	public Persona() {
		//Este seria el constructor por defecto que crea java automaticamente
		//un constructor VACIO.
		//OJO!! Siempre y cuando NO creemos mas constructores
		//Dicho de otra manera, si nosotros no creamos constructor, java
		//creara el constructor por defecto, en cuanto creemos un constructor
		//java NO creara ningun constructor mas.
		
		//Podemos alterar el comportamiento de un constructor
		System.out.println("Objeto creado");
		
		//Normalmente podemos alterar el comportamiento de un constructor
		//cuando queremos que todos los valores de los objetos empiecen igual.
		
		edad = 18;//De esta manera TODOS los objetos tendran la edad
				//de 18 cuando invoquemos este constructor.
		peso = 20;
	}
	
	//Podemos tener todos los constructores que queramos, es decir,
	//los constructores se puede SOBRECARGA.
	public Persona(String nombre, int edad, double peso, boolean estaCasado) {
		//Aqui tenemos un problema.
		//Cuando declaramos una variable dentro de un constructor
		
		this.nombre = nombre;
		//Se considera buena preactica de preogramacion referirnos 
		//a los atributos con "this"
		
		this.edad= edad;
		this.peso = peso;
		this.estaCasado = estaCasado;
	}
}

