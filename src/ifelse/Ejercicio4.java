package ifelse;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Creamos dos variables para recoger los dos numeros
		int num1, num2;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos y recogemos un número 
		System.out.println("Dame un número");
		num1= sc.nextInt();
		
		//Pedimos y recogemos otro numero
		System.out.println("Dame otro número");
		num2= sc.nextInt();
		
		//Creamos la condicional
		if (num1 == num2) {
		System.out.println("Los números introducidos son iguales");
		} else {
			if (num1 < num2) {
				System.out.println(num1 + " < " + num2);
			} else {
				System.out.println(num2 + " < " + num1);
			}
		}
		
		//Cerramos el escaner
		sc.close();
		

	}

}
