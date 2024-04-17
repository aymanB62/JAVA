package _02_basico;

public class MainVehiculos {

	public static void main(String[] args) {
		Avion avion = new Avion();
		avion.setFechaFabricacion("23/12/2009");
		System.out.println(avion.esAntiguo());
		
		Moto moto = new Moto();
		moto.setFechaFabricacion("23/12/2009");
		System.out.println(moto.esAntiguo());

	}

}
