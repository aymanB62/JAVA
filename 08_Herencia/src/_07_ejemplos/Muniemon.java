package _07_ejemplos;

import java.util.List;
import java.util.Objects;

public abstract class Muniemon implements Atacable{
	private int vida;
	protected String nombre;
	private List<Poder> listaPoderes;
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Muniemon [vida=" + vida + ", nombre=" + nombre + "]";
	}

	public int hashCode() {
		return Objects.hash(nombre);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Muniemon other = (Muniemon) obj;
		return Objects.equals(nombre, other.nombre);
	}
	@Override
	public void atacar(Object o) throws IllegalArgumentException{
		if(o instanceof Muniemon) {
			Muniemon m = (Muniemon)o;
			m.setVida(m.getVida() - 5);
		}else {
			throw new IllegalArgumentException();
		}		
	}
	public List<Poder> getListaPoderes() {
		return listaPoderes;
	}
	public void setListaPoderes(List<Poder> listaPoderes) {
		this.listaPoderes = listaPoderes;
	}
	
	
}
