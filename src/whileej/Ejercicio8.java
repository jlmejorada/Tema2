package whileej;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos las variables necesarias
		int arbol=0, finalista=0;
		
		//Creamos la variables escaner
		Scanner sc= new Scanner(System.in);
		
		//Pedimos la altura del primer arbol
		System.out.println("Dame alturas de arboles en cm y te digo cual gana");
		arbol=sc.nextInt();
		while (arbol!=-1) {
			if (arbol>=finalista) {
				finalista = arbol;
			}
			
			System.out.println("Dame la altura de otro arbol, introduce -1 para finalizar");
			arbol=sc.nextInt();
		}
		System.out.println("El arbol más grande es el de " + finalista + " centimetros");
		sc.close();
	}

}
