package _06_abstracciones;

public abstract class Animal {
	private Sexo sexo;
	private double peso;
	private int edad;
	private String nombre;
	
	public abstract void comer(Object c);
}
