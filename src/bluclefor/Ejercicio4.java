package bluclefor;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos una variable
		int num, cont=0;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un número maximo
		System.out.println("¿Hasta que número vamos a contar los múltiplos de 3?");
		num = sc.nextInt();
		
		
		// Un bucle for que muestre los multiplos de 7, menor que 100
		for (int i = 0 ; i<=num ; i++ ) {
			// Este if comprueba si un número es multiplo de 7
			if (i%3 == 0) {
				cont++;
			}
			
		}
		System.out.println(cont);
		
		//Cerramos el escaner
		sc.close();
	}

}
