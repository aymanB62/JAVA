package Actividad22;

public class Empleados {
	/*
	 * Vamos a hacer una aplicación que gestione empleados en una empresa.
	 * 
	 * Parte de diseño de clase
	 *
	 * Tendremos tres tipos de empleados:
	 *
	 * Programadores Jefes de proyecto Directores
	 *
	 * Todos los empleados van a tener un id, un DNI, un nombre y un sueldo base,
	 * pero los jefes de proyecto tendrán además unos incentivos (una prima
	 * económica, un tipo double) y los directores tendrán unos empleados a su cargo
	 * (puede ser programador, jefe de proyecto o incluso otros directores).
	 * 
	 * Se pide que se pueda calcular el salario total de los empleados, basándonos
	 * en la siguiente regla:
	 * 
	 * El salario total de los programadores será el mismo que su sueldo base 
	 * El salario total de los jefes de proyecto será el de su sueldo base más los
	 * incentivos El salario total de los directores será su sueldo base más 100
	 * euros por cada empleado que este a su cargo Parte main
	 * 
	 * Se pide hacer el siguiente menú
	 * 
	 * Dar de alta empleado, que preguntará que tipo de empleado quiere dar de alta
	 * y pedirá sus datos. En el caso de que sea un director, nos mostrará todos los
	 * empleados que hayamos dado de alta para elegir cuales queremos que estén a su
	 * cargo. Los empleados se deben de guardar en una sola lista. Mostrar
	 * empleados, mostrará todos los empleados que hayamos dado de alta con todos
	 * sus valores de los atributos. En el caso de los directores deberá de mostrar
	 * también todos los valores de los empleados a su cargo Calcular salario de
	 * empleado, mostrará a todos los empleados y mostrará el salario total del
	 * empleado elegido Calcular costes totales de la empresa, mostrará cual es el
	 * salario de todos los empleados de la empresa. Salir del programa Suerte!
	 */

	private int id;
	private String DNI;
	private String nombre;
	private double sueldo;
    private static int contador = 0;
	
    public Empleados(String nombre, String apellido) {
        this.id = generarIdUnico();
        this.nombre = nombre;
    }

    private synchronized int generarIdUnico() {
        return ++contador;
    }
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	
}
