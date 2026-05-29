import java.util.Scanner;

public class Actividad2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] calificaciones = new int[10];
        int suma = 0;

        // Ingreso de datos
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = sc.nextInt();
        }

        // Suma total
        for (int nota : calificaciones) {
            suma += nota;
        }

        // Promedio
        double promedio = (double) suma / calificaciones.length;

        // Contar mayores al promedio
        int mayores = 0;

        for (int nota : calificaciones) {
            if (nota > promedio) {
                mayores++;
            }
        }

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de notas por encima del promedio: " + mayores);

        sc.close();
    }
}
