package Actividad12;

public class Main {
	

	public static void main(String[] args) {
		
		Coche c1 = new Coche("20994350", "Peugeout", "307", 100, "20/01/2000", 100000);
		Coche c2 = new Coche();
		
		c2.id = "klngn22";
		c2.kilometros = 398488;
		c2.marca = "chingin";
		c2.matriculacion = "20/07/1004";
		c2.precioBase = 33344;
		c2.modelo = "chigaasd";
		
		System.out.println(c1.precio());
		System.out.println(c1.caracterMarca());
		System.out.println(c1.caracterModelo());
		System.out.println(c1.cualEsCaro(c2));
		System.out.println(c1.diferenciaKilometros(c2));
		System.out.println(c1.kilometrosPrimos());
		System.out.println(c1.kilometrosHasta200k());
		c1.precio();
		c1.imprimir();
		c1.imprimirFechaMatriculacion();
		c1.imprimirPrecio();
		

	}

}
