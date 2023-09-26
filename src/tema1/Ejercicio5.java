package tema1;

import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Variables donde guardar el radio.
		double radio;
		//Variable donde guardar la longitud.
		double longitud;
		//Variable donde guardar el área.
		double area;
		//Creo un Scanner para leer el teclado.
		Scanner sc = new Scanner(System.in);
		// Le pido al usuario que introduzca un radio.
		System.out.println("Introduce el radio:");
		//Leemos el radio del teclado.
		radio = sc.nextDouble();
		//Calculamos la longitud
		longitud = (2*Math.PI*radio);
		//Calculamos el Área.
		area = (Math.PI*Math.pow(radio,2));
		//Mostramos la longitud en la consola.
		System.out.println("La longitud es: "+ longitud);
		//Mostramos ell área en la consola.
		System.out.println("El área es: " + area);
		//cerramos el Scanner
		sc.close();
		
	}

}
