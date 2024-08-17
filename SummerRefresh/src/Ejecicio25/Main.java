package Ejecicio25;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static ArrayList<Empleado> listaEmpleados = new ArrayList<>();
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
	
		boolean salir = false;
        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Dar de alta empleado");
            System.out.println("2. Mostrar empleados");
            System.out.println("3. Calcular salario de empleado");
            System.out.println("4. Calcular costes totales de la empresa");
            System.out.println("5. Calcular despido procedente");
            System.out.println("6. Calcular despido improcedente");
            System.out.println("7. Salir del programa");
            System.out.print("Elija una opción: ");
            System.out.println();
            int opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
            case 1:
            	darAltaEmpleado();
                break;
            case 2:
            	mostrarEmpleados();
                break;
            case 3:
            	calcularSalarioEmpleado();
                break;
            case 4:
            	calcularCostesTotales();
                break;
            case 5:
            	calcularCostesTotales();
                break;
            case 6:
            	calcularCostesTotales();
                break;
            case 7:
                salir = true;
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, elija una opción del 1 al 5.");
        }
        }
        
        
	}

	private static void darAltaEmpleado() {
		
		System.out.println("Tipo de empleado a dar de alta:");
        System.out.println("1. Programador");
        System.out.println("2. Jefe de proyecto");
        System.out.println("3. Director");
        System.out.print("Elija una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();
        
        Empleado empleados = null;
        switch (opcion) {
		case 1:
			empleados = new Programador();
			break;
			
		case 2: 
			empleados = new JefeProyecto();
			System.out.print("Incentivos: ");
            double incentivos = sc.nextDouble();
            ((JefeProyecto) empleados).setIncentivos(incentivos);
			break;
			
		case 3:
			empleados = new Director();
			System.out.print("Cantidad de empleados a cargo: ");
            int cantidadEmpleados = sc.nextInt();
            sc.nextLine(); 
            
            for (int i = 0; i < cantidadEmpleados; i++) {
                System.out.print("DNI del empleado " + (i + 1) + ": ");
                String dniEmpleado = sc.nextLine();
                Empleado empleadoACargo = buscarEmpleadoPorDNI(dniEmpleado);
                if (empleadoACargo != null) {
                    ((Director) empleados).agregarEmpleado(empleadoACargo);
                } else {
                    System.out.println("No se encontró ningún empleado con el DNI proporcionado.");
                }
            }
			break;
		default:
			System.out.println("Opción Invalida D:");
			break;
		}
        
        if (empleados != null) {
        	System.out.print("DNI: ");
            String dni = sc.nextLine();
            empleados.setDNI(dni);
            sc.nextLine();
            
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            empleados.setNombre(nombre);
            
            System.out.print("Sueldo base: ");
            double sueldoBase = sc.nextDouble();
            empleados.setSueldoBase(sueldoBase);

            listaEmpleados.add(empleados);
		}
        
	}
	
	private static void mostrarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado.toString());
            }
        }
    }
	
	private static void calcularSalarioEmpleado() {
        mostrarEmpleados();
        System.out.print("Ingrese el ID del empleado para calcular su salario: ");
        int idEmpleado = sc.nextInt();
        Empleado empleado = buscarEmpleadoPorID(idEmpleado);
        if (empleado != null) {
            double salarioTotal = empleado.calcularSalarioTotal();
            System.out.println("El salario total del empleado es: " + salarioTotal);
        } else {
            System.out.println("No se encontró ningún empleado con el ID proporcionado.");
        }
    }
	
	private static void calcularCostesTotales() {
        double costesTotales = 0;
        for (Empleado empleado : listaEmpleados) {
            costesTotales += empleado.calcularSalarioTotal();
        }
        System.out.println("Los costes totales de la empresa son: " + costesTotales);
    }
	
	private static Empleado buscarEmpleadoPorID(int id) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }
	
	private static Empleado buscarEmpleadoPorDNI(String dni) {
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getDNI().equals(dni)) {
                return empleado;
            }
        }
        return null;
    }
	
	private static double calcularDespidoProcedente() {
		
	}
}