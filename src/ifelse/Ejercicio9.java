package ifelse;

import java.util.Scanner;

public class Ejercicio9 {

	public static final String TIJERA = "TIJERA";
	public static final String PAPEL = "PAPEL";
	public static final String PIEDRA = "PIEDRA";

	public static void main(String[] args) {
		// Creamos 2 variables para elegir las elecciones de ambos jugadores
		String jugador1, jugador2;
		
		//Creammos la variable escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos la decisión del jugador 1
		System.out.println("Jugador1: PIEDRA PAPEL O TIJERA");
		jugador1= sc.nextLine();
		
		//Pedimos la decisión del jugador 2
		System.out.println("Jugador2: PIEDRA PAPEL O TIJERA");
		jugador2= sc.nextLine();
		
		//Creamos las condiciones
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
		} else System.out.println("Porfavor comprueba las mayusculas o que hayas metido las palabras adecuadas");
			
		//Cerramos el escaner
		sc.close();
	}

}
