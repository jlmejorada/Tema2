package ifelse;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Creamos una variable para almacenar el número que pidamos y otra para el modulo
		int num, mod;
		
		//Creamos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el número y lo recogemos
		System.out.println("Dame un número");
		num = sc.nextInt();
		
		//Calculamos el modulo del número entre 2, para ver si es par o impar
		mod = num % 2;
		
		//Creamos una condicional que pille el modulo de la division pase un mensaje si es par o impar
		if (mod==0) {
			System.out.println("EL número es par");
		} else {
			System.out.println("El número es impar");
		}
		
		//Cerramos el escaner
		sc.close();
	}


}
