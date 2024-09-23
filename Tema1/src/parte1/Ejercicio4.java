package parte1;

import java.util.Scanner;

public class Ejercicio4 {

	/*Crear una aplicación que calcule la media aritmética de dos notas enteras. 
 * Hay que tener en cuenta que la nota media puede tener decimales.*/
	
	public static void main(String[] args) {
		
	//creamos una variable donde guardar la primera nota
		int nota1;
	//creamos una variable donde guardar la segunda nota
		int nota2;
	//creamos variable donde guardar la nota media
		double notaMedia;
		//creamos objeto escaner
		Scanner sc=new  Scanner(System.in);
		
		//pedimos al usuario la primera nota
		System.out.println("Introduce la primera nota");
		//guardamos la nota
		nota1=sc.nextInt();
		
		 //pedimos al usuario la segunda nota
		System.out.println("Introduce la segunda nota");
		//guardamos la segunda nota
		nota2=sc.nextInt();
		
		//declaramos el valor de la nota media
		notaMedia=((double)nota1+nota2)/2;
		
		//mostramos nota media
		System.out.println("Tu nota media es: "+notaMedia);
		
		//cerramos escaner
		sc.close();
		
	}
}
