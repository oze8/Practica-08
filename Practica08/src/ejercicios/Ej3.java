package ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		
		char [] caracteres = new char [12];

		Scanner sc = new Scanner(System.in);

		for (int i = 0;i<caracteres.length;i++) {

			System.out.println("Introduce número: ");
			caracteres[i] = sc.next().charAt(0);

		}

		for (int i = 0;i<caracteres.length;i++) {

			System.out.println(caracteres[i]);

		}

		sc.close();
		
	}

	//En las posiciones en las que no se guarda ningun valor se guarda nulo por defecto
	
}
