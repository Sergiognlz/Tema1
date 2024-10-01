package parte2;

import java.util.Scanner;

public class Ejercicio1 {

/*Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado al entero más próximo. 
 * (SIN UTILIZAR Math.round())*/	
	
	public static void main(String[] args) {
		
	//creamos variable para almacenar un número decimal
		double num=0;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos número al usuario
		System.out.println("Introduce un número decimal.");
		//guardamos el número
		num=sc.nextDouble();
		
		/*mostramos por pantalla el módulo de 1 del número, que nos da la parte decimal y le decimos
		que si es mayor o igual a 0.5 el sume uno en el ternario, en caso contrario lo trunca a entero.*/
		System.out.println(num%1>=0.5?((int)num)+1:(int)num);
		
		
		
		//cerramos escaner
		sc.close();
	}
}
