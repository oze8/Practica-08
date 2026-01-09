package ejercicios;

public class prueba4 {

	public static void main(String[] args) {
		
		int[][] matriz = {{0,30,2,0,0,5},{75,0,0,0,0,0},{0,0,-2,9,0,11}};

		for (int fil = 0;fil<matriz.length;fil++) { 
			for (int col = 0;col < matriz[fil].length;col++) {  

				System.out.print(matriz[fil][col] + "\t");

			}

			System.out.println();

		}

		
	}

}
