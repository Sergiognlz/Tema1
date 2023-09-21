package tema1;

import java.util.Scanner;

public class Ejercicio3 {
	public static void main(String[] args) {
		// Introducimos las variables
		int añoNacimiento, añoActual;
		
		Scanner sc = new Scanner(System.in);
	
		// introducimos las instrucciones
		System.out.println("Introduce tu año actual:");
		añoActual = sc.nextInt();
		System.out.println("Introduce tu año de nacimiento:");
		añoNacimiento = sc.nextInt();
		System.out.println("Tu edad es:" + (añoActual - añoNacimiento) );
		// cerramos
		sc.close();
	}
}