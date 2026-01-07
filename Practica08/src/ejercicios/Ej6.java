package ejercicios;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {

		int alumnos;

		try(Scanner sc = new Scanner(System.in)) {

			System.out.println("¿Cuantos alumnos han realizado el examen?: ");
			alumnos = sc.nextInt();

			int[] notas = new int [alumnos];

			for (int i = 0;i<notas.length;i++) {

				System.out.println("Introduce las notas: ");
				notas[i] = sc.nextInt();

			}

			int max = notas[0];
			int min = notas[0];

			for (int i = 1;i<notas.length;i++) {

				if (notas[i] > max) {

					max = notas[i];

				}

				if (notas[i] < min) {

					min = notas[i];

				}

			}

			int aux = 0;
			int media = 0;

			for (int i = 0;i<notas.length;i++) {

				aux += notas[i];
				media = aux / notas.length;

			}

			System.out.println("La nota media es: " + media +
					"\nLa nota máxima es: " + max + 
					"\nLa nota mínima es: " + min);

		}

	}

}
