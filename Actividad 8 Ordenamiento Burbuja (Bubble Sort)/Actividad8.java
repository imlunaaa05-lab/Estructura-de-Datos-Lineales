import java.util.Random;

public class Actividad8 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] numeros = new int[12];

        // Generar números aleatorios
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(200) + 1;
        }

        System.out.println("Arreglo original:");

        for (int num : numeros) {
            System.out.print(num + " ");
        }

        int intercambios = 0;

        // Bubble Sort
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros.length - 1 - i; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    // Intercambio
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;

                    intercambios++;
                }
            }
        }

        System.out.println("\n\nArreglo ordenado:");

        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nCantidad de intercambios: " + intercambios);
    }
}
