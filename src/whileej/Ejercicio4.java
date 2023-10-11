package whileej;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos la variables necesarias
		int num;
		
		//Creamos la variable para el mensaje final
		String mensaje;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos un número da igual que sea positivo o negativo
		System.out.println("Introduce un número positivo o negativo y te digo si es par o impar, si metes 0, se cierra el programa");
		num=sc.nextInt();
		
		while (num!=0) {
			mensaje = (num%2 == 0) ? "par" : "impar";
			System.out.println("El número es " + mensaje);
			System.out.println("Introduce un número positivo o negativo y te digo si es par o impar, si metes 0, se cierra el programa");
			num=sc.nextInt();
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
