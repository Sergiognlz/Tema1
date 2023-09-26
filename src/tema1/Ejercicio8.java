package tema1;

import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		//Guardamos la variable nombre
		String nombre;
		//Guardamos la variable edad
		int edad;
		//Creamos escaner
		Scanner sc = new Scanner(System.in);
	//Pedimos nombre al usuario.
		System.out.println("Introduce tu nombre");
		//Leemos el nombre introducido.
		nombre = sc.nextLine();
		//Pedimos la edad al usuario.
		System.out.println("Introduce tu edad");
		//Leemos edad.
		edad = sc.nextInt();
		//Mostramos el nombre y la edad junto con el texto.
		System.out.println("Hola " + nombre + "tienes " + edad + " años. ¡Qué mayor eres!");
		//cerramos escaner.
		sc.close();
	}
}
