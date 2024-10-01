package parte2;

import java.util.Scanner;

public class Ejercicio4 {
/*Dado el siguiente polinomio de segundo grado:
y=ax2+bx+c
Crea un programa que pida los coeficientes a, b y c, así como el valor de x, 
y calcula el valor correspondiente de y.*/

public static void main(String[] args) {
	//creamos variables para a, b, c y x
	int a;
	int b;
	int c;
	int x;
	double y;
	//creamos escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos valores al usuario
	System.out.println("Introduce el valor de a");
	//guardamos el valor
	a=sc.nextInt();
	System.out.println("Introduce el valor de b");
	//guardamos el valor
	b=sc.nextInt();
	System.out.println("Introduce el valor de c");
	//guardamos el valor
	c=sc.nextInt();
	System.out.println("Introduce el valor de x");
	//guardamos el valor
	x=sc.nextInt();
	
	//declaramos el valor de y con la ecuación
	y=a*x*(Math.pow(x,2))+b*x+c;
	
	//mostramos resultado por pantalla
	System.out.println(y);
	
	//cerramos escaner
	sc.close();

	
	
}
}