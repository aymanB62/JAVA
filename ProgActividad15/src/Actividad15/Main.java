package Actividad15;

public class Main {

	public static void main(String[] args) {
		Trabajador trabajador1_empresa1 = new Trabajador("Pedro", "02345678P" , 5000);
		Trabajador trabajador2_empresa1 = new Trabajador("Mario", "02345678M" , 2001);
		Trabajador trabajador3_empresa1 = new Trabajador("Daniel", "02345678D" , 1999);
		
		Trabajador[] listaTrabajadores1 = new Trabajador[3];
		
		listaTrabajadores1[0] = trabajador1_empresa1;
		listaTrabajadores1[1] = trabajador2_empresa1;
		listaTrabajadores1[2] = trabajador3_empresa1;

		
		Empresa empresa1 = new Empresa("OLE", "87654320P",  listaTrabajadores1);
		
		Trabajador trabajador1_empresa2 = new Trabajador("Pedro", "02345678P" , 5000);
		Trabajador trabajador2_empresa2 = new Trabajador("Mario", "02345678M" , 2001);
		//Trabajador trabajador3_empresa2 = new Trabajador("Daniel", "02345678D" , 1999);
		
		Trabajador[] listaTrabajadores2 = new Trabajador[3];
		
		listaTrabajadores2[0] = trabajador1_empresa2;
		listaTrabajadores2[1] = trabajador2_empresa2;
		//listaTrabajadores2[2] = trabajador3_empresa2;

		
		Empresa empresa2 = new Empresa("MAOS", "87654320P",  listaTrabajadores2);
		
		System.out.println(empresa1.toString());
		empresa1.print();
		System.out.println(empresa1.trabajadorExiste(trabajador1_empresa1.dni));
		empresa1.gastoSalarioTrabajadores();
		System.out.println(empresa1.trabajadoresSalarioMas3000());
		System.out.println(empresa1.trabajadoresSalarioMasSMI());
		System.out.println(empresa1.trabajadoresSalarioMasX(2000));
		System.out.println(empresa1.dniValido());
		System.out.println(empresa1.empresasIguales(empresa2));
	}

}
