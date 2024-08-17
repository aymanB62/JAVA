package Ejecicio25;


public class Empleado implements Fireable{

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
	
	public double calcularSalarioTotal() {
		return sueldoBase;
	}

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", DNI=" + DNI + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}

	@Override
	public double calcularDespidoProcedente() {
		// TODO Auto-generated method stub
		return calcularSalarioTotal();
	}
	
	@Override
	public double calcularDespidoImprocedente(int aniosTrabajados) {
		// TODO Auto-generated method stub
		return calcularSalarioTotal() + (0.1 * aniosTrabajados);
	}
	
	
}
