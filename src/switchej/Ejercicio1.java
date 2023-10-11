package switchej;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos una variable para la nota entera
		int num;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero entero y lo recogemos
		System.out.println("Dame el número entero de tu nota");
		num= sc.nextInt();
		
		
		switch (num) {
		case 0, 1, 2, 3, 4 -> {
			System.out.println("INSUFICIENTE");
			System.out.println("Tienes que estudiar más");
		}
		case 5 -> {
			System.out.println("SUFICIENTE");
		}
		case 6 -> {
			System.out.println("BIEN");
		}
		case 7, 8 -> {
			System.out.println("NOTABLE");
		}
		case 9, 10 -> {
			System.out.println("SOBRESALIENTE");
		}
		default -> {
			System.out.println("Esa nota no es posible");
		}
		}
		
		//Cerramos el escaner
		sc.close();
		
	}

}
