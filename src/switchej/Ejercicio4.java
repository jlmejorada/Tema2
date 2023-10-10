package switchej;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos las variables con las que vamos a trabajar
		int valor1, valor2, res;
		
		// Creamos las variables para los números introducidos
		String num1, num2;
		
		// Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		// Pedimos los números y los guardamos
		System.out.println("Dame el resultado de tu dado");
		num1 = sc.nextLine();

		// Pedimos los números y los guardamos
		System.out.println("Dame el resultado de tu otro dado");
		num2 = sc.nextLine();
		
		
		valor1 = switch (num1) {
		case "UNO" -> 1 ;
		case "DOS" -> 2 ;
		case "TRES" -> 3 ;
		case "CUATRO" -> 4 ;
		case "CINCO" -> 5 ;
		case "SEIS" -> 6 ;
		default -> 0;
		};

		valor2 = switch (num2) {
		case "UNO" -> 1 ;
		case "DOS" -> 2 ;
		case "TRES" -> 3 ;
		case "CUATRO" -> 4 ;
		case "CINCO" -> 5 ;
		case "SEIS" -> 6 ;
		default -> 0;
		};
		
		res = valor1 + valor2;
		System.out.println("La suma de tus dados da " + res);
		
		//Y por último cerramos el escaner
		sc.close();
	}

}
