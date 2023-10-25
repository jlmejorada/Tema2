package bluclefor;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos la variable que recoja los dos numeros
		int num1, num2;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Preguntamos y recojemos el primer numero
		System.out.println("Dame un número");
		num1=sc.nextInt();
		
		//Preguntamos y recojemos el segundo numero
		System.out.println("Dame el segundo número (tiene que ser mayor que el primero)");
		num2=sc.nextInt();
		
		if (num1<num2) {
			for (int i=num1; i<=num2; i++) {
				System.out.println(i);
			}
		} else if (num1==num2) {
			System.out.println("No se puede hacer porque los números son iguales");
		} else System.out.println(num1 + " es menor que " + num2);
		
		sc.close();
	}

}
