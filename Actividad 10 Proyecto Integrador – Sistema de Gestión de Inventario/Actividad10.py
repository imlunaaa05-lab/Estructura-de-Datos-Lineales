productos = []

while True:

    print("\n--- MENÚ INVENTARIO ---")
    print("1. Agregar producto")
    print("2. Eliminar producto")
    print("3. Actualizar cantidad")
    print("4. Buscar producto")
    print("5. Listar productos")
    print("6. Valor total inventario")
    print("7. Reportes")
    print("8. Salir")

    opcion = input("Seleccione una opción: ")

    # Agregar producto
    if opcion == "1":

        id_producto = int(input("ID: "))
        nombre = input("Nombre: ")
        precio = float(input("Precio: "))
        cantidad = int(input("Cantidad: "))

        productos.append({
            "id": id_producto,
            "nombre": nombre,
            "precio": precio,
            "cantidad": cantidad
        })

        print("Producto agregado.")

    # Eliminar producto
    elif opcion == "2":

        id_producto = int(input("Ingrese ID del producto: "))

        eliminado = False

        for producto in productos:

            if producto["id"] == id_producto:
                productos.remove(producto)
                eliminado = True
                break

        if eliminado:
            print("Producto eliminado.")
        else:
            print("Producto no encontrado.")

    # Actualizar cantidad
    elif opcion == "3":

        id_producto = int(input("Ingrese ID del producto: "))

        encontrado = False

        for producto in productos:

            if producto["id"] == id_producto:

                nueva_cantidad = int(input("Nueva cantidad: "))

                producto["cantidad"] = nueva_cantidad

                encontrado = True

                print("Cantidad actualizada.")

        if not encontrado:
            print("Producto no encontrado.")

    # Buscar producto
    elif opcion == "4":

        nombre_buscar = input("Ingrese nombre del producto: ")

        encontrado = False

        for producto in productos:

            if nombre_buscar.lower() in producto["nombre"].lower():

                print(producto)

                encontrado = True

        if not encontrado:
            print("Producto no encontrado.")

    # Listar productos ordenados
    elif opcion == "5":

        # Bubble Sort por precio
        for i in range(len(productos)):

            for j in range(len(productos) - 1 - i):

                if productos[j]["precio"] > productos[j + 1]["precio"]:

                    productos[j], productos[j + 1] = productos[j + 1], productos[j]

        print("\nProductos ordenados por precio:")

        for producto in productos:
            print(producto)

    # Valor total inventario
    elif opcion == "6":

        total = 0

        for producto in productos:

            total += producto["precio"] * producto["cantidad"]

        print("Valor total del inventario:", total)

    # Reportes
    elif opcion == "7":

        if len(productos) > 0:

            mayor_stock = productos[0]
            mas_costoso = productos[0]

            for producto in productos:

                if producto["cantidad"] > mayor_stock["cantidad"]:
                    mayor_stock = producto

                if producto["precio"] > mas_costoso["precio"]:
                    mas_costoso = producto

            print("\nProducto con mayor stock:")
            print(mayor_stock)

            print("\nProducto más costoso:")
            print(mas_costoso)

        else:
            print("No hay productos registrados.")

    # Salir
    elif opcion == "8":

        print("Saliendo del sistema...")
        break

    else:
        print("Opción inválida.")
