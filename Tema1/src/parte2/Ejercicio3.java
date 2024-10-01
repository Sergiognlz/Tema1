package parte2;

import java.util.Scanner;

public class Ejercicio3 {
/*Modifica el ejercicio anterior para que, indicando dos números, por ejemplo, num1 y num2, 
 * diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2.*/
	
	public static void main(String[] args) {
		//creamos variables para  guardar los números
		int num1;
		int num2;
		//creamos una varibale para guardar la cantidad que hay que restar
		int rest;
		//creamos escanner
		Scanner sc=new Scanner(System.in);
		
		//pedimos un número al usuario
		System.out.println("Introduce un número entero");
		//guardamos número 
		num1=sc.nextInt();
		//pedimos el segundo número
		System.out.println("Introduce un segundo número para calcular cuanto le queda para ser múltiplo");
		//guardamos el número 2
		num2=sc.nextInt();
		/*declaramos con un ternario que si el módulo de 7 es 0, es decir que si el número ya es múltiplo de 7,
		 * nos dé como resultado 0, en caso contrario nos dé 7 menos el módulo, así nos dice cuantos números nos faltan
		 * para se múltiplo de 7
		 */
		rest=(num1%num2)==0?0:num2-num1%num2;
		//mostramos el resultado por pantalla
		System.out.println(rest);
		//cerramos escaner
		sc.close();
	}
}
