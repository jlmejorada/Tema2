package whileej;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// creamos las variables
		int edad=0, suma=0, cont=0, mayor=0;
		double med=0;
		
		// Abrimos los escaner
		Scanner sc= new Scanner(System.in);
		
		//Pedimos números
		System.out.println("Dame la edad de un alumno");
		edad= sc.nextInt();
		
		while (edad>=0) {
			
			suma+=edad;
			
			if (edad>=18) {
				mayor++;
			}
			
			cont++;
			
			System.out.println("Dame la edad de otro alumno");
			edad= sc.nextInt();
		}
		med=(double) suma/cont;
		
		System.out.println("La suma de las edades es de " + suma + ",la media de edad de los " + cont + " alumnos es de " + med + " y  de estos, " + mayor + " son mayor de edad.");
	
		sc.close();
	}

}
