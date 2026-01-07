package ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		int [] numeros = new int [12];

		Scanner sc = new Scanner(System.in);

		for (int i = 0;i<numeros.length;i++) {

			System.out.println("Introduce número: ");
			numeros[i] = sc.nextInt();

		}

		for (int i = 0;i<numeros.length;i++) {

			System.out.println(numeros[i]);

		}

		sc.close();
		
	}

	//En las posiciones en las que no se guarda ningun valor se guarda 0 por defecto
	
}
