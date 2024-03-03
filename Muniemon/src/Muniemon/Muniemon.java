package Muniemon;

public class Muniemon {

	/*Vamos a empezar a realizar un programa de Muniemon , y lo vamos a realizar por fases. Cada fase será una actividad y deberá ser versionada en GIT.

	En esta actividad vamos a empezar con las bases de nuestro juego, para ello vamos a crear la clase Muniemon que tendrá los siguientes atributos: nombre, vida, ataque, defensa y tipo. 
	La vida será un entero y representará lo que aguanta el Muniemon antes de morir, si en algún momento llega a 0 morirá. El ataque representa el daño que le hará a la vida del otro Muniemon . 
	La defensa representará lo que se le restará al ataque del otro Muniemon antes de que se le reste la vida, y el tipo solo podrá ser de AGUA, TIERRA, FUEGO y PLANTA 
	(será un enumerado, solo puede haber esos tipos).

	*/
	
	String nombre;
	int vida;
	int ataque; 
	int defensa;
	Tipo tipoMuniemon;
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
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	public Tipo getTipoMuniemon() {
		return tipoMuniemon;
	}
	public void setTipoMuniemon(Tipo tipoMuniemon) {
		this.tipoMuniemon = tipoMuniemon;
	}
	@Override
	public String toString() {
		return "Muniemon [nombre = " + nombre + ", vida = " + vida + ", ataque = " + ataque + ", defensa = " + defensa
				+ ", tipoMuniemon = " + tipoMuniemon + "]";
	}
	
	/*
	 * Con la opción 5 y 6 los muniemon se atacaran. Para ello, lo muniemon tendran
	 * un método llamado atacar(Muniemon) el cual se le pasará al objeto Muniemon
	 * que queremos atacar. En método restará una cantidad de vida al Muniemon
	 * pasado por parametro igual al ataque del Muniemon que ha invocado el método,
	 * ahora bien, antes de restar la vida, deberá comprobar la defensa del Muniemon
	 * atacado, ya que le restará ataque igual a la defensa del objetivo. Ejemplo,
	 * si el Muniemon atacante tiene un ataque de 5 y el muniemon atacado una
	 * defensa de 2, solo le restará 3 puntos de vida. Este método tambien tiene que
	 * controlar, que si un Muniemon tiene la vida igual o menos que 0, no podrá
	 * atacar porque estará muerto. Es interesante tambien decir quien ataca a quien
	 * y la vida que le ha restado.
	 */
	
	public void atacar(Muniemon munion) {
		System.out.println(this.nombre + " esta atacando a " + munion.nombre);
		int ataqueMenosDefensa;
		
		while (munion.vida != 0) {
			if (this.ataque <= munion.defensa) {
				munion.vida -= 1;
			} else if (this.ataque != munion.defensa) {
				ataqueMenosDefensa = this.ataque - munion.defensa;
				munion.vida = ataqueMenosDefensa - munion.vida;
			}
		}
		System.out.println(munion.vida);
	}
	
}
