package ejercicios;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {

		int[]array = new int [8];

		Scanner sc = new Scanner(System.in);

		for (int i = 0;i<array.length;i++) {

			System.out.println("Introduce un número: ");
			array[i] = sc.nextInt();

		}

		for (int i = array.length - 1;i>=0;i--) {

			System.out.println(array[i]);

		}

		sc.close();

	}

}
