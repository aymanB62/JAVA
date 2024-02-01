package Actividad05;

public class Ejercicio_07 {

	public static void main(String[] args) {
		//Calcular la suma de los números pares del 1 al 50.
        int suma = 0;
        
        for (int i = 2; i <= 50; i += 2) {
            suma += i; 
        }
        
        System.out.println("La suma de los números pares del 1 al 50 es: " + suma);
    }

}
