package Actividad25;

public abstract class Empleado implements Despedible{

	private static int contadorID;
	private int id;
	private String DNI;
	private String nombre;
	private double sueldoBase;

	public Empleado() {
		this.id = contadorID++;
	}

	public static int getContadorID() {
		return contadorID;
	}

	public static void setContadorID(int contadorID) {
		Empleado.contadorID = contadorID;
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

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	/**
	 * Metodo que devuelve el salario cuyo valor es el valor del atributo 'sueldo'
	 * del objeto.
	 * 
	 * @return devuelve el valor de la variable salario.
	 */
	public double calcularSalarioTotal() {
		double salario = this.sueldoBase;
		return salario;
	}

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}
	
	 /* En el segundo caso, el importe será el del salario total del empleado, mas un
	 * 10% por cada año trabajado pasado por parámetro. Si el empleado es Director,
	 * el importe se incrementará en un 20%.
	 */
	
	public double calcularDespidoImprocedente(int aniosTrabajados) {
		double salario = this.getSueldoBase() + (this.getSueldoBase() * (0.1 * aniosTrabajados));
		return salario;
	}

}
