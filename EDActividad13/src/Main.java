import java.util.Scanner;

import calculadora.Calculadora;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elige una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int opcion = scanner.nextInt();

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("La suma es: " + Calculadora.suma(num1, num2));
                break;
            case 2:
                System.out.println("La resta es: " + Calculadora.resta(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicación es: " + Calculadora.multiplicacion(num1, num2));
                break;
            case 4:
                System.out.println("La división es: " + Calculadora.division(num1, num2));
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
   }