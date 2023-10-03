package ifelse;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos una variable para recoger el número decimal
		float num;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número decimal
		System.out.println("Dame un número decimal");
		num = sc.nextFloat();
		
		//Creamos la condición que debe cumplirse
		if (num != 0 && num != 1 && num != -1 && (num > -1 && num <1)) {
			System.out.println("Es un número casi 0");
		} else {
			System.out.println("No es un número casi 0");
		}
		//Cerramos el escaner
		sc.close();
	}

}
