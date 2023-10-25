package bluclefor;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos la variable contador
		int n;
		
		// Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un número y lo recogemos
		System.out.println("Dame un número y te cuento hasta el");
		n=sc.nextInt();
		
		//Hacemos un bucle que imprima por pantalla números hasta llegar a n
		for (int i = 1 ; i<=n ; i++ ) {
			System.out.println(i);
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
