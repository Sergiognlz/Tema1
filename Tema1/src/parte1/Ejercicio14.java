package parte1;

import java.util.Scanner;

public class Ejercicio14 {
/*Escribir un programa que solicite las notas del primer, segundo y tercer trimestre 
 * (notas enteras que se solicitarán al usuario). El programa debe mostrar la nota media del curso como se
utiliza en el boletín de calificaciones (solo la parte entera) y como se usa en el 
expediente académico (con decimales).
 */
	
	public static void main(String[] args) {
		
		//creamos variable para el primer, segundo y tercer trimestre
		int tri1;
		int tri2;
		int tri3;
		//creamos variables para media
		double media;
		
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario las notas
		System.out.println("Introduce las notas del primer trimestre");
		//guardamos el valor
		tri1=sc.nextInt();
		//seguimos pidiendo notas
		System.out.println("Introduce las notas del segundo trimestre");
		//guardamos el valor
		tri2=sc.nextInt();
		//adivina que pedimos
		System.out.println("Introduce las notas del tercer trimestre");
		//guardamos el valor
		tri3=sc.nextInt();
		//definimos el valor de la media
		media=((double)tri1+tri2+tri3)/3;
		
		//mostramos por pantalla los dos resultados
		System.out.println("Nota media calificaciones: "+(int)media);
		System.out.println("Nota media académica: "+media);
		
		//cerramos escaner
		sc.close();
		
		
	}
}
