package libreria;

import java.util.Random;
import java.util.Scanner;

public class LibreriaDeObjeto {

    private int[] array;
    private Scanner teclado = new Scanner(System.in);

    public LibreriaDeObjeto(int tamaño) {
        array = new int[tamaño];
    }

    // Cargar por teclado
    public void cargarTeclado() {
        for (int i = 0; i < array.length; i++) {
            System.out.print("Introduce los números: ");
            array[i] = teclado.nextInt();
        }
    }

    // Cargar aleatorio
    public void cargarAleatorio() {
        Random aleatorio = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = aleatorio.nextInt(100) + 1;
        }
    }

    // toString
    public String toString() {
        
    }

    // Máximo
    public int maximo() {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Mínimo
    public int minimo() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Suma
    public int suma() {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma;
    }

    // Búsqueda lineal
    public int buscarLineal(int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                return i;
            }
        }
        return -1;
    }

    // Ordenación burbuja
    public void ordenarBurbuja() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    // Desordenar
    public void desordenar() {
        Random aleatorio = new Random();
        for (int i = 0; i < array.length; i++) {
            int posicion = aleatorio.nextInt(array.length);
            int aux = array[i];
            array[i] = array[posicion];
            array[posicion] = aux;
        }
    }

    // Insertar por posición
    public void insertar(int posicion, int numero) {
        if (posicion < 0 || posicion >= array.length) {
            System.out.println("Posición no válida");
            return;
        }

        for (int i = array.length - 1; i > posicion; i--) {
            array[i] = array[i - 1];
        }
        array[posicion] = numero;
    }

    // Borrar por posición
    public void borrarPosicion(int posicion) {
        if (posicion < 0 || posicion >= array.length) {
            System.out.println("Posición no válida");
            return;
        }

        for (int i = posicion; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = 0;
    }

    // Borrar un elemento (primera aparición)
    public void borrarElemento(int numero) {
        int pos = buscarLineal(numero);
        if (pos != -1) {
            borrarPosicion(pos);
        }
    }

    // Borrar todas las apariciones
    public void borrarTodos(int numero) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                borrarPosicion(i);
                i--;
            }
        }
    }
}
