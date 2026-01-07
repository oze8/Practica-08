package ejercicios;

public class Ej5 {

	public static void main(String[] args) {

		int suma = 0,cont = 0;

		int [] array = new int [20];

		for (int i = 0;i<array.length;i++) {

			array[i] = (int) (Math.random() * 20 + 1);

		}

		for (int i = 0;i<array.length;i++) {

			System.out.println("Posición: " + i + " Valor: " + array[i]);

			if (i % 2 != 0) {

				suma += array[i];
				cont++;

			}

		}

		System.out.println("Hay: " + cont + " números en las posiciones impares y su suma es: " + suma);

	}

}
