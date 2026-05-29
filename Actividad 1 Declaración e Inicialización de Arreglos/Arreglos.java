public class Arreglos {

    public static void main(String[] args) {

        // Forma A: Lista inicializadora
        int[] arr1 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.println("Arreglo inicializado con lista:");

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[" + i + "] = " + arr1[i]);
        }

        // Forma B: Usando fórmula
        int[] arr2 = new int[10];

        for (int i = 0; i < 10; i++) {
            arr2[i] = 2 * i + 1;
        }

        System.out.println("\nArreglo inicializado con fórmula:");

        for (int i = 0; i < arr2.length; i++) {
            System.out.println("arr2[" + i + "] = " + arr2[i]);
        }
    }
}
