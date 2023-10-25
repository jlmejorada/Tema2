package bluclefor;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Creamos las variables necesarias
		int num;
		
		boolean primo=true;
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero y lo registramos
		System.out.println("Dame un número y te digo si es primo o no");
		num=sc.nextInt();
		
		if (num>1) {
			for (int i=2 ; i<num ; i++ ) {
				if (num%i==0) {
					primo=false;
				} 
			}
		} else primo=false;
		
		if (primo==true) {
			System.out.println("Es un número primo");
		} else System.out.println("NO es un número primo");
		
		
		sc.close();

	}

}
