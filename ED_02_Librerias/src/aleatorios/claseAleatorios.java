package aleatorios;

import java.util.Random;

public class claseAleatorios {

	public int numeroAleatorioEntreDosNumeros(int n1, int n2) {
		Random p = new Random();
		int nAleatorio = p.nextInt(n1, n2+1);
		return nAleatorio;
	}

	public int numeroAleatorio() {
		Random p = new Random();
		int nAleatorio = p.nextInt();
		return nAleatorio;
	}
}
