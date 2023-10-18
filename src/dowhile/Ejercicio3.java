package dowhile;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos las variables necesarias
		int nummax, cont=1, sum=0;
		
		//Creamos la variables escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número maximo
		System.out.println("Dame el número máximo que sumaremos en la sucesión");
		nummax=sc.nextInt();
		
		do {
			sum+=cont;
			cont++;
		} while (cont<=nummax);
		
		System.out.println(sum);
		sc.close();
		

	}

}
