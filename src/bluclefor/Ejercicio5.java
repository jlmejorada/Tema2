package bluclefor;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos una variable para pedir número y guardar la suma
		int num;
		float res=0;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Creamos un bucle para recoger los 10 números
		for (int i = 1 ; i <=10 ; i++) {
			System.out.println("Dame el " + i + " de 10 y te hago la media");
			num=sc.nextInt();
			
			res=res+num;
		}
		
		res=res/10;
		System.out.println("El resultado es de " + res);
		
		//Cerramos el escaner
		sc.close();
		
		

	}

}
