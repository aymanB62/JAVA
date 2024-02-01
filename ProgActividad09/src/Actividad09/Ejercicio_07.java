package Actividad09;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		//Inversión de Cadenas:
		//Escribe un programa que tome una cadena como entrada y muestre la misma cadena pero invertida. 
		//Por ejemplo, si el usuario ingresa "Java", el programa debería mostrar "avaJ".
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inversión de Cadenas");
		System.out.println("Ingrese una cadena: ");
		String cadena = sc.nextLine();
		
		String invertida = ("");
		
		for (int i = cadena.length() - 1; i >= 0; i--) {
			invertida += cadena.charAt(i);
		}
		System.out.println(invertida);
		
	}
}
