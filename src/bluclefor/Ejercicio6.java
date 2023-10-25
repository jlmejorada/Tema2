package bluclefor;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Creamos una variable que sumara los números impares
		int sum=0;
		
		//Creamos un bucle que finalizara hasta llegar a los 10 primeros números impares
		for (int i=0 ; i<=20 ; i++ ) {
			if (i%2 != 0) {
				sum=sum+i;
			}
		}
		System.out.println("La suma de los primeros 10 números impares es " + sum);
	}

}
