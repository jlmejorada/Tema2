package dowhile;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Creamos las variables necesarias
		int cont=1, mod;
				
		do {
			mod=cont%2;
			if (mod==0) {
			System.out.println(cont);
			}
			cont++;
		} while (cont<=200);
			
	}

}
