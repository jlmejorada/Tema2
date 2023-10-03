package ifelse;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos las variables para los dos números a introducir
		int num1, num2;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos y recogemos el primer número
		System.out.println("Dame el primer número");
		num1 = sc.nextInt();
		
		//Pedimos y recogemos el primer segundo
		System.out.println("Dame el segundo número");
		num2 = sc.nextInt();
		
		//Comparamos los números con la condicional y mopstramos mensaje por pantalla
		if (num1 == num2) {
			System.out.println("Los números son iguales");
		} else {
			System.out.println("Los números no son iguales");
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
