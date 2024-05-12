package JuegoPeleas;

public abstract class Personaje {
	private Arma arma;
	private String nombre;
	private int vida;
	private int daño;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}
	
	public int getDaño() {
		return daño;
	}

	public void setDaño(int daño) {
		this.daño = daño;
	}
	
	abstract void atacar(Personaje p);

	abstract int checkArma(Arma a);



}