package ifelse;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos 3 variables para 3 números enteros
		int num1, num2, num3;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Recogemos el primer número
		System.out.println("Dime el primer número");
		num1 = sc.nextInt();

		//Recogemos el segundo número
		System.out.println("Dime el segundo número");
		num2 = sc.nextInt();
		
		//Recogemos el tercer número
		System.out.println("Dime el tercer número");
		num3 = sc.nextInt();
		
		//Hacemos la condicional
		if ((num1+num2) == num3) {
			System.out.println("La suma de " + num1 + " y " + num2 + " es igual a " + num3);
		} else System.out.println("La suma de " + num1 + " y1 " + num2 + " NO es igual a " + num3);

		//Cerramos el escaner
		sc.close();
	}

}
