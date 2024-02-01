package clasesString;

import java.util.Date;

public class _04_Date {

	public static void main(String[] args) {
		//La manera mas basica de trabajar en java con fechas es la clase Date
		
		Date fecha = new Date();
		System.out.println(fecha);
		
		//La clase Date toma como referencia la hora del sistema operativo
		//Cuando instanciamos la clase Date obtendremos la hora del sistema 
		//operatvo en el que se esta ejecutando

		//Internamente la clase Date lo que guarda es el numero de milisegundos que han pasado
		//desde 01/01/1970 0:00:00 tambien llamada hora UNIX. Se guarda en una variable de tipo log
		//Podemos acceder a ella.
		
		System.out.println(fecha.getTime());
		
		//Si queremos manejas fechas debemos de basarnos en otras clases
		///la clase Date tiene casi todos sus metodos OBSOLETOS (deprecated)
		//Los metodos obsoletos se mantienen para hacer retrocompatibilidad
		//entre versiones superiores de java frente a las inferiores, pero
		//nos dicen que hay otras maneras mejores de hacer la funcionalidad
		System.out.println(fecha.getDay());//los dias van del 0 al 6
		System.out.println(fecha.getMonth());//Los meses van del 0 al 11
		System.out.println(fecha.getYear());//Es el año actual menos 1900
		
		//Hay una manera mas facil de obtener el numero de milisegundos
		System.out.println(System.currentTimeMillis());
		
		long tiempo = System.currentTimeMillis() - fecha.getTime();
		
	}
}