package tema1;

import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[] args) {
		//Variable donde guardar el primer número.
		double numero1;
		//Variable donde guardar el segundo número.
		double numero2;
		//Creo el escaner.
	Scanner sc = new Scanner (System.in);
	//Pedimos al usuario que introduzca el primer número.
	System.out.println("Introduce un número: ");
	//Leemos el número introducido
	numero1 = sc.nextDouble();
	//Pedimos al usuario que introduzca el segundo número.
	System.out.println("Introduce un segundo número: ");
	//Leemos el segundo número introducido.
	numero2 = sc.nextDouble();
	//Mostramos la suma de ambos números
	System.out.println("La suma de ambos número es: " + (numero1+numero2));
	//Mostramos la resta del primer número menos el segundo.
	System.out.println("El primer número menos el segundo es: " + (numero1-numero2));
	//Mostramos la multiplicación de ambos números
	System.out.println("La multiplicación de ambos números es: "+(numero1*numero2));
	//Mostramos la división del primero entre el segundo
	System.out.println("El primer número dividido entre el segundo es: " +(numero1/numero2));
	//Cerramos escaner
	sc.close();
}
}
