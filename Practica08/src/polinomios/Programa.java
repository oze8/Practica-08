package polinomios;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		int opcion = 0;

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Introduce el grado del primero polinomio: ");
			int pol1 = sc.nextInt();
			
			System.out.println("Introduce el grado del segundo polinomio: ");
			int pol2 = sc.nextInt();
			
			int [] polinomio1 = new int [pol1];
			int [] polinomio2 = new int [pol2];
			
			for (int i = pol1;pol1 > 0;i--) {
				System.out.println("Introduce el numero de exponente: " + i);
				polinomio1 [i] = sc.nextInt();
				
				
			}
			
			do {

				System.out.println("-------------------------"
						+ "\n1. Suma"
						+ "\n2. Resta"
						+ "\n3. Multiplicación"
						+ "\n4. Salir"
						+ "\n-------------------------");
				opcion = sc.nextInt();

				if (opcion == 1) {
					
					
					
				}
				

			}while (opcion != 4);

		}

	}

}
