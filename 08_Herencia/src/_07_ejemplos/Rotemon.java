package _07_ejemplos;

public class Rotemon extends Muniemon implements IAgua, IElectrico{

	private boolean haMojado;
	
	@Override
	public void paralizar(Muniemon m) {
		if(haMojado) {
			System.out.println("No puedo paralizar");
		}else {
			System.out.println("Ay! Que te paralizo!! <3 <3 :P " + m.nombre);		
		}
		
	}

	@Override
	public void churrascar(Muniemon m) {
		if(haMojado) {
			m.setVida(m.getVida() - 20);
		}else {
			m.setVida(m.getVida() - 10);
		}
		
	}

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
		this.haMojado = true;
	}

}
