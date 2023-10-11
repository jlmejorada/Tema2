package whileej;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Creamos la variable para almacenar el número introducido por el usuario, la suma y el resultado
				int suma=0, num, contador=0;
				float resul=0;
						
		// Creamos la variable escaner
				Scanner sc = new Scanner(System.in);
					
		//Pedimos el número y lo recogemos
				System.out.println("Dame un número positivo para hacer la media, si me das uno negativo para el programa");
				num = sc.nextInt();
						
				while (num >= 0) {
					//sumamos los números para despues realizar la media
					suma+=num;
					
					//Hacemos un contador para saber entre cuantos números dividir
					contador++;
							
					//Pedimos el número y lo recogemos
					System.out.println("Dame un número positivo para contar, si me das uno negativo para el programa");
					num = sc.nextInt();
				}
						
				
			//Realizamos la media
				resul= (float) suma/contador;
				
			//Enseñamos la cantidad de números positivos que se han introducidos
				System.out.println("La media de los números positivos introducidos resulta " + resul);
						
			//Cerramos el escaner
				sc.close();

	}

}
