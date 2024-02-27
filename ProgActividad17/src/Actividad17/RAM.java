package Actividad17;

public class RAM {
	/*RAM
		String marca 
		int capacidad 
		doublé precio*/
	
	String marca;
	int capacidad;
	double precio;
	public RAM(String marca, int capacidad, double precio) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.precio = precio;
	}
	public RAM() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "RAM [marca = " + marca + ", capacidad = " + capacidad + ", precio = " + precio + "]";
	}

	
}
