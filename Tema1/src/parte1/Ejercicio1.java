package parte1;

import java.util.Scanner;

public class Ejercicio1 {
	/*
	 * Diseña un programa que pida un número al usuario y a continuación lo muestre.
	 */

	public static void main(String[] args) {

		// creamos varible número
		int num;
		// creamos el objeto scanner
		Scanner sc = new Scanner(System.in);
		// pedimos un número al usuario
		System.out.println("Introduce un número");
		//recogemos el número introducido y lo guardamos en la variable.
		num = sc.nextInt();
		//mostramos el número guardado
		System.out.println(num);
		//cerramos escaner.
		sc.close();

	}

}
