package parte1;

import java.util.Scanner;

public class Ejercicio3 {
/*Escribir una aplicación que pida el año actual y el año de nacimiento del usuario. 
 * Debe calcular su edad.
 */
public static void main(String[] args) {
	
	//creamos variable para el año actual
	int añoAct;
	//creamos variable para el año de nacimiento
	int añoNac;
	//creamos variable edad
	int edad;
	//creamos objeto escaner
	Scanner sc=new Scanner(System.in);
	
	//pedimos el año actual al usuario
	System.out.println("Introduce el año actual");
	//leemos el año actual y lo guardamos en la variable añoAct
	añoAct=sc.nextInt();
	//pedimos el año de nacimiento
	System.out.println("Introduce el año de nacimiento");
	//leemos el año de nacimiento y lo guardamos en la variable añoNac
	añoNac=sc.nextInt();
	//declaramos que la variable edad es igual al año actual menos el de nacimiento.
	edad=añoAct-añoNac;
	//mostramos edad del usuario
	System.out.println("Tu edad es "+edad+" años");
	//cerramos escaner
	sc.close();
	
	
	
	
	
}
	
}
