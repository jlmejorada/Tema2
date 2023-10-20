package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos una variable minimo y otra maximo
		int min=1, max=101, alt;
		
		String cond="";
		
		//Creamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Creamos num aleatorio
		Random r = new Random();
		
		do {
			alt = r.nextInt(min,max);
			System.out.println("El número es " + alt + "?");
			cond = sc.nextLine();
			
			if (cond.equals("mayor")) {
				min = alt + 1;
			} else if (cond.equals("menor")) {
				max = alt;
			}
			
		} while (!cond.equals("bien"));
		
		System.out.println("Te he ganado JAJAJAJAJ, las maquinas triunfamos");
		
		sc.close();
		
		

	}

}
