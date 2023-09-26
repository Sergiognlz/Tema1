package tema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// Guardamos la variable pesetas
		int precioPesetas;
		// Guardamos la variable euros
		double precioEuros;
		// Creamos escaner
		Scanner sc = new Scanner(System.in);
		// Pedimos que el usuario introduzca un valor en pesetas
		System.out.println("Introduce un valor en pesetas");
		// Leemos el valor en pesetas
		precioPesetas = sc.nextInt();
		// Establecemos la relación
		precioEuros = precioPesetas / 166;
		// Convertimos a euros
		System.out.println("Son: " + (double) precioEuros + "€.");
		// Cerramos escaner
		sc.close();

	}

}
