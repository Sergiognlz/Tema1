package parte1;

import java.util.Scanner;

public class Ejercicio15 {
/*Escribe un programa en el que declares una constante IVA de valor igual a 21. A continuación, 
 * pídele un precio al usuario (recuerda que los precios contienen decimales) 
 * y calcula cuál será el precio final con el IVA aplicado.*/
	
	public static void main(String[] args) {
		
		//creamos variable precio
		double precio;
		//creamos constante IVA
		final double IVA=0.21;
		//creamos variable precio final
		
		
	//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos un valor al usuario en euros
		System.out.println("Introduce un precio");
		// guardamos el valor
		precio=sc.nextDouble();
		//Definimos el nuevo valor del precio ya con el IVA incluido
		precio=precio+(precio*IVA);
		
		//mostramos el precio final con el IVA
		System.out.println("El precio con IVA es: "+precio+" euros.");
		
		//cerramos escaner
		sc.close();
	}
}
