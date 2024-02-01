package array;

public class _02_UsosArrays {

	public static void main(String[] args) {
		//Queremos guardar los siguientesdatos de una persona
		//Nombre, apellidos, telefono, direccion
		
		String nombre = "Tony";
		String apellido = "Tony";
		String telefono = "Tony";
		String direccion = "Tony";
		
		//Podriamos hacerlo con arrays
		String[] capi = new String[4];
		capi[0] = "Steve";
		capi[1] = "Rogers";
		capi [2] = "+0044589599999";
		capi[3] = "Queens";
		
		for(int i = 0; i < capi.length;i++) {
			System.out.println(capi[i]);
		}
		
		//Hemos podido ver que uno de los usos es almacenar una colección
		//de variables que podemos recorrer y que tengan relacion entre si
		//Nos puede servir tambien para ordenar informacion.
		
		String[] blackWidow = new String[4];
		blackWidow[0] = "Natasha";
		blackWidow[1] = "Romanoff";
		blackWidow[2] = "+0049983095430";
		blackWidow[3] = "Molotov";
		
		
	}

}
