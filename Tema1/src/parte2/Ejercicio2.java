package parte2;

import java.util.Scanner;

public class Ejercicio2 {
/*Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que sea 
 * múltiplo de 7. Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. 
 * En el caso de 13 habría que sumarle 1. Usa el operador módulo (%) para calcularlo.*/
	
	public static void main(String[] args) {
		//creamos variables para  guardar los números
		int num;
		//creamos una varibale para guardar la cantidad que hay que restar
		int rest;
		//creamos escanner
		Scanner sc=new Scanner(System.in);
		
		//pedimos un número al usuario
		System.out.println("Introduce un número entero");
		//guardamos número 
		num=sc.nextInt();
		/*declaramos con un ternario que si el módulo de 7 es 0, es decir que si el número ya es múltiplo de 7,
		 * nos dé como resultado 0, en caso contrario nos dé 7 menos el módulo, así nos dice cuantos números nos faltan
		 * para se múltiplo de 7
		 */
		rest=(num%7)==0?0:7-num%7;
		//mostramos el resultado por pantalla
		System.out.println(rest);
		//cerramos escaner
		sc.close();
		
	}
}
