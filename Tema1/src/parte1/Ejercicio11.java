package parte1;

import java.util.Scanner;

public class Ejercicio11 {

/*Realiza un conversor de pesetas a euros. Para ello, pídele al usuario que te introduzca el valor en pesetas y, 
 * a posteriori, debes mostrarle el resultado de la conversión.(1€ = 166 ptas).*/	
	
	public static void main(String[] args) {
		
	// creamos variable donde guardaremos el valor introducido
		double pesetas=0;
		//creamos variable euro 
		double euros;
		
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario que introduzca el valor
		System.out.println("Introduce un valor en pesetas");
		//guardamos el valor
		pesetas=sc.nextDouble();
		//definimos el valor de conversión
		euros=pesetas/166;
		
		//imprimos el valor en euros por pantalla
		System.out.println(pesetas+" pesetas = "+euros+" euros.");
		
		//cerrramos escaner
		sc.close();
		
		
	}
	
}
