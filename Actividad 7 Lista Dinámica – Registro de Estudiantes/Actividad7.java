import java.util.ArrayList;
import java.util.Scanner;

class Estudiante {

    int id;
    String nombre;
    double promedio;

    public Estudiante(int id, String nombre, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Nombre: " + nombre +
               ", Promedio: " + promedio;
    }
}

public class Actividad7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        while (true) {

            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Eliminar estudiante");
            System.out.println("3. Buscar estudiante");
            System.out.println("4. Listar estudiantes");
            System.out.println("5. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                boolean repetido = false;

                for (Estudiante e : estudiantes) {
                    if (e.id == id) {
                        repetido = true;
                    }
                }

                if (repetido) {
                    System.out.println("Error: ID duplicado.");
                } else {

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Promedio: ");
                    double promedio = sc.nextDouble();

                    estudiantes.add(new Estudiante(id, nombre, promedio));

                    System.out.println("Estudiante agregado correctamente.");
                }

            } else if (opcion == 2) {

                System.out.print("Ingrese el ID a eliminar: ");
                int id = sc.nextInt();

                boolean eliminado = false;

                for (int i = 0; i < estudiantes.size(); i++) {

                    if (estudiantes.get(i).id == id) {
                        estudiantes.remove(i);
                        eliminado = true;
                        break;
                    }
                }

                if (eliminado) {
                    System.out.println("Estudiante eliminado.");
                } else {
                    System.out.println("Estudiante no encontrado.");
                }

            } else if (opcion == 3) {

                System.out.print("Ingrese el nombre a buscar: ");
                String nombreBuscar = sc.nextLine();

                boolean encontrado = false;

                for (Estudiante e : estudiantes) {

                    if (e.nombre.equalsIgnoreCase(nombreBuscar)) {

                        System.out.println("\nInformación del estudiante:");
                        System.out.println(e);

                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Estudiante no encontrado.");
                }

            } else if (opcion == 4) {

                System.out.println("\nLista de estudiantes:");

                for (Estudiante e : estudiantes) {
                    System.out.println(e);
                }

            } else if (opcion == 5) {

                System.out.println("Saliendo del programa...");
                break;

            } else {

                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
