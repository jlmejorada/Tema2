package dowhile;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Creamos las variables necesarias
		int cont=1, tabla, mul;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número del que vamos a hacer la tabla de multiplicar
		System.out.println("Dime el número del que hacer la tabla de multiplicar");
		tabla=sc.nextInt();
		
		do {
			mul = tabla * cont;
			System.out.println(tabla + " x " + cont + " = " + mul);
			cont++;
		} while (cont<=10);
		
		sc.close();

	}

}
