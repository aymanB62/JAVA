package array;

public class _01_Arrays {

	public static void main(String[] args) {
		//Un array en java es una estructura que nos permite
		//almacenar una colección de datos de un mismo tipo.
		
		//Podemos entender un array como tener muchas variables
		//de un mismo tipo declaradas en una estructura.
		
		//Ejemplo, si queremos almacenar 5 numeros en memoria
		//necesitariamos 5 variables de tipo int
		
		int n1= 1;
		int n2= 1;
		int n3= 1;
		int n4= 1;
		int n5= 1;
		
		//Si quisieramos imprimirlo tendriamos que ir 1 a 1
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		System.out.println(n5);
		
		//Los arrays nos permiten almacenar un numero de variables
		//dentro de una misma "variable"
		
		//Podemos declarar un array de la siguiente manera
		
		int[] arrayNumeros = new int[5];
		
		//Con "[]" decimos que la variable será de tipo array
		//Un arra siempre tiene que inicializarse con un tamaño fijo
		//se hace poniendo la parabra reservada "new" luego el tamaño
		//del array entre corcheter junto con el tipo.
		//En este caso, hemos creado un array de tamaño 5
		//es decir, poremos almacenar 5 valores de tipo entero.
		
		//En cada posicion del array podemos almacenar un valor del tipo
		//del array. La primera posicion de un array NO es la posicion 1
		//es la posicion 0. En el array anterior las posiciones irian desde la posicion 0 a la posicion 4.
		
		//Para modificar una posicion del array, debemos de usar
		//la variable y dentro de los corcheters pondremos la pocicion 
		//que queremos modificar
		
		
		//The default initilization of a numeric array is 0.
		arrayNumeros[0] = 1;
		arrayNumeros[1] = 2;
		arrayNumeros[2] = 3;
		arrayNumeros[3] = 4;
		arrayNumeros[4] = 5;
		
		//To access a positiion of the array it's the same way.
		System.out.println(arrayNumeros[0]);//This would be the first position of the array
		System.out.println(arrayNumeros[1]);//This would be the second position of the array
		System.out.println(arrayNumeros[2]);//This would be the third position of the array
		System.out.println(arrayNumeros[3]);//This would be the fourth position of the array
		System.out.println(arrayNumeros[4]);//This would be the fifth position of the array
		
		//Attention! If you access or modigy a non exixtent position, 
		//an execution time error will rise, ArrayIndexOutOfBoundsException concretely
		
		//arrayNumeros[5] = 6 //It doesn't give an compilation error, but in execution time
		
		//Once the array is created, it CAN'T be modified the size. 
		//It's because this tipe of array in java is known as 'static array'
		
		//We can get to know the lenght of the array thanks to the "lenght" property
		System.out.println("El taño del array es: " + arrayNumeros.length);//5
		
		//Because a array is a collection of variables it can be runt throught with a loop
		
		//Ex. save the first 1000 numbers in a variable
		int[] arrayMilNumeros = new int[1000];
		//arrayMilNumeros[0] = 1;
		//arrayMilNumeros[1] = 2;
		//arrayMilNumeros[2] = 3;
		//This is a variable.
		for(int i = 0; i < 1000; i++) {
			arrayMilNumeros[i] = i + 1;
		}
		for(int i = 0; i < 1000; i++) {
			System.out.println(arrayMilNumeros[i]);
		}
		
		//You can create arrays for all types of data
		double[] arrayDouble = new double[5];
		arrayDouble[0] = 34.56;
		
		boolean[] arrayBooleans = new boolean[3];
		arrayBooleans[2] = true;
		//arrayBooleans[3] = true; //Error en tiempo de ejecucion
		
		//Podemos declarar arrays  e inicializarlos al mismo tiempo.
		char[] arrayCaracteres = {'a','b','c','d','e'};
		//The size of this array is 5
		//The number of positions in this array is 5
		//The first position of this array is 'a'
	}

}
