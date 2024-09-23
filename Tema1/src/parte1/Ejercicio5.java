package parte1;

import java.util.Scanner;

public class Ejercicio5 {

	/*
	 * Diseñar una aplicación que calcule la longitud y el área de una
	 * circunferencia. Para ello, el usuario debe introducir el radio, que puede
	 * contener decimales. Usa Math.PI para tomar el valor de PI. (longitud = 2πr,
	 * área=πr2)
	 */

	public static void main(String[] args) {

		// creamos una varible para guardar el radio de la circunferencia
		double radio;
		//creamos variable donde guardar la longitud de la circunferencia
		double longitud;
		// creamos una variable para guardar el área de la circunferencia
		double area;

		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos el radio de la circunferencia al usuario
		System.out.println("Introduce el radio de la circunferencia en cm");
		//guardamos el valor introducido en radio
		radio=sc.nextDouble();
		
		//declaramos el valor de longitud
		longitud=2*Math.PI*radio;
		//declaramos el valor de área
		area=Math.PI*radio*radio;
		//mostramos longitud  por pantalla
		System.out.println("La longitud de la circunferencia es "+longitud+" cm.");
		//mostramos área por pantalla
		System.out.println("El área de la circunferencia es "+area+" cm.");
		
		//cerramos escaner
		sc.close();
		
		
	}
}
