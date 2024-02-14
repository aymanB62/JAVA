package Actividad15;

import java.util.Arrays;

public class Empresa {
	String nombre;
	String nif;
	Trabajador[] listaTrabajadores;
	public Empresa() {
		super();
	}
	public Empresa(String nombre, String nif, Trabajador[] listaTrabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.listaTrabajadores = listaTrabajadores;
	}
	@Override
	public String toString() {
		
		return "Empresa [nombre=" + nombre + ", nif=" + nif + ", listaTrabajadores="
				+ Arrays.toString(listaTrabajadores) + "]";
	}
	
	/*La empresa tendrá los siguientes atributos:

		nombre
		nif
		lista de trabajadores
		Se tendrán que crear 2 constructores para cada una de las entidades

		uno sin parámetros, en el que se dejarán los valores por defecto.
		otro con todos los parámetros en el que podamos crear el otraeto con todos los valores que queramos.
		Además los otraetos tendrán la siguiente funcionalidad (métodos)
		
		La empresa podrá realizar lo siguiente

		Tendrán la opción de mostrar todos sus datos por pantalla (mediante el método toString()). Esto incluye todos los trabajadores con sus datos.
		Tendrán la opción de mostrar todos los datos de sus trabajadores.
		Tendrán la opción de saber si existe un trabajador en la empresa, pasándole un DNI por parámetro.
		Tendrán la opción de devolver el numero de trabajadores que tienen.
		Tendrán la opción de devolver el salario total que se gasta en sus trabajadores.
		Tendrán la opción de devolver cuantos trabajadores ganan más de 3000€
		Tendrán la opción de devolver cuantos trabajadores ganan menos del SMI.
		Tendrán la opción de devolver cuantos trabajadores ganan más que una cantidad pasada por parámetro.
		Tendrán la opción de devolver si todos los trabajadores tienen un DNI valido.
		Tendrán la opción de devolver si una empresa pasada por parámetro es exactamente igual a la  misma. Un empresa es exactamente igual si tiene el mismo nombre y el mismo NIF
		Parte de creación de otraetos*/
	
	public void print() {
		System.out.println(Arrays.toString(listaTrabajadores));
	}
	public boolean trabajadorExiste(String dni) {
		for (Trabajador trabajador : listaTrabajadores) {
            if (trabajador != null && trabajador.dni.equals(dni)) {
                return true;
            }
        }
        return false;
	}
	public int numeroTrabajadores() {
		return listaTrabajadores.length;
	}
	public void gastoSalarioTrabajadores() {
		int total = 0;
		for (Trabajador trabajador : listaTrabajadores) {
            total += trabajador.salario;
        }
		System.out.println(total + " €");
	}
	public int trabajadoresSalarioMas3000() {
		int total = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			if(trabajador.salario > 3000) {
				total++;
			}else {
				total += 0;
			}
        }
		return total;
	}
	public int trabajadoresSalarioMasSMI() {
		int total = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			if(trabajador.salario > 1134) {
				total++;
			}else {
				total += 0;
			}
    	}
		return total;
	}
	
	public int trabajadoresSalarioMasX(int salario) {
		int total = 0;
		for (Trabajador trabajador : listaTrabajadores) {
			if(trabajador.salario > salario) {
				total++;
			}else {
				total += 0;
			}
    	}
		return total;
	}
	public boolean dniValido() {
		boolean valido = false;
		for (Trabajador trabajador : listaTrabajadores) {
			if(trabajador.dni.length() == 9) {
				valido = true;
			}else {
				valido = false;
			}
    	}
		return valido;
	}
	public boolean empresasIguales(Empresa otra) {
		boolean valido = false;
		if(this.nif.equalsIgnoreCase(otra.nif))valido = true;else {valido = false;}
		if(this.nombre.equalsIgnoreCase(otra.nombre))valido = true;else {valido = false;}
		
    	
		return valido;
	}
}
