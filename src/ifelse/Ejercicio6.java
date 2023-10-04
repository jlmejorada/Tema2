package ifelse;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos las variables necesarias para realizar las ecuaciones de 2ºgrado
		double num1, num2, num3;
		double x1, x2;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner (System.in);
		
		//Pedimos el primer número
		System.out.println("Dame el número que será a en la ecucación de 2º grado");
		num1 = sc.nextInt();
		
		//Pedimos el segundo número
		System.out.println("Dame el número que será b en la ecucación de 2º grado");
		num2 = sc.nextInt();
		
		//Pedimos el tercer número
		System.out.println("Dame el número que será c en la ecucación de 2º grado");
		num3 = sc.nextInt();
		
		//Realizamos la operación
		if ((Math.pow(num2,2)-4*num1*num3) >= 0 && 2*num1 != 0 ) {
			x1=(-num2 + Math.sqrt(Math.pow(num2,2)-4*num1*num3))/(2*num1);
			x2=(-num2 - Math.sqrt(Math.pow(num2,2)-4*num1*num3))/(2*num1);
			
			System.out.println("El primer resultado es " + x1 + " y el segundo " + x2);
			
		} else {
			System.out.println("No tiene solución");
		}
		
		//Cerramos el escaner
		sc.close();
	}

}
