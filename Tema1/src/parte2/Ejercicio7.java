package parte2;

import java.util.Scanner;

public class Ejercicio7 {

/*Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a 
 * calcular el importe que hay que cobrar en la taquilla por la compra de una serie de entradas 
 * (cuyo número será introducido por el usuario). Existen dos tipos de entradas: infantiles, 
 * que cuestan 15,50€; y de adultos, que cuestan 20€. En el caso de que el importe total sea 
 * igual o superior a 100€, se aplicará automáticamente un bono descuento del 5%.*/	

	public static void main(String[] args) {
		
		//creamos dos constantes para los varoles fijos de las entradas, tanto de adultos como infantiles
		final double ENT_INFANTIL=15.50;
		final double ENT_ADULTO=20;
		//creamos variables para el conteo de cada tipo de entrada
		int infantiles;
		int adultos;
		//creamos otra variable para el precio final 
		double euros;
		
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//Pedimos al usuario que introduzca las entradas infantiles vendidas
		System.out.println("Introduce las entradas infantiles vendidas");
		//guardamos el valor en su variable
		infantiles=sc.nextInt();
		//Pedimos al usuario que introduzca las entradas de adulto vendidas
		System.out.println("Introduce las entradas de adultos vendidas");
		//guardamos las entradas de adulto
		adultos=sc.nextInt();
		//realizamos los cálculos
		euros=(infantiles*ENT_INFANTIL)+(adultos*ENT_ADULTO);
		
		System.out.println(((euros>=100)?euros=euros-(euros*0.05):euros)+" euros totales.");
		
		//cerramos escaner
		sc.close();
		
	}
}
