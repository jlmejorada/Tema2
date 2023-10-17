package whileej;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Creamos una variable que ira recogiendo números
		int num, sum=0, cont=0, neg=0, i=1;
		double med=0;
		//Creamos la variable escaner 
		Scanner sc = new Scanner(System.in);
		
		while (i<=10) {
			
			//Pedimos un número y lo recogemos
			System.out.println("Dame un número");
			num = sc.nextInt();
			
			if (num>0) {
				sum+=num;
			} else if (num<0) {
				med+=(double)num;
				neg++;
			} else cont++;
			
			
			i++;
		}
		//calculamos la media
		med=(double)med/neg;
		
		System.out.println("La suma de los positivos da " + sum + ", la media de los negativos es " + med + " y has introducido " + cont + " ceros.");

		sc.close();
	}

}
