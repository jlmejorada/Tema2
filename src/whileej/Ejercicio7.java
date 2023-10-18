package whileej;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Creamos las variable
		int num, alt=0;
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Creamos num aleatorio
		Random r = new Random();
		alt = r.nextInt(1,101);
		
		System.out.println("Buenas, vamos a jugar al número secreto");
		System.out.println("Dame un número");
		num = sc.nextInt();
		
		while (num!=alt && num!=-1) {
			System.out.println("Ese no era el número");
			if (num<alt) {
				System.out.println("El número es mayor");
			} else if (num>alt) {
				System.out.println("El número es menor");
			}
			
			System.out.println("Dame otro número");
			num = sc.nextInt();
			
		}
		
		if (num==-1) {
			System.out.println("Suerte en la proxima");
		} else System.out.println("Has acertado!!!");
		
		sc.close();
	}

}
