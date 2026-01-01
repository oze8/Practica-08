package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {

		int i = 0,aux = 0;
		int [] numeros = new int [10];
		
		try(Scanner sc = new Scanner(System.in)) {

			do {

				System.out.println("Introduce un número: ");
				numeros [i] = sc.nextInt();

				i++;
				
			} while (i < numeros.length);
			
			for (int c = 0;c<numeros.length;c = c+2) {
				
				aux += numeros[c];
				System.out.println(numeros[c]);
				
			}
			
			System.out.println("La suma es: " + aux);
			
		}

	}	

}
