package parte2;

import java.util.Scanner;

public class Ejercicio5 {
/*Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. 
 * La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de segundos 
 * introducidos por el usuario.*/
	
	public static void main(String[] args) {
		
		//Creamos variable para almacenar los segundos introducidos por el usuario
		int segundosUsuario;
		//variable para calcular horas
		int horas;
		//variable para calcular minutos
		int minutos;
		//variable para calcular segundos
		int segundos;
		
		//creamos escaner
		Scanner sc=new Scanner(System.in);
		
		//pedimos al usuario que introduzca los segundos
		System.out.println("Introduce los segundos");
		//guardamos los segundos en la variable segundosUsuario
		segundosUsuario=sc.nextInt();
		//calculamos horas
		horas=segundosUsuario/3600;
		//calculamos  minutos
		minutos=segundosUsuario%3600/60;
		//calculamos segundos
		segundos=segundosUsuario%3600/60;
		
		//mostramos por pantalla
		System.out.println(horas+" horas, "+minutos+" minutos, "+segundos+" segundos.");
		
		//cerramos escaner
		sc.close();
	}
	
}
