package Actividad02;

public class Ejercicio_02 {

	public static void main(String[] args) {
		
		//Calculadora de Area y Perimetro
		int longitud = 20;
		int ancho = 8;
		int area = longitud * ancho;
		int perimetro = 2 * (ancho + longitud);
		
		System.out.println("El perimetro es: " + perimetro + "y el area es :" + area);
		
		longitud = 8;
		ancho = 2;
		area = longitud * ancho;
		perimetro = 2 * (ancho + longitud);
		
		System.out.println("El perimetro es: " + perimetro + "y el area es :" + area);
		
		//Conversion de temperatura
		
		int gradosFAR = 140;
		int celsius = (gradosFAR - 32) * 5 / 9;
		System.out.println(gradosFAR + " Farenheit en Celsius es " + celsius);
		
		//Calculo area circulo
		double PI =  3.1415;
		double radio = 4;
		double area2 = PI * Math.pow(radio, 2);
		System.out.println("El area del circulo es: " + area2);
		
		//Calcular el interes simple
		double tasa = 1.5;
		double tiempo = 20;
		double principal = 200000;
		double interes = principal * tasa * tiempo;
		System.out.println(interes);
		
		//Conversion a moneda
		double EUR = 40;
		double USD = 0.95 * EUR;
		System.out.println(EUR +" euros "+"son " + USD + " USD");
		
		//Calculo de IMC
		double peso = 60;
		double altura = 1.70;
		double IMC = peso / (altura * altura);
		String.format("%.2f" , IMC);
		System.out.println("Tu IMC es de: " + String.format("%.2f" , IMC));
		}

}
