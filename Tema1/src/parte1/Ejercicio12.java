package parte1;

import java.util.Scanner;

public class Ejercicio12 {

	/*Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas y peras. 
	 * Por este motivo, es necesario diseñar una aplicación que solicite las ventas 
	 * (en kilos, tanto de las peras como de las manzanas). La aplicación mostrará el importe
	 *  total sabiendo que el precio del kilo de manzanas está fijado en 2,35€ y el kilo de peras en 1,95€.*/
	
	
	public static void main(String[] args) {
		
	//creamos variables para guardar los valores de peras y manzanas
		double manzanas;
		double peras;
	//creamos constantes para los valores en euros tanto de manzanas como peras
		final double KILMAN€=2.35;
		final double KILPER€=1.95;
	//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario que introduzca ventas de manzanas
		System.out.println("Introduce los kilos de manzanas vendidos en el último año");
		//guardamos el valor
		manzanas=sc.nextDouble();
		//pedimos al usuario que introduzca ventas de peras
		System.out.println("Introduce los kilos de peras vendidos en el último año");
		//guardamos el valor
		peras=sc.nextDouble();
		
		//mostramos las ventas de peras y manzanas en euros
		System.out.println("Ventas manzanas: "+manzanas*KILMAN€+ "euros.");
		System.out.println("Ventas peras: "+peras*KILPER€+" euros.");
		
		//cerramos escaner
		sc.close();
		
		
		
		
	}
}
