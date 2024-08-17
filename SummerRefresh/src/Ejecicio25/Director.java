package Ejecicio25;


import java.util.ArrayList;

public class Director extends Empleado{
	
	private ArrayList<Empleado> empleadosACargo;
	
	public Director() {
		this.empleadosACargo = new ArrayList<Empleado>();
	}

	public ArrayList<Empleado> getEmpleadosACargo() {
		return empleadosACargo;
	}

	public void agregarEmpleado(Empleado empleados) {
		empleadosACargo.add(empleados);
	}
	
	public double calcularSalarioTotal() {
		return getSueldoBase() + (100 * empleadosACargo.size());
	}

	@Override
	public String toString() {
		return "Directores [empleadosACargo=" + empleadosACargo + "]";
	}
	
	@Override
	public double calcularDespidoImprocedente(int aniosTrabajados) {
		// TODO Auto-generated method stub
		return calcularSalarioTotal() + (0.2 * aniosTrabajados);
	}
	
}
