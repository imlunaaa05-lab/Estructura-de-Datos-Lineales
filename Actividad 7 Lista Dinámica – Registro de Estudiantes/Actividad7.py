estudiantes = []

while True:

    print("\n--- MENÚ ---")
    print("1. Agregar estudiante")
    print("2. Eliminar estudiante")
    print("3. Buscar estudiante")
    print("4. Listar estudiantes")
    print("5. Salir")

    opcion = input("Seleccione una opción: ")

    if opcion == "1":

        id_est = int(input("ID: "))
        nombre = input("Nombre: ")
        promedio = float(input("Promedio: "))

        repetido = False

        for estudiante in estudiantes:
            if estudiante["id"] == id_est:
                repetido = True

        if repetido:
            print("Error: ID duplicado.")
        else:
            estudiantes.append({
                "id": id_est,
                "nombre": nombre,
                "promedio": promedio
            })

            print("Estudiante agregado correctamente.")

    elif opcion == "2":

        id_est = int(input("Ingrese el ID a eliminar: "))

        eliminado = False

        for estudiante in estudiantes:
            if estudiante["id"] == id_est:
                estudiantes.remove(estudiante)
                eliminado = True
                break

        if eliminado:
            print("Estudiante eliminado.")
        else:
            print("Estudiante no encontrado.")

    elif opcion == "3":

        nombre_buscar = input("Ingrese el nombre a buscar: ")

        encontrado = False

        for estudiante in estudiantes:

            if estudiante["nombre"].lower() == nombre_buscar.lower():

                print("\nInformación del estudiante:")
                print(estudiante)

                encontrado = True

        if not encontrado:
            print("Estudiante no encontrado.")

    elif opcion == "4":

        print("\nLista de estudiantes:")

        for estudiante in estudiantes:
            print(estudiante)

    elif opcion == "5":

        print("Saliendo del programa...")
        break

    else:
        print("Opción inválida.")
