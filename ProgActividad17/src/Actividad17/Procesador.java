package Actividad17;

public class Procesador {
/*	Procesador
		String marca
		String modelo
		int numeroNucleos
		doublé precio*/
	String marca;
	String modelo;
	int numeroNucleos;
	double precio;
	public Procesador(String marca, String modelo, int numeroNucleos, double precio) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numeroNucleos = numeroNucleos;
		this.precio = precio;
	}
	public Procesador() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Procesador [marca = " + marca + ", modelo = " + modelo + ", numeroNucleos = " + numeroNucleos + ", precio = "
				+ precio + "]";
	}
	
	
}
