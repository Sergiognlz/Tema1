package parte1;

import java.util.Scanner;

public class Ejercicio9 {
/*Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de edad 
 * (mediante un literal booleano: true o false).*/
	
	public static void main(String[] args) {
		
		//creamos variables edad y mayor
		int edad;
		boolean mayor=false;
		
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos edad al usuario
		System.out.println("Introduce tu edad");
		//guardamos la edad
		edad=sc.nextInt();
		
		//mediante una condicional hacemos que si es edad es mayor que 18 el booleano pase a ser verdadero. En caso contrario seguirá siendo falso
		if(edad>=18) {
			mayor=true;
		}
		//si el booleano es verdadero mostrará el primer mensaje, si es falso el segundo.
		if(mayor) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("Eres menor de edad");
		}
		
		//cerramos escaner
		sc.close();
		
	}
	
	
}
