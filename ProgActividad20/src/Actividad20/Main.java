package Actividad20;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	static Scanner sc = new Scanner(System.in);
	 
	public static void main(String args[]) {
	
		Coche coche1 = new Coche();
		/*Habrá que crear otra clase llamada "MainCoches" que ejecute el programa principal que muestre el siguiente menú.

		Crear coche
		Mostrar coches
		Mostrar contadorID
		Resetear contadorID
		Salir del programa
		
		El método estático "main" tendrá que invocar a un método DINÁMICO llamado "arrancarPrograma()" que es donde se ejecutará toda la lógica de la app.

		Se creará un método para cada opción, que será llamado desde el método "arrancarPrograma()"

		La opción 1 pedirá la matricula y la marca (ya que el ID se asigna automáticamente en el constructor de Coche) y lo meterá en un arrayList de coches. 
		Dicho arrayList deberá ser un atributo dinámico dentro de la clase "MainCoches" y por tanto podrá ser accedido en todos los métodos de la clase. 
		Además, la clase "MainCoches" tendrá otro atributo para guardar el Scanner y no tener que estar pasándolo por parámetro en todos los métodos que lo necesiten.

		La opción 2 recorrerá el arrayList de coches para mostrar sus datos.

		La opción 3 mostrará el contadorID actual

		La opción 4 reseteará el contadorID a cero

		La opción 5 terminará el programa.*/
		
		System.out.println("1. Crear coche "
				+ "\n2. Mostrar coches "
				+ "\n3. Mostrar contadorID "
				+ "\n4. Resetear contadorID "
				+ "\n5. Salir del programa");
	
		Main main = new Main();
		main.arrancarPrograma(coche1);
	}
	
	public void arrancarPrograma(Coche coche) {
		int option = sc.nextInt();
		switch(option) {
		case 1: 
			option1(coche);
		case 2: 
			option2();
		case 3: 
		case 4: 
		default: System.out.println();
		}
		
	}
	
	public void option1(Coche coche) {
		System.out.println("introduce la matricula de tu vehiculo :");
		coche.setMatricula(sc.nextLine());
		sc.nextLine();
		System.out.println("introduce la marca de tu vehiculo :");
		coche.setMarca(sc.nextLine());
		
		listaCoches.add(coche);
	}
	
	public void option2() {
		System.out.println(listaCoches.toString());
	}
	
	
}
