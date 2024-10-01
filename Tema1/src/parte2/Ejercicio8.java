package parte2;

import java.util.Scanner;

public class Ejercicio8 {
	/*La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una
	 *  competición donde cada participante escribe un algoritmo en un papel y lo lanza, ganando 
	 *  quien consiga lanzarlo más lejos. La peculiaridad del concurso es que la longitud del lanzamiento 
	 *  se mide en metros (con tantos decimales como se desee), pero para el ranking solo se tiene en 
	 *  cuenta la longitud en centímetros (sin decimales). Por ejemplo, para un lanzamiento de 12,3456 m, 
	 *  que son 1234,56 cm solo se contabilizan 1234 cm.
	 * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera 
	 * correspondiente en centímetros. Utiliza la conversión de tipos.*/
	
	public static void main(String[] args) {
		
		//creamos variable donde almacenar los metros que introduciremos
		double metros;
		//creamos variable para guardar los cms
		double centimetros;
		//creamos escaner 
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario los metros
		System.out.println("Introduce los metros del lanzamiento");
		//guardamos el valor en la variable
		metros=sc.nextDouble();
		//realizamos los cálculos para ver a cuantos cms corresponde
		centimetros=metros*100;
		//mostramos los cms por pantalla y truncamos para que nos de solo la parte entera
		System.out.println("El lanzamiento corresponde a "+((int)centimetros));
		
		//cerramos escaner
		sc.close();
		
		
	}

	
	
}
