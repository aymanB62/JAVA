package _07_relaciones;


public class Persona {
	String nombre;
	int edad;
	double peso;
	boolean casado;
	Direccion direccion;
	CuentaBancaria[] cuentaBancaria;
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", casado=" + casado + "]";
	}
}
