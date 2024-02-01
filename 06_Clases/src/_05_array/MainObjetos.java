package _05_array;

public class MainObjetos {

	public static void main(String[] args) {
		Restaurante r1 =new Restaurante();
		
		r1.id = 1;
		r1.nombre = "McDonalds";
		
		double[] pArray = new double [3];
		
		pArray[0] = 3.0;
		pArray[1] = 4.5;
		pArray[2] = 5.0;
		
		r1.puntuacion = pArray;
		pArray[0] = 2.0;
		System.out.println(r1.puntuacion[0]);
		
		Restaurante[] arrayRestaurante;
		arrayRestaurante = new Restaurante[3];
		
		arrayRestaurante[0] = r1;
		arrayRestaurante[0].puntuacion[0] = 1.0;
		System.out.println(pArray[0]);
		
		r1 = new Restaurante();
		r1.puntuacion = new double[3];
		System.out.println(r1.puntuacion[0]);
		
		r1.puntuacion[1] = 3.5;
		System.out.println(arrayRestaurante[0].puntuacion[1]);
		
		Restaurante r2 = r1;
		Restaurante r3 = r1;
		Restaurante r4 = r1;
		
		r2.puntuacion[2] = 5.0;
		System.out.println(r2.puntuacion[2]);
		
		System.out.println("---------------");
		mostrarPuntuacion(r2.puntuacion[2]);
		mostrarPuntuacion(r3.puntuacion[2]);
		mostrarPuntuacion(r4.puntuacion[2]);

		
	}

	public static void mostrarPuntuacion(double p){
		System.out.println(p);
	}
}
