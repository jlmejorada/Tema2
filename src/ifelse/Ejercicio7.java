package ifelse;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos una variable int
		int num, contar;
		
		//Creamos una variable para contar la longitud de caracteres del número
		String cadena;
		
		//Creamos una variable para escanear
		Scanner sc = new Scanner(System.in);
		
		//Pedimos por pantalla un número comprendido entre 0 y 99999
		System.out.println("Introduce un número comprendido entre 0 y 99999 y te digo su número de caracteres");
		num= sc.nextInt();
		
		//Realizamos la condición
		if (num >= 0 && num<=99999) {
			cadena= Integer.toString(num);
			contar=cadena.length();
			
			if (contar==1) {
				System.out.println("Tu número tiene " + contar + " caracter");
				
			} else System.out.println("Tu número tiene " + contar + " caracteres");
			
			
		} else System.out.println("El número no está entre 0 y 99999");
		
		//Cerramos el escaner
		sc.close();

	}

}
