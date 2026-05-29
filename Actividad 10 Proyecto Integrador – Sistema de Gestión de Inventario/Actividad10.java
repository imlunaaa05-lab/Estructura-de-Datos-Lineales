import java.util.ArrayList;
import java.util.Scanner;

class Producto {

    int id;
    String nombre;
    double precio;
    int cantidad;

    public Producto(int id, String nombre, double precio, int cantidad) {

        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {

        return "ID: " + id +
               ", Nombre: " + nombre +
               ", Precio: " + precio +
               ", Cantidad: " + cantidad;
    }
}

public class Actividad10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Producto> productos = new ArrayList<>();

        while (true) {

            System.out.println("\n--- MENÚ INVENTARIO ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Actualizar cantidad");
            System.out.println("4. Buscar producto");
            System.out.println("5. Listar productos");
            System.out.println("6. Valor total inventario");
            System.out.println("7. Reportes");
            System.out.println("8. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            // Agregar producto
            if (opcion == 1) {

                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Nombre: ");
                String nombre = sc.nextLine();

                System.out.print("Precio: ");
                double precio = sc.nextDouble();

                System.out.print("Cantidad: ");
                int cantidad = sc.nextInt();

                productos.add(new Producto(id, nombre, precio, cantidad));

                System.out.println("Producto agregado.");
            }

            // Eliminar producto
            else if (opcion == 2) {

                System.out.print("Ingrese ID del producto: ");
                int id = sc.nextInt();

                boolean eliminado = false;

                for (int i = 0; i < productos.size(); i++) {

                    if (productos.get(i).id == id) {

                        productos.remove(i);

                        eliminado = true;

                        break;
                    }
                }

                if (eliminado) {
                    System.out.println("Producto eliminado.");
                } else {
                    System.out.println("Producto no encontrado.");
                }
            }

            // Actualizar cantidad
            else if (opcion == 3) {

                System.out.print("Ingrese ID del producto: ");
                int id = sc.nextInt();

                boolean encontrado = false;

                for (Producto p : productos) {

                    if (p.id == id) {

                        System.out.print("Nueva cantidad: ");
                        p.cantidad = sc.nextInt();

                        encontrado = true;

                        System.out.println("Cantidad actualizada.");
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            }

            // Buscar producto
            else if (opcion == 4) {

                sc.nextLine();

                System.out.print("Ingrese nombre del producto: ");
                String buscar = sc.nextLine();

                boolean encontrado = false;

                for (Producto p : productos) {

                    if (p.nombre.toLowerCase().contains(buscar.toLowerCase())) {

                        System.out.println(p);

                        encontrado = true;
                    }
                }

                if (!encontrado) {
                    System.out.println("Producto no encontrado.");
                }
            }

            // Listar productos ordenados
            else if (opcion == 5) {

                // Bubble Sort por precio
                for (int i = 0; i < productos.size(); i++) {

                    for (int j = 0; j < productos.size() - 1 - i; j++) {

                        if (productos.get(j).precio > productos.get(j + 1).precio) {

                            Producto temp = productos.get(j);

                            productos.set(j, productos.get(j + 1));

                            productos.set(j + 1, temp);
                        }
                    }
                }

                System.out.println("\nProductos ordenados por precio:");

                for (Producto p : productos) {
                    System.out.println(p);
                }
            }

            // Valor total inventario
            else if (opcion == 6) {

                double total = 0;

                for (Producto p : productos) {

                    total += p.precio * p.cantidad;
                }

                System.out.println("Valor total del inventario: " + total);
            }

            // Reportes
            else if (opcion == 7) {

                if (productos.size() > 0) {

                    Producto mayorStock = productos.get(0);
                    Producto masCostoso = productos.get(0);

                    for (Producto p : productos) {

                        if (p.cantidad > mayorStock.cantidad) {
                            mayorStock = p;
                        }

                        if (p.precio > masCostoso.precio) {
                            masCostoso = p;
                        }
                    }

                    System.out.println("\nProducto con mayor stock:");
                    System.out.println(mayorStock);

                    System.out.println("\nProducto más costoso:");
                    System.out.println(masCostoso);

                } else {

                    System.out.println("No hay productos registrados.");
                }
            }

            // Salir
            else if (opcion == 8) {

                System.out.println("Saliendo del sistema...");
                break;
            }

            else {

                System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
