package ejercicios;

import java.util.Scanner;

/**
 * Clase que genera una matriz cuadrada del tamaño que nos indique el usuario
 * sus valores serán aleatorios, excepto el de la diagonal principal que será 
 * siempre 1
 */
public class prueba2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Indice el tamaño de las filas: ");
		int filas = sc.nextInt();

		System.out.print("Indice el tamaño de las columnas: ");
		int columnas = sc.nextInt();

		int[][] matriz = new int [filas][columnas];

		for (int fil = 0;fil<matriz.length;fil++) { 
			for (int col = 0;col < matriz[fil].length;col++) { 

				if (fil == col) {

					matriz[fil][col] = 1;

				}

				else {

					matriz[fil][col] = (int) (Math.random()*100);

				}

			}

		}

		for (int fil = 0;fil<matriz.length;fil++) { 
			for (int col = 0;col < matriz[fil].length;col++) {  

				System.out.print(matriz[fil][col] + "\t");

			}

			System.out.println();

		}

		sc.close();

	}

}
