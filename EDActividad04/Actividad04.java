import java.util.Scanner;

public class Actividad04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro numero");
		int num2 = sc.nextInt();
		mayorMenor(num1,num2);
		aprobadoSuspenso();
		calculadora();

	}
	//Operador ternario

	//Realizar los siguientes ejercicios de la "Actividad 03. Condicionales 1" mediante el operador ternario

	//Ejercicio 1 (No se pueden evaluar tres casos con el operador ternario, así que debemos de adaptar la solución del ejercicio a 2 casos)
	//Ejercicio 3
	
	public static void mayorMenor(double num1, double num2) {
		String result = (num1 > num2) ? "El primer numero es mayor" : (num1 < num2) ? "El segundo numero es mayor" : "Los numeros son iguales";
        System.out.println(result);
    }
	
	
	public static void aprobadoSuspenso() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Introduce tu nota (0-100): ");
	     int nota = scanner.nextInt();

	     String result = (nota >= 50) ? "APROBADO" : "SUSPENSO";
	     System.out.println("Resultados: " + result);
	}
	//Sentencia Switch

		//Realizar los siguientes ejercicios de la "Actividad 03. Condicionales 1" mediante la sentencia Switch

		//Ejercicio 5
		//Ejercicio 6
	public static void calculadora() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona operación ha realizar:");
        System.out.println(" \r\t-Para sumar pulse 1\r\n"
				+ "	-Para restar pulse 2\r\n"
				+ "	-Para multiplicar pulse 3\r\n"
				+ "	-Para dividir pulse 4\r\n"
				+ " \t-Para saber el resto de la división entera pulse 5");
        int choice = scanner.nextInt();
        
        System.out.print("Introduce un numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = scanner.nextInt();
        
        int result = 0;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
            case 5:
                result = num1 % num2;
                break;
            default:
                System.out.println("Eleccion invalida!");
                break;
        }
        System.out.println("Solución: " + result);
    }
	
	public static void parImpar() {
		 Scanner input = new Scanner(System.in);
	     System.out.print("INTRODUCE UN NUMERO: ");
	     int num = input.nextInt();
	     switch(num % 2) {
	       case 0:
	         System.out.println("El numero es par");
	         break;
	       case 1:
	         System.out.println("El numero es impar");
	         break;
	        }
	}
}
