package _01_basico;

public class _02_MainReferencias {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Tony";
		p1.edad = 45;
		p1.peso = 90;
		p1.estaCasado = false;//no haria falta, se inicializa a false
		
		Persona p2 = new Persona();
		p2.nombre = "Natasha";
		p2.edad = 37;
		p2.peso = 65;
		p2.estaCasado = true;
		//ver dibujo "dibujos/_01_basico_03_dos_referencias"
		
		//Un objeto puede estar "apuntado" por muchas referencias
		Persona p3 = p2;
		//Con el codigo de arriba estamos diciendo que p3 apunte al mismo 
		//objeto al que apunte p2.
		
		Persona p4 = new Persona();
		p4.edad = 50;
		cambiarEdad(p4);
		System.out.println(p4.edad);
	}
	public static void cambiarEdad(Persona p) {
		p.edad = 100;
	}
}
