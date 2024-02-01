package _06_cicloVida;

import java.util.Random;

public class MainCicloVida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Un objeto nace cuando instanciamos la clase con la palabra "new".
		new Persona();
		new Persona().edad = 45;
		
		int numero = new Random().nextInt(1, 10);
		System.out.println("El numero aleatorio es : "+ numero);
		
		//En JAVA tenemos un programa dentro de la JVM que se llama Recolector de Basura.
		//Este probragama pasa aleaoriamente por el HEAP de meomoria para borrar objetos.
		//La condicion para que un objeto sea eliminado del HEAP es que no tenga ninguna referencia.
		
		 Persona p = new Persona();
		 p.edad = 35;
		 
		 //TEORICAMENTE, la JVM tiene un metodo que obligar a pasar el recolector,que es
		 //el metodo "gc()" de la clase System.
		 
		 System.gc();
		 
		 //En POO existe el concepto de "null". Null representa "vacio", nulo, ausencia de
		 //valor y se usa la palabra reservada "null". Solamente 
		 
		 Persona p2 = null;
		 String s = null;
		 Random rd = null;
		 
		 p2 = new Persona();
		 p2.edad = 67;
		 
		 Persona p3 = p2;
		 Persona p4 = p3;
		 
		 p2 = null;
		 p3 = null;
		 
		 System.out.println(p4.edad);
		 
		 System.out.println(p4.nombre);
		 System.err.println(p4.nombre.charAt(4));
		 p4 = dameNulo();
		 System.out.println(p4);
		 System.out.println(p4.edad);
	}
	
	public static Persona dameNulo() {
		return null;
	}

}
