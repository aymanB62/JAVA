package Ejercicio05;

import java.util.Arrays;

public class Usuario {

	String id;
	String name;
	double[] valoraciones;
	
	public Usuario() {}
	
	public Usuario(String id, String name, double valoraciones[]) {
		this.id = id;
		this.name = name;
		this.valoraciones = valoraciones;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", valoraciones=" + Arrays.toString(valoraciones) + "]";
	}
	
	public void mediaValoraciones() {
        double suma = 0;
        for (double valoracion : valoraciones) {
            suma += valoracion;
        }
        System.out.println(suma / valoraciones.length);
    }
	
	public void mostrarValoraciones() {
		for(int i = 0; i < valoraciones.length;i++) {
			System.out.println(valoraciones[i]);
		}
		
	}
	
	public void valoracionSuperior(double num) {
		int contador = 0;
		for(int i = 0; i < valoraciones.length;i++) {
			if(valoraciones[i]>num) {
				contador++;
			}
		}
		System.out.println(contador);
	}
}

