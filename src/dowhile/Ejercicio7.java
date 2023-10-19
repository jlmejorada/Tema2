package dowhile;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos la variable para los dos números y otro para el resultado
		float num1=0, num2=0, res;
				
		// Creamos la variable la opción a elegir
		String vari;
				
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
			
		do {
		//ahora mostramos por pantalla el menú
		System.out.println("****************************");
		System.out.println("************Menú************");
		System.out.println("****************************");
		System.out.println("A) SUMAR LOS NÚMEROS");
		System.out.println("B) RESTAR LOS NÚMEROS");
		System.out.println("C) MULTIPLICAR LOS NÚMEROS");
		System.out.println("D) DIVIDIR LOS NÚMEROS");
		System.out.println("E) SALIR");
		System.out.println("****************************");
				
		
		//y pedimos la opción
		System.out.println("Elige una opción");
		vari = sc.nextLine();
		if (!vari.equals("E")) {
			
			// Pedimos los números y los guardamos
			System.out.println("Dame un número");
			num1 = sc.nextFloat();
							
			System.out.println("Dame otro número");
			num2 = sc.nextFloat();
			sc.nextLine();
		}
				
		switch (vari) {
		case "A" -> {
			res = num1 + num2;
			System.out.println("La suma resulta en "  + res);
		}
		case "B" -> {
			res = num1 - num2;
			System.out.println("La resta resulta en "  + res);
		}
		case "C" -> {
			res = num1 * num2;
			System.out.println("La multiplicación resulta en "  + res);
		}
		case "D" -> {
			res = num1 / num2;
			System.out.println("La división resulta en "  + res);
		}
		case "E" -> {
			System.out.println("Saliendo...");
		}
		default -> {
			System.out.println("Esa opción no esta permitida");
		}
		}
		if (!vari.equals("E")) {
			System.out.println("- - - Pulsa cualquier tecla y enter para continuar - - -");
			sc.nextLine();
		}
		} while (!vari.equals("E"));
		//Cerramos el escaner
		sc.close();


	}

}
