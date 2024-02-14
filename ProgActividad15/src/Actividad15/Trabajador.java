package Actividad15;

public class Trabajador {
	
	String nombre;
	String dni;
	int salario;
	public Trabajador(String nombre, String dni, int salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}
	public Trabajador() {
		super();
	}
	

	/*Crear dos clases en java. Una representará a una entidad Empresa y la otra representará la entidad trabajador.

	El trabajador tendrá los siguientes atributos:

	nombre
	dni
	salario
	La empresa tendrá los siguientes atributos:

	nombre
	nif
	lista de trabajadores
	Se tendrán que crear 2 constructores para cada una de las entidades

	uno sin parámetros, en el que se dejarán los valores por defecto.
	otro con todos los parámetros en el que podamos crear el objeto con todos los valores que queramos.
	Además los objetos tendrán la siguiente funcionalidad (métodos)

	Los trabajadores podrán realizar los siguiente

	Tendrán la opción de mostrar todos sus datos por pantalla (mediante el método toString())
	Tendrán la opción de devolver si un DNI es valido. Se puede hacer que tenga 9 caracteres o se puede investigar como hacer expresiones regulares en java. 
	También se puede hacer una validación programática para verificar la última letra del DNI.
	Los objetos tendrán la opción de devolver si un trabajador gana más que otro trabajador pasado por parámetro.
	Tendrán la opción de devolver si un trabajador es igual a otro. Un trabajador es exactamente igual a otro si tiene todos sus atributos iguales.
	
	

	Habrá que crear otra clase que ejecute el programa principal y cree 2 empresas diferentes con 3 trabajadores cada una. Las empresas se meterán en un array.

	A continuación debemos de invocar todos sus métodos y observar los diferentes resultados. 
	Tendremos que invocar los métodos recorriendo el array de empresas con un bucle, no podemos invocar los métodos fuera de dicho bucle.*/
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}
	public boolean dniValido() {
		if(this.dni.length() < 9 && this.dni.length()>0) {
			return true;
		}else {
			return false;
		}
	}
	public boolean salarioMayor(Trabajador trabajador) {
		if(this.salario < trabajador.salario) {
			return false;
		}else {
			return true;
		}
	}
	public boolean trabajadorIgual(Trabajador trabajador) {
		if(this.dni.equals(trabajador.dni) && this.nombre.equals(trabajador.nombre) && (this.salario == (trabajador.salario))) {
			return true;
		}else {
			return false;
		}
	}
}
