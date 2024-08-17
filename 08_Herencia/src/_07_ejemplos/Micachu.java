package _07_ejemplos;

public class Micachu extends Muniemon implements IElectrico{
	
	private int numeroColas;

	public int getNumeroColas() {
		return numeroColas;
	}

	public void setNumeroColas(int numeroColas) {
		this.numeroColas = numeroColas;
	}

	@Override
	public String toString() {
		return "Micachu [numeroColas=" + numeroColas + ", getVida()=" + getVida() + ", getNombre()=" + getNombre()
				+ "]";
	}

	@Override
	public void paralizar(Muniemon m) {
		System.out.println("Ay! Que te paralizo!! <3 <3 :P " + m.nombre);		
	}

	@Override
	public void churrascar(Muniemon m) {
		m.setVida(m.getVida() - 10);		
	}
}
