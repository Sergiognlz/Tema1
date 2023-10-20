package tema1;
//Importamos el escaner de java
import java.util.Scanner;

public class Ejercicio10 {
public static void main(String[] args) {
	//Declaramos la constante
	final double IVA=21;
	//Declaramos la variable precio
	double precio;
	//Creamos escaner
	Scanner sc= new Scanner(System.in);
	//Pedimos un precio al usuario
	System.out.println("Introduce un precio en euros");
	//Leemos el precio
	precio= sc.nextDouble();
	//Mostramos el valor en euros del precio con el IVA añadido
	System.out.println("Tu precio más IVA es: " + precio*21/100 );
	//Cerramos el escaner
	sc.close();
}
}
