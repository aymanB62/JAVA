package Actividad17;

import java.util.ArrayList;

public class Ordenador {
	
	double precio;
	Procesador procesador;
	TarjetaGrafica tarjetaGrafica;
	PlacaBase placaBase;
	ArrayList<RAM> listaRAMs;
	ArrayList<Periferico> listaPerifericos;
	
	public void calcularPrecio() {
		double precioRAMs = 0;
		double precioPerifericos = 0;
		for(Periferico x : listaPerifericos) {
			precioPerifericos += x.precio;
		}
		for(RAM x : listaRAMs) {
			precioRAMs += x.precio;
		}

		this.precio = procesador.precio + tarjetaGrafica.precio + placaBase.precio + precioRAMs + precioPerifericos ;
	}

	@Override
	public String toString() {
		return "Ordenador [Precio = " + precio + ", \n\n\t-procesador = " + procesador.toString() + ", \n\n\t-tarjetaGrafica = " + tarjetaGrafica.toString()
				+ ", \n\n\t-placaBase = " + placaBase.toString() + ", \n\n\t-listaRAMs = " + listaRAMs.toString() + ", \n\n\t-listaPerifericos = " + listaPerifericos.toString()
				+ "]\n";
	}

	
	
	/*Ordenador
		doublé precio
		Procesador procesador
		TarjetaGrafica tarjetaGrafica
		PlacaBase placaBase
		ArrayList<RAM> listaRAMs
		ArrayList<Periferico> listaPerifericos
	
		Un único método, void calcularPrecio(). Este método sumará todos los precios de los componentes del ordenador y pondrá el precio en el atributo "precio"*/
	
}
