package Ejecicio25;

public interface Fireable {

	/*
	 * 1. double calcularDespidoProcedente()
	 * 
	 * 2. double calcularDespidoImprocedente(int aniosTrabajados)
	 * 
	 * En el primer caso, el importe del despido será igual al salario total del
	 * empleado (ojo, NO al salario base)
	 * 
	 * En el segundo caso, el importe será el del salario total del empleado, mas un
	 * 10% por cada año trabajado pasado por parámetro. Si el empleado es Director,
	 * el importe se incrementará en un 20%.
	 * 
	 * El programa principal dará la opción de mostrar por pantalla ambos importe de
	 * despido.
	 */

	double calcularDespidoProcedente();
	double calcularDespidoImprocedente(int aniosTrabajados);
}
