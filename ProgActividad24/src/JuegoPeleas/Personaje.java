package JuegoPeleas;

public  class Personaje {
	private TipoArma arma;
	private String nombre;
	private int vida;

	public TipoArma getArma() {
		return arma;
	}

	public void setArma(TipoArma arma) {
		this.arma = arma;
	}

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

}