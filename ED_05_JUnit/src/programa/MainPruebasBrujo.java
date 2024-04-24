package programa;

public class MainPruebasBrujo {

	public static void main(String[] args) {
		// Vamos a probar la clase brujo, definiendo su
		//bateria de pruebas y ejecutando sus métodos
		
		//Método setPoder()
		//Serán 2 pruebas las que hagamos para este método
		
		//Prueba 1
		//poder = 100
		//resultado esperado 100
		
		//Prueba 2
		//poder = -20
		//resultado esperado = 0
		
		//Ejecutamos la prueba 1
		Brujo b1 = new Brujo();
		int poder1 = 100;
		int resultadoEsperado = 100;
		b1.setPoder(poder1);
		int resultadoObtenido = b1.getPoder();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("setPoder() Prueba1 -> OK");
		}else {
			System.out.println("setPoder() Prueba1 -> KO");
		}
		//Ejecutamos la prueba 2
		Brujo b2 = new Brujo();
		int poder2 = -20;
		resultadoEsperado = 0;
		b2.setPoder(poder2);
		resultadoObtenido = b2.getPoder();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("setPoder() Prueba2 -> OK");
		}else {
			System.out.println("setPoder() Prueba2 -> KO");
		}
		
		//Prueba 3
		//poder = 20
		//poder = -20
		//resultado esperado = 0
		Brujo b3 = new Brujo();
		b3.setPoder(20);
		b3.setPoder(-20);
		resultadoEsperado = 0;
		resultadoObtenido = b3.getPoder();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("setPoder() Prueba3 -> OK");
		}else {
			System.out.println("setPoder() Prueba3 -> KO");
		}
		
		//Método estaMuerto()
		//Serán 3 pruebas las que hagamos para este método
		//Prueba 1
		//vida = 0
		//resultado esperado = true
		//Prueba 2
		//vida = 1
		//tieneAlma = false
		//resultado esperado = true
		//Prueba 3
		//vida = 1
		//tieneAlma = true
		//resultado esperado = false
		
		//Prueba 1
		Brujo b4 = new Brujo();
		int vida = 0;
		boolean bResultadoEsperado = true;
		b4.setVida(vida);
		boolean bResultadoObtenido = b4.estaMuerto();
		if(bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaMuerto() Prueba 1 -> OK");
		}else {
			System.out.println("estaMuerto() Prueba 1 -> KO");
		}
		
		//Prueba 2
		Brujo b5 = new Brujo();
		vida = 1;
		boolean tieneAlma = false;
		b5.setVida(vida);
		b5.setTieneAlma(tieneAlma);
		bResultadoEsperado = true;
		bResultadoObtenido = b5.estaMuerto();
		if(bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaMuerto() Prueba 2 -> OK");
		}else {
			System.out.println("estaMuerto() Prueba 2 -> KO");
		}
		
		//Prueba 3
		Brujo b6 = new Brujo();
		vida = 1;
		tieneAlma = true;
		b6.setVida(vida);
		b6.setTieneAlma(tieneAlma);
		bResultadoEsperado = false;
		bResultadoObtenido = b6.estaMuerto();
		if(bResultadoEsperado == bResultadoObtenido) {
			System.out.println("estaMuerto() Prueba 3 -> OK");
		}else {
			System.out.println("estaMuerto() Prueba 3 -> KO");
		}
		
	}

}
