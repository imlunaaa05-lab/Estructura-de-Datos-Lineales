public class Actividad5 {

    public static void imprimirArreglo(int[] arr) {

        for (int elemento : arr) {
            System.out.print(elemento + " ");
        }

        System.out.println();
    }

    public static int encontrarMaximo(int[] arr) {

        int maximo = arr[0];

        for (int elemento : arr) {

            if (elemento > maximo) {
                maximo = elemento;
            }
        }

        return maximo;
    }

    public static int encontrarMinimo(int[] arr) {

        int minimo = arr[0];

        for (int elemento : arr) {

            if (elemento < minimo) {
                minimo = elemento;
            }
        }

        return minimo;
    }

    public static int[] invertirArreglo(int[] arr) {

        int izquierda = 0;
        int derecha = arr.length - 1;

        while (izquierda < derecha) {

            int temp = arr[izquierda];
            arr[izquierda] = arr[derecha];
            arr[derecha] = temp;

            izquierda++;
            derecha--;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] numeros = {5, 8, 2, 9, 1, 7, 4, 6, 3, 10};

        System.out.println("Arreglo original:");
        imprimirArreglo(numeros);

        System.out.println("\nValor máximo: " + encontrarMaximo(numeros));
        System.out.println("Valor mínimo: " + encontrarMinimo(numeros));

        invertirArreglo(numeros);

        System.out.println("\nArreglo invertido:");
        imprimirArreglo(numeros);
    }
}
