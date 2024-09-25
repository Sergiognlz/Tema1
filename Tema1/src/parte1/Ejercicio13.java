package parte1;

import java.util.Scanner;

public class Ejercicio13 {

/*Diseñar un algoritmo que nos indique si podemos salir a la calle. 
 *Existen aspectos que influirán en esta decisión: solo podremos salir a la calle si no está lloviendo y 
 *hemos finalizado nuestras tareas. Existe una opción en la que, indistintamente de lo anterior, 
 *podremos salir a la calle: el hecho de tener que ir a la biblioteca. Solicitar al usuario (mediante un booleano)
si llueve, si ha finalizado las tareas y si necesita ir a la biblioteca.
El algoritmo debe mostrar mediante un booleano (true o false) 
si es posible que se le otorgue permiso para salir a la calle.
*/
	public static void main(String[] args) {
		
	//creamos booleanos para cada condición
		boolean lluvia;
		boolean tareas;
		boolean biblio;
		boolean resultado;
		
		//creamos escaner 
		Scanner sc=new Scanner(System.in);
		
		//preguntamos al usuario si está lloviendo
		System.out.println("¿Está lloviendo?");
		//guardamos resultado
		lluvia=sc.nextBoolean();
		//preguntamos al usuario si ha terminado las tareas
		System.out.println("¿Has terminado las tareas?");
		//guardamos resultado
		tareas=sc.nextBoolean();
		//preguntamos al usuario si tiene que ir a la biblioteca
		System.out.println("¿Tienes que ir a la biblioteca?");
		//guardamos resultado
		biblio=sc.nextBoolean();
		
		//definimos en el resultado si es posible salir a la calle.
		resultado=!lluvia&&tareas||biblio;
		
		//mostramos por pantalla si podemos salir
		System.out.println("¿Podemos salir a la calle? "+resultado);
		
		//cerramos escaner
		sc.close();
		
		
	}
	
}
