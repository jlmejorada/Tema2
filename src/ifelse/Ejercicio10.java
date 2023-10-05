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
		} else if ((num1+num3) == num2) {
			System.out.println("La suma de " + num1 + " y " + num3 + " es igual a " + num2);
		} else if ((num2+num3) == num1) {
			System.out.println("La suma de " + num2 + " y " + num3 + " es igual a " + num1);
		} else System.out.println("Ninguna de las combinaciones de suma de 2 de los números resulta en el sobrante");
			
		//Cerramos el escaner
		sc.close();
	}

}
