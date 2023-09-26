package tema1;
//Importamos escaner.
import java.util.Scanner;

public class Ejercicio7 {
	public static void main(String[] args) {
	//Guardamos la variable nombre
	String nombre;
	//Guardamos la variable dirección
	String direccion;
	//Guardamos la variable número de telefono.
	int telefono;
	//Creamos escaner
	Scanner sc = new Scanner(System.in);
//Pedimos nombre al usuario.
	System.out.println("Introduce tu nombre");
	//Leemos el nombre introducido.
	nombre = sc.nextLine();
	//Pedimos la dirección al usuario.
	System.out.println("Introduce tu dirección");
	//Leemos dirección.
	direccion = sc.nextLine();
	//Pedimos el número de teléfono.
	System.out.println("Introduce tu número de teléfono");
	//Leemos el número de teléfono.
	telefono = sc.nextInt();
	//Mostramos el nombre.
	System.out.println("Nombre: " + nombre);
	//Mostramos la dirección.
	System.out.println("Dirección: " + direccion);
	//Mostramos el teléfono.
	System.out.println("Teléfono: " + telefono);
	//cerramos escaner.
	sc.close();
}
	}