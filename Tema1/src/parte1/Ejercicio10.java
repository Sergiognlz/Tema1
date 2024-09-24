package parte1;

import java.util.Scanner;

public class Ejercicio10 {
/*Escribir un programa que pida un número al usuario e indique mediante un literal booleano 
 * (true o false) si el número es par.*/
	
public static void main(String[] args) {
	//creamos variables numero y par
	int num;
	boolean par=false;
	
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos número al usuario
	System.out.println("Introduce un número");
	//guardamos el número
	num=sc.nextInt();
	
	//mediante una condicional hacemos que si el número es par el booleano pase a ser verdadero. En caso contrario seguirá siendo falso
	if(num%2==0) {
		par=true;
	}
	//si el booleano es verdadero mostrará el primer mensaje, si es falso el segundo.
	if(par) {
		System.out.println("El número es par");
	}else {
		System.out.println("El número es impar");
	}
	
	//cerramos escaner
	sc.close();
	
}

}

