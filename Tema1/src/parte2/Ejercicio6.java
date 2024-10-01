package parte2;

import java.util.Scanner;

public class Ejercicio6 {
/*Solicita al usuario tres distancias:
La primera, medida en milímetros.
La segunda, medida en centímetros.
La última, medida en metros.
Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
*/
	public static void main(String[] args) {
		
		//creamos variable para las tres longitudes que vamos a almacenar
		int milimetros;
		int centimetros;
		int metros;
		//creamos variable para almacenar los cms finales
		double cmsFinal;
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario milimetros
		System.out.println("Introduce milímetros");
		//guardamos milímetros
		milimetros=sc.nextInt();
		//pedimos al usuario centímetros
		System.out.println("Introduce centímetros");
		//guardamos centímetros
		centimetros=sc.nextInt();
		//pedimos al usuario metros
		System.out.println("Introduce metros");
		//guardamos metros
		metros=sc.nextInt();
		
		//realizamos operaciones
		cmsFinal=(milimetros/10)+centimetros+(metros*100);
		
		//mostramos resultado por pantalla
		System.out.println(cmsFinal+" cms.");
		//cerramos escaner
		sc.close();
	}
}
