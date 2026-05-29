def imprimirArreglo(arr):

    for elemento in arr:
        print(elemento, end=" ")

    print()


def encontrarMaximo(arr):

    return max(arr)


def encontrarMinimo(arr):

    return min(arr)


def invertirArreglo(arr):

    izquierda = 0
    derecha = len(arr) - 1

    while izquierda < derecha:

        arr[izquierda], arr[derecha] = arr[derecha], arr[izquierda]

        izquierda += 1
        derecha -= 1

    return arr


# Programa principal
numeros = [5, 8, 2, 9, 1, 7, 4, 6, 3, 10]

print("Arreglo original:")
imprimirArreglo(numeros)

print("\nValor máximo:", encontrarMaximo(numeros))
print("Valor mínimo:", encontrarMinimo(numeros))

invertirArreglo(numeros)

print("\nArreglo invertido:")
imprimirArreglo(numeros)
