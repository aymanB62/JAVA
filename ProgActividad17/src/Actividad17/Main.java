package Actividad17;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		/*	Parte de implementación.
	Se deberá crear un ordenador con un procesador, una tarjeta grafica (con su RAM), una placa base, 4 modulos de RAM, y 3 periféricos. 
	Esto se hará en un main. Una vez creado el ordenador completo, se deberá invocar a su método toString() y deberá imprimir el ordenador.
	A continuación, se deberá invocar el método calcular Precio() y volver a imprimir el ordenador.*/
		
		Ordenador ordenador =  new Ordenador();
		
		RAM ramTarjetaGrafica = new RAM("pooj notar alliratnacla", 1, 0.01);
		
		TarjetaGrafica tarjetaGrafica =  new TarjetaGrafica("NVidia", "1660", 6, 100.50, ramTarjetaGrafica);
		
		PlacaBase placaBase =  new PlacaBase();
		
		Procesador procesador = new Procesador("AMD", "Ryzen 5", 16, 100.10);
		
		ArrayList<RAM> listaRAMs =  new ArrayList<RAM>();
		
		ArrayList<Periferico> listaPerifericos =  new ArrayList<Periferico>();
		
		
		RAM ram1 = new RAM("Fanta", 8, 19.99);
		RAM ram2 = new RAM("Pepsi", 8, 19.99);
		RAM ram3 = new RAM("Bebsi", 8, 19.99);
		RAM ram4 = new RAM("Isbeb", 96, 99.91);
		
		
		listaRAMs.add(ram1); listaRAMs.add(ram2); listaRAMs.add(ram3); listaRAMs.add(ram4);
		
		placaBase.setMarca("ASUS");
		placaBase.setPrecio(200.20);
		placaBase.setTipo("mini ATX");

		Periferico raton = new Periferico();
		Periferico teclado = new Periferico();
		
		raton.setMarca("Logitech");
		raton.setPrecio(10.22);
		raton.setTipo("Cable");
		
		teclado.setMarca("NGS");
		teclado.setPrecio(11.99);
		teclado.setTipo("Plastico");
		
		listaPerifericos.add(teclado); listaPerifericos.add(raton);
		
		
		ordenador.listaPerifericos = listaPerifericos;
		ordenador.listaRAMs = listaRAMs;
		ordenador.placaBase = placaBase;
		ordenador.tarjetaGrafica = tarjetaGrafica;
		ordenador.procesador = procesador;
	
		System.out.println(ordenador.toString());
		ordenador.calcularPrecio();
		System.out.println(ordenador.toString());
	}
}
