package ifelse;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos la variable para los 3 numeros
		int num1, num2, num3;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el primer numero
		System.out.println("Dame el primer número");
		num1= sc.nextInt();
				
		//Pedimos el segundo numero
		System.out.println("Dame el segundo número");
		num2= sc.nextInt();
				
		//Pedimos el segundo numero
		System.out.println("Dame el segundo número");
		num3= sc.nextInt();

		//Creamos la condicional
		if (num1>num2) {
			if (num1>num3) {
				if (num3>num2) {
					System.out.println(num1 + " > " + num3 + " > " +  num2);
				} else System.out.println(num1 + " > " + num2 + " > " +  num3);
			} else System.out.println(num3 + " > " + num1 + " > " +  num2);
		
		} else if (num1<num2) {
			if (num1<num3) {
				if ((num3>num2)) {
					System.out.println(num3 + " > " + num2 + " > " +  num1);
				} else System.out.println(num2 + " > " + num3 + " > " +  num1);;
			} else System.out.println(num2 + " > " + num1 + " > " +  num3);
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
