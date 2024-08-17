package Ejecicio25;


public class JefeProyecto extends Empleado{
	
	private double incentivos;

	public double getIncentivos() {
		return incentivos;
	}

	public void setIncentivos(double incentivos) {
		this.incentivos = incentivos;
	}
	
	public double calcularSalarioTotal() {
		return getSueldoBase() + incentivos;
	}
	
}
