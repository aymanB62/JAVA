package Actividad09;

import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) {
		//Comparación de Cadenas:
		//Escribe un programa que pida al usuario su nombre de usuario y su password. 
		//El programa mostrará "bienvenido a nuestro programa" si el usuario es igual a "Capi" y 
		//el password es igual a "odioAironMan69", en caso contrario el programa mostrará "Usuario o password incorrecto". 
		//En el caso del usuario, puede ser igual sin tener en cuenta mayúsculas o minúsculas, 
		//pero en el caso del password tiene que ser exactamente igual. 
		//Además, se debe de eliminar todos los espacios que haya a derecha y a 
		//izquierda tanto para el usuario como para el password.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Comparación de Cadenas");
		System.out.println("Ingrese su usuario: ");
		String usuario = sc.nextLine();
		System.out.println("Ingrese su contraseña: ");
		String password = sc.nextLine();
		String passwordNoSpace = password.strip();
		if(usuario.equalsIgnoreCase("Capi") && passwordNoSpace.equals("odioAironMan69")) {
			System.out.println("bienvenido a nuestro programa");
		}
		else {
			System.out.println("Usuario o password incorrecto");
		}
	}

}
