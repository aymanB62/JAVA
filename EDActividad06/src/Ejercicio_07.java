import java.util.Scanner;
public class Ejercicio_07 {

	public static void main(String[] args) {
		//Calcular el factorial de un número pedido por pantalla. El factorial de un 
		//número es el número multiplicado por sus anteriores hasta el 1.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero: ");
		int num = sc.nextInt();
		int suma = 1;
		do {
			suma *=num;
			num--;
			
		}while(num>0);
		
		System.out.println(suma);
		
	}
	
}