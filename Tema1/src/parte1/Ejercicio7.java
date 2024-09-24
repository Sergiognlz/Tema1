package parte1;

import java.util.Scanner;

public class Ejercicio7 {
/*Escribir un programa que le pida al usuario su nombre, dirección y teléfono. 
 * Guarda cada dato en variables distintas. A continuación, muestra los datos de la siguiente forma:
 * Nombre: Elena
Dirección: Calle Inventada
Teléfono: 987654321* */
	
	public static void main(String[] args) {
		
		//creamos variable nombre, dirección y teléfono.
		String nombre;
		String direccion;
		String telefono;
		
	//creamos escaner
		Scanner sc=new Scanner(System.in);
		
	//pedimos al usuario nombre
		System.out.println("Introduce tu nombre");
		//guardamos nombre
		nombre=sc.nextLine();
		//pedimos dirección
		System.out.println("Introduce tu dirección");
		//guardamos dirección
		direccion=sc.nextLine();
		//pedimos teléfono
		System.out.println("Introduce tu teléfono");
		//guardamos teléfono
		telefono=sc.next();
		
		
		//mostramos la información
		System.out.println("Nombre: "+nombre );
		System.out.println("Dirección: "+direccion);
		System.out.println("Teléfono: "+telefono);
		
		//cerramos escaner
		sc.close();
		
	}
}
