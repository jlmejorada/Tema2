package dowhile;

import java.util.Scanner;

public class Ejercicio6 {

	public static final String TIJERA = "TIJERA";
	public static final String PAPEL = "PAPEL";
	public static final String PIEDRA = "PIEDRA";
	
	public static void main(String[] args) {
		// Creamos variables
		
		String jugador1, jugador2, jugar;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			do {
				System.out.println("Jugador1 dame PIEDRA PAPEL o TIJERA");
				jugador1 = sc.nextLine() ;
			} while (!jugador1.equals("PIEDRA") && !jugador1.equals("PAPEL") && !jugador1.equals("TIJERA"));
			System.out.println("\n\n\n\n\n\n");
			do {
				System.out.println("Jugador2 dame PIEDRA PAPEL o TIJERA\"");
				jugador2 = sc.nextLine() ;
			} while (!jugador2.equals("PIEDRA") && !jugador2.equals("PAPEL") && !jugador2.equals("TIJERA"));
			
			if (jugador1.equals(PIEDRA) && jugador2.equals(PIEDRA)) {
				System.out.println("Habeis quedado empate");
			} else if (jugador1.equals(PAPEL) && jugador2.equals(PAPEL)) {
				System.out.println("Habeis quedado empate");
			} else if (jugador1.equals(TIJERA) && jugador2.equals(TIJERA)) {
				System.out.println("Habeis quedado empate");
			} else if (jugador1.equals(PIEDRA) && jugador2.equals(PAPEL)) {
				System.out.println("Ha ganado el jugador 2");
			} else if (jugador1.equals(PIEDRA) && jugador2.equals(TIJERA)) {
				System.out.println("Ha ganado el jugador 1");
			} else if (jugador1.equals(PAPEL) && jugador2.equals(PIEDRA)) {
				System.out.println("Ha ganado el jugador 1");
			} else if (jugador1.equals(PAPEL) && jugador2.equals(TIJERA)) {
				System.out.println("Ha ganado el jugador 2");
			} else if (jugador1.equals(TIJERA) && jugador2.equals(PIEDRA)) {
				System.out.println("Ha ganado el jugador 2");
			} else if (jugador1.equals(PAPEL) && jugador2.equals(PAPEL)) {
				System.out.println("Ha ganado el jugador 1");
			}
			System.out.println("Quieres seguir jugando? s/n");
			jugar=sc.nextLine();
		} while (jugar.equalsIgnoreCase("s"));

		sc.close();
	}

}
