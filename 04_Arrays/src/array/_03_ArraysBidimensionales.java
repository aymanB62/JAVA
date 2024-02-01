package array;

public class _03_ArraysBidimensionales {

	public static void main(String[] args) {
		//Los arrays que hemos trabajado anteriormente son tambien conocidos como 
		//"unidimensionales", por ejemplo podemos guardar el eje de las x.
		
		//Existen tambien los arrays "bidimensionales" para guardar puntos en 
		// un eje de coordenadas de X e Y.
		
		int[][] ejeXY = new int[3][3];
		ejeXY [1][1] = 2;
		ejeXY [2][1] = 3;
		ejeXY [2][1] = 3;
		
		for (int x = 0; x < ejeXY.length;x++) {
			for(int y = 0; y < ejeXY[x].length; y++) {
				System.out.println(ejeXY[x][y]);
			}
		}
		String [][] avengers = new String[4][4];
		avengers[0][0] = "Steve";
		avengers[0][1] = "Rogers";
		avengers[0][2] = "+0044589599999";
		avengers[0][3] = "Queens";
		
		avengers[1][0] = "Natasha";
		avengers[1][1] = "Romanoff";
		avengers[1][2] = "+0049983095430";
		avengers[1][3] = "Molotov";
		
		avengers[2][0] = "Tony";
		avengers[2][1] = "Tony2";
		avengers[2][2] = "Tony3";
		avengers[2][3] = "Tony4";
		
		avengers[3][0] = "Tony5";
		avengers[3][1] = "Tony6";
		avengers[3][2] = "Tony7";
		avengers[3][3] = "Tony8";
		
		for(int x = 0; x <avengers.length;x++) {
			System.out.println("--- DATOS DEL AVENGER " + (x+1) + " ---");
			for(int y = 0; y<avengers[x].length;y++) {
				System.out.print(avengers[x][y] + " - ");
			}
			System.out.println();
		}
	}

}
