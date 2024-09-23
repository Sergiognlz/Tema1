package parte1;

import java.util.Scanner;

public class Ejercicio2 {

	//Pedir al usuario su edad y mostrar la edad que tendrá el próximo año.
	
	public static void main(String[] args) {
		
	 //creamos variable donde guardar la edad
		int edad;
		//creamos  objeto escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario su edad
		System.out.println("Introduce tu edad");
		//guardamos el número introducido en  la variable edad
		edad= sc.nextInt();
		//mostramos la edad actual +1
		System.out.println("El año que viene tendrás "+(edad+1)+" años.");
		
		//cerramos escaner
		sc.close();
		
	
	}
}
