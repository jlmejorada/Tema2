package switchej;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos una variable para el día de la semana
			int num;
				
		//Creamos la variable escaner
			Scanner sc = new Scanner(System.in);
				
		//Pedimos el numero entero y lo recogemos
			System.out.println("Dime el número del día de la semana");
			num= sc.nextInt();
				
			switch (num) {
			case 1 -> {
				System.out.println("Lunes");
				}
			case 2 -> {
				System.out.println("Martes");
				}
			case 3 -> {
				System.out.println("Miércoles");
				}
			case 4 -> {
				System.out.println("Jueves");
				}
			case 5 -> {
				System.out.println("Viernes");
				}
			case 6 -> {
				System.out.println("Sabado");
				}
			case 7 -> {
				System.out.println("Domingo");
				}
			default -> {
				System.out.println("Este día no existe");
				}
				}
				
		//Cerramos el escaner
			sc.close();
	}

}
