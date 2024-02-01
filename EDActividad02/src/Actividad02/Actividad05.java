
package Actividad02;
import java.util.Scanner;

public class Actividad05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Ej5. Un vendedor recibe un sueldo base más un 10% extra por comisión de  
		//sus ventas, el vendedor desea saber cuánto dinero obtendrá por concepto  
		//de comisiones por las tres ventas que realiza en el mes y el total que  
		//recibirá en el mes tomando en cuenta su sueldo base y comisiones. 

		System.out.println("Bienvenido!!");
		System.out.println("Calcula aquí cuanto tienes que cobrar este mes!!");

		System.out.println("Introduce tu sueldo base: ");
		double sueldo = sc.nextDouble();
		System.out.println("Ahora introduce el valor de tu primera ventas: ");
		double venta1 = sc.nextDouble();
		System.out.println("Ahora introduce el valor de tu segunda ventas: ");
		double venta2 = sc.nextDouble();
		System.out.println("Ahora introduce el valor de tu tercera ventas: ");
		double venta3 = sc.nextDouble();
		double comisiones = ((venta1 + venta2 + venta3) * 10) /100;
		double suma = sueldo + comisiones;
		
		System.out.println("En total tienes que cobrar " + suma);
	}
}