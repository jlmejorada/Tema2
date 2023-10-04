package ifelse;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Creamos la variable
		int nota;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos un número real
		System.out.println("Introduce tu nota");
		nota = sc.nextInt();
		
		//Creamos la condicional
		if (nota < 0) {
			System.out.println("Las notas deben ser mayor de 0");
		} else if (nota > 10){
			System.out.println("Normalmente no puedes sacar más que un 10, pero si lo has hecho, has sacado un SOBRESALIENTE");
		} else if (nota >= 9) {
			System.out.println("Has sacado un SOBRESALIENTE");
		} else if (nota >= 7){
			System.out.println("Has sacado un NOTABLE");
		} else if (nota >= 6){
			System.out.println("Has sacado un BIEN");
		} else if (nota >= 5){
			System.out.println("Has sacado un SUFICIENTE");
		} else {
			System.out.println("Has sacado un INSUFICIENTE");
		}
		
		//Cerramos el escaner
		sc.close();

	}

}
