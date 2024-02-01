package Actividad12;

public class Coche {

	// Crear una clase en java que represente a una entidad Coche. Los coches tendrán 6 atributos.

		//id
		//marca
		//modelo
		//precio base (en euros)
		//fecha de matriculación (DD/MM/YYY)
		//kilómetros
	//Se tendrán que crear 2 constructores:
			
	//uno sin parámetros en el que la marca y el modelo serán cadenas vacías.
	
	String id;
	String marca;
	String modelo;
	double precioBase;
	String matriculacion;
	int kilometros;
	
	public Coche(){
		this.marca = "";
		this.modelo = "";
	}
	
	//otro con todos los parámetros en el que podamos crear el objeto con todos los valores que queramos.
	
	public Coche(String id, String marca, String modelo, double precio, String matriculacion, int kilometros) {
		this.id = id;
		this.kilometros = kilometros;
		this.marca = marca;
		this.matriculacion = matriculacion;
		this.modelo = modelo;
		this.precioBase = precio;
	}
	//Además los objetos tendrán la siguiente funcionalidad (métodos)
			
	//Los objetos tendrán la opción de mostrar todos sus datos por pantalla (mediante el método toString())
	
	public void imprimir() {
		System.out.println("Coche [id=" + this.id + ", marca=" + this.marca + ", modelo=" + this.modelo + ", precio=" + this.precioBase + ", matriculacion="
				+ this.matriculacion + ", kilometros=" + this.kilometros + "]");
	}

	//Los objetos tendrán la opción de mostrar su precio base
	
	public void imprimirPrecio() {
		System.out.println(this.precioBase);
	}
			
	//Los objetos tendrán la opción de mostrar solamente el año de su matriculación
	
	public void imprimirFechaMatriculacion() {
		System.out.println(this.matriculacion);
	}
			
	//Los objetos tendrán la opción de mostrar si el año de su matriculación fue año bisiesto (ver la formula por internet)
	
//	public void imprimirEsBisiesto() {
//		String[] cadenaDividida = this.matriculacion.split("/");
//		int anio = Integer.parseInt(cadenaDividida[2]);
//		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
//			System.out.println("El año es bisiesto");
//		else
//			System.out.println("El año no es bisiesto");
//	}
			
	//Los objetos tendrán la opción de devolver su precio en función de los kilómetros.
	
			
	//En caso de que el coche tenga menos de 10000 km, el precio a devolver será el mismo que el precio base, en caso de que los 
	//kilómetros sean mas de 10000 y menos de 50000, el precio será un 80% del precio base, y en caso de que los kilómetros sean mayores 
	//o iguales a 50000, el precio a devolver será un 50% del precio base.
	
	public double precio() {
		
		if (this.kilometros < 10000) {
            return this.precioBase;
        } else if (this.kilometros >= 10000 && this.kilometros < 50000) {
            return this.precioBase * 0.8;
        } else {
            return this.precioBase * 0.5;
        }
	}
	
	//Los objetos tendrán la opción de devolver si el número de kilómetros que tienen es primo.
			
	public boolean kilometrosPrimos() {
		Boolean esPrimoActual = true;
	    if(this.kilometros < 2)
	    {
	        esPrimoActual = false;
	    }
	    else
	    {
	        for(int x = 2; x * x <= this.kilometros; x++)
	        {
	            if( this.kilometros % x == 0 ){
	            	esPrimoActual = false;
	            	break;}
	        }
	    }
	    return esPrimoActual;
	}
	
	//Los objetos tendrán la opción de devolver cuantos kilómetros se faltan para llegar a los 200000 km.
			
	public int kilometrosHasta200k() {
		int kilometros200k = 200000 - this.kilometros;
		return kilometros200k;
	}
	//El objeto tendrá la opción de devolver cuantos caracteres tienen la marca y el modelo.
		
	
	
	public int caracterMarca() {
	int caracteresMarca = this.marca.length();
		return caracteresMarca;	}
	public int caracterModelo() {
		int caracteresModelo = this.modelo.length();
		return caracteresModelo;}	
			
	//El objeto tendrá la opción de devolver cual es la diferencia de km entre el coche y otro coche pasado por parámetro
	
	public int diferenciaKilometros(Coche v) {
			if(v.kilometros>this.kilometros) {
				int diferencia = v.kilometros - this.kilometros;
				return diferencia;
			}
			else if(this.kilometros>v.kilometros) {
				int diferencia = this.kilometros - v.kilometros;
				return diferencia;
			}
			else {
				int diferencia = 0;
				return diferencia;
			}
	}
			
	//El objeto tendrá la opción de devolver cual es el coche más caro entre este y otro coche pasado por parámetro
	
	public boolean cualEsCaro(Coche v) {
		System.out.println("\n\n \'cualEsCaro\' method\n");
		if(v.precioBase>this.precioBase) {
			System.out.println("¿Es el precio de " + v.precioBase + " mayor que "+ this.precioBase+"?");
			return true;
		}else {
			System.out.println("¿Es el precio de " + this.precioBase + " mayor que "+ v.precioBase+"?");
			return false;
		}
		
	}
		
	//Parte de creación de objetos
			
	//Habrá que crear otra clase que ejecute el programa principal y cree 2 coches diferentes con los 2 
	//constructores que hemos creado. Los valores de los coches serán los que se metan por teclado.
			
	//A continuación debemos de invocar todos sus métodos y observar los diferentes resultados.

}
