public class Actividad3 {

    public static void main(String[] args) {

        int[] valores = {20, 50, 80, 40, 60, 10, 70, 30};

        // Encontrar valor máximo
        int maximo = valores[0];

        for (int valor : valores) {
            if (valor > maximo) {
                maximo = valor;
            }
        }

        System.out.println("GRÁFICO DE BARRAS\n");

        for (int i = 0; i < valores.length; i++) {

            // Calcular cantidad de asteriscos
            int asteriscos = (int) Math.round(((double) valores[i] / maximo) * 20);

            // Imprimir índice y valor
            System.out.print("[" + i + "] " + valores[i] + " -> ");

            // Imprimir barra
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
