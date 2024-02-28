package Actividad17;

public class TarjetaGrafica {
/*	TarjetaGrafica
		String marca
		String modelo
		int nucleosCUDA doublé precio
		RAM ram
		*/
	String marca;
	String modelo;
	int nucleosCUDA;
	double precio;
	RAM ram;
	public TarjetaGrafica() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TarjetaGrafica(String marca, String modelo, int nucleosCUDA, double precio, RAM ram) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nucleosCUDA = nucleosCUDA;
		this.precio = precio;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "TarjetaGrafica [marca = " + marca + ", modelo = " + modelo + ", nucleosCUDA = " + nucleosCUDA + ", precio = "
				+ precio + ", ram = " + ram + "]";
	}
	
}
