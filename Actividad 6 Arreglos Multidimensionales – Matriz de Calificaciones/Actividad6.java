public class Actividad6 {

    public static void main(String[] args) {

        int[][] matriz = {
            {85, 90, 78, 92, 88},
            {70, 65, 80, 75, 72},
            {95, 98, 91, 97, 94},
            {60, 55, 68, 71, 63}
        };

        double[] promedios = new double[4];

        // Promedio por estudiante
        System.out.println("Promedio por estudiante:");

        for (int i = 0; i < matriz.length; i++) {

            int suma = 0;

            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }

            promedios[i] = (double) suma / matriz[i].length;

            System.out.println("Estudiante " + (i + 1) + ": " + promedios[i]);
        }

        // Promedio por materia
        System.out.println("\nPromedio por materia:");

        for (int columna = 0; columna < matriz[0].length; columna++) {

            int suma = 0;

            for (int fila = 0; fila < matriz.length; fila++) {
                suma += matriz[fila][columna];
            }

            double promedio = (double) suma / matriz.length;

            System.out.println("Materia " + (columna + 1) + ": " + promedio);
        }

        // Mejor promedio
        double mejorPromedio = promedios[0];
        int mejorEstudiante = 1;

        for (int i = 1; i < promedios.length; i++) {

            if (promedios[i] > mejorPromedio) {
                mejorPromedio = promedios[i];
                mejorEstudiante = i + 1;
            }
        }

        System.out.println("\nEl estudiante con mejor promedio es el " + mejorEstudiante);
        System.out.println("Promedio: " + mejorPromedio);
    }
}
