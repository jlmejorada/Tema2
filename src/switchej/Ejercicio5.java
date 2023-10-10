package switchej;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/* a) E: remolques.
	      b) D: autobuses.
	      c) C1-C5: camiones.
	      d) A: motocicletas.
	      e) B1-B2: automóviles.
	      f) En caso de introducir uno distinto: “Categoría no contemplada”.
*/
		//Creamos la variable para guardar el carnet de conducir
		String carnet;
		
		//Creamos una variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el tipo de carnet
		System.out.println("Dame tu tipo de carnet");
		carnet = sc.nextLine();
		
		switch (carnet) {
		case "E" -> {
			System.out.println("Tienes carnet para remolque");
		} 
		case "D" -> {
			System.out.println("Tienes carnet para autobuses");
		} 
		case "C1", "C2", "C3", "C4", "C5" -> {
			System.out.println("Tienes carnet para camiones");
		} 
		case "A" -> {
			System.out.println("Tienes carnet para motocicletas");
		} 
		case "B1", "B2" -> {
			System.out.println("Tienes carnet para remolque");
		} 
		default -> {
		System.out.println("Ese carnet no existe");
		}
		}
		
		sc.close();
		
		}
}
