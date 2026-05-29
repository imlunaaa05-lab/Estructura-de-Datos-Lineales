import java.util.Random;
import java.util.Scanner;

public class Actividad4 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[15];

        // Generar arreglo aleatorio
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }

        System.out.println("Arreglo generado:");

        for (int num : numeros) {
            System.out.print(num + " ");
        }

        System.out.print("\n\nIngrese el número a buscar: ");
        int buscar = sc.nextInt();

        boolean encontrado = false;
        int comparaciones = 0;

        System.out.println("\nResultado de búsqueda:");

        for (int i = 0; i < numeros.length; i++) {

            comparaciones++;

            if (numeros[i] == buscar) {
                System.out.println("Número encontrado en el índice " + i);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("El número no fue encontrado.");
        }

        System.out.println("Comparaciones realizadas: " + comparaciones);

        sc.close();
    }
}
