package parte1;

import java.util.Scanner;

public class Ejercicio8 {
/*Escribe un programa que pida al usuario su nombre y su edad y muestre por pantalla un mensaje como el siguiente: 
 * “Hola Juanito, tienes 21 años, ¡qué mayor eres!”. */
	
	public static void main(String[] args) {
		
	//creamos variables que vamos a usar
	String nombre;
	int edad;
	
	//creamos Escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos al usuario su nombre
	System.out.println("Introduce tu nombre");
	//guardamos nombre
	nombre=sc.nextLine();
	//pedimos edad
	System.out.println("Introduce tu edad");
	//guardamos edad
	edad=sc.nextInt();
	
	//mostramos nombre y edad por pantalla
	
	System.out.println("Hola "+nombre+", tienes "+edad+" años, ¡qué mayor eres!");
		
	//cerramos escaner
	sc.close();
	}
}
