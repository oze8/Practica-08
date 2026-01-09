package ejercicios;

import java.util.Arrays;

public class prueba5 {

	public static void main(String[] args) {
		
		Integer [] arrayNumeros = {1,2,3,4,5}; 
		System.out.println(Arrays.toString(arrayNumeros));
		
		int[][] matrix = {{1, 2, 3},{4, 5, 6},{7, 8, 9}}; 
		// Sin deepToString, solo muestra referencias de memoria de los arrays internos 
		System.out.println(Arrays.toString(matrix));  
		// Salida: [[I@15db9742, [I@6d06d69c, [I@7852e922] 
		// Con deepToString, muestra todos los elementos 
		System.out.println(Arrays.deepToString(matrix)); 
		// Salida: [[1, 2, 3], [4, 5, 6], [7, 8, 9]] 
		
		int valores[]=new int[20];  
		Arrays.fill(valores,-1); //Todos los elementos del array valdrán -1 
		
		Arrays.fill(valores,5,8,-1); //Del elemento 5 al 7 valdrán -1
		
		
		
		
	}

}
