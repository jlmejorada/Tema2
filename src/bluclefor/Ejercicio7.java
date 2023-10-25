package bluclefor;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos una variable para guardar el resultado y el número que pediremos
		int res=1, num;
		
		// Creamos una variable escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el número del que queramos el factorial
		System.out.println("Dame un número y te hago su factorial");
		num=sc.nextInt();
		
		//realizamos un bucle que finalice cuando termine el factorial
		for (int i=1 ; i<=num ; i++ ) {
			res=res*i;
		}
		
		//Mostramos por pantalla el factorial
		System.out.println("El factorial del número es " + res);
		
		//Cerramos el escaner
		sc.close();
		
	}

}
