package whileej;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos la variable para almacenar el número introducido por el usuario y para la suma
		int suma=0, num;
		
		// Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número y lo recogemos
		System.out.println("Dame un número positivo para sumar, si me das uno negativo para el programa");
		num = sc.nextInt();
		
		while (num >= 0) {
			//Realizamos la suma con el número introducido y lo que guardamos de la anterior suma
			suma += num;
			
			//Pedimos el número y lo recogemos
			System.out.println("Dame un número positivo para sumar, si me das uno negativo para el programa");
			num = sc.nextInt();
		}
		
		//Enseñamos el resultado de la suma
		System.out.println("La suma da " + suma);
		
		//Cerramos el escaner
		sc.close();

	}

}
