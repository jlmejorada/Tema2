package bluclefor;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// Variable para pedir las calificaciones y contar suspensos
		int nota, sus=0;
		
		//Inicializamos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Creamos un bucle que recoja números y cuente los suspensos
		for (int i=1 ; i<=5 ; i++ ) {
			System.out.println("Dame tu nota");
			nota=sc.nextInt();
			
			if (nota<5) {
				sus++;
			}
		}
		
		if (sus!=0) {
			System.out.println("Hay " + sus + " suspensos");
		} else System.out.println("No hay suspensos");
		
		//Cerramos el escaner
		sc.close();
		
	}

}
