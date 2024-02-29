package Actividad17;

public class Periferico {
/*	Periferico
		String tipo
		String marca
		doublé precio*/
	private String tipo;
	private String marca;
	private double precio;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Periferico [tipo = " + tipo + ", marca = " + marca + ", precio = " + precio + "]";
	}

}
