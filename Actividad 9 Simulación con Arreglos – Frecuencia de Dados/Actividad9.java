import java.util.Random;

public class Actividad9 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] frecuencia = new int[7];

        // Simular 1000 lanzamientos
        for (int i = 0; i < 1000; i++) {

            int dado = random.nextInt(6) + 1;

            frecuencia[dado]++;
        }

        System.out.println("Cara\tFrecuencia\tPorcentaje");

        int mayor = frecuencia[1];
        int menor = frecuencia[1];

        int caraMayor = 1;
        int caraMenor = 1;

        // Mostrar resultados
        for (int i = 1; i <= 6; i++) {

            double porcentaje = ((double) frecuencia[i] / 1000) * 100;

            System.out.printf("%d\t%d\t\t%.2f%%\n",
                    i, frecuencia[i], porcentaje);

            if (frecuencia[i] > mayor) {
                mayor = frecuencia[i];
                caraMayor = i;
            }

            if (frecuencia[i] < menor) {
                menor = frecuencia[i];
                caraMenor = i;
            }
        }

        System.out.println("\nLa cara que más apareció fue: " + caraMayor);
        System.out.println("La cara que menos apareció fue: " + caraMenor);
    }
}
