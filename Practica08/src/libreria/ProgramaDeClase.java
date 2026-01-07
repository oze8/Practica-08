package libreria;

public class ProgramaDeClase {

    public static void main(String[] args) {

        int[] array = new int[10];

        LibreriaDeClase.cargarAleatorio(array);
        LibreriaDeClase.mostrar(array);

        LibreriaDeClase.ordenarBurbuja(array);
        System.out.println("Ordenado:");
        LibreriaDeClase.mostrar(array);
    }
}
