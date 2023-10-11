package whileej;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos la variable para almacenar el número introducido por el usuario y el contador
			int cont=0, num;
				
		// Creamos la variable escaner
			Scanner sc = new Scanner(System.in);
				
		//Pedimos el número y lo recogemos
			System.out.println("Dame un número positivo para contar, si me das uno negativo para el programa");
			num = sc.nextInt();
				
			while (num >= 0) {
				//El contador avanza si el bucle se repite
			cont++;
					
			//Pedimos el número y lo recogemos
			System.out.println("Dame un número positivo para contar, si me das uno negativo para el programa");
			num = sc.nextInt();
			}
				
			//Enseñamos la cantidad de números positivos que se han introducidos
			System.out.println("Se han introducido " + cont + " números positivos");
				
			//Cerramos el escaner
			sc.close();

	}

}
