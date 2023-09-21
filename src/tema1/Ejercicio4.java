package tema1;

import java.util.Scanner;

public class Ejercicio4 {
	public static void main(String[] args) {
// Declaro variables
		int nota1, nota2;
		double notaMedia;
		Scanner sc= new Scanner (System.in);
	//Instrucciones
		System.out.println("Introduce la primera nota:");
		nota1 = sc.nextInt();
		System.out.println("Introduce la segunda nota:");
		nota2 = sc.nextInt();
		notaMedia =(double)(nota1 + nota2)/2;
		System.out.println("La nota media es:"+ notaMedia);
		sc.close();
	}
}
