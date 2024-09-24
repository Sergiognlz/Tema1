package parte1;

import java.util.Scanner;

public class Ejercicio6 {
 /*Escribir un programa que le pida dos números al usuario. A continuación, debe mostrar la suma, la resta, la multiplicación
  *  y la división de ambos números. Debe mostrarse el resultado de cada operación en una línea distinta.*/
	
	public static void main(String[] args) {
		
// variable numero 1
		int num1;
//variable num2
		int num2;
		//variable suma, resta, multiplicación y división
	    int suma;
	    int resta;
	    int multi;
	    double divi;
	    
	    //escaner
	    Scanner sc=new Scanner(System.in);
	    
	    //pedimos numero 1
	    System.out.println("Introduce el primer número");
	    //guardamos número 1 en variable num1
	    num1=sc.nextInt();
	    
	    //pedimos número 2
	    System.out.println("Introduce el segundo número");
	    //guardamos número 2 en variable num2
	    num2=sc.nextInt();
	    
	    //declaramos valores suma, resta, multi, divi
	    suma=num1+num2;
	    resta=num1-num2;
	    multi=num1*num2;
	    divi=(double)num1/num2;
	    
	    //mostramos resultados
	    System.out.println("Suma: "+suma);
	    System.out.println("Resta: "+resta);
	    System.out.println("Multiplicación: "+multi);
	    System.out.println("División: "+divi);
	
	    
	    //cerramos escaner
	    sc.close();
	}
	
	
}
