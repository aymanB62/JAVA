package _07_ejemplos;

public class Mamander extends Muniemon implements IAgua{

	@Override
	public void curar() {
		this.setVida(this.getVida() + 5);		
	}

	@Override
	public void curar(Muniemon m) {
		m.setVida(m.getVida() + 5);
		
	}

	@Override
	public void mojar(Muniemon m) {
		System.out.println("Ay! Que te mojo! :) :) " + m.nombre);
	}

}
