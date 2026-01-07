package libreria;

import java.util.Scanner;

public class ProgramaDeObjeto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		LibreriaDeObjeto array = new LibreriaDeObjeto(10);
		int opcion;

		do {
			System.out.println("\n--- MENÚ ---");
			System.out.println("1. Cargar aleatorio");
			System.out.println("2. Mostrar array");
			System.out.println("3. Máximo");
			System.out.println("4. Suma");
			System.out.println("5. Ordenar burbuja");
			System.out.println("6. Desordenar");
			System.out.println("0. Salir");
			System.out.print("Opción: ");
			opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				array.cargarAleatorio();
				break;
			case 2:
				System.out.println(array.toString());
				break;
			case 3:
				System.out.println("Máximo: " + array.maximo());
				break;
			case 4:
				System.out.println("Suma: " + array.suma());
				break;
			case 5:
				array.ordenarBurbuja();
				break;
			case 6:
				array.desordenar();
				break;
			}
		} while (opcion != 0);

		sc.close();

	}

}
