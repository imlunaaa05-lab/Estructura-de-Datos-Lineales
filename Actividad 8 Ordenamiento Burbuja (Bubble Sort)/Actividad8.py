import random

numeros = []

# Generar números aleatorios
for i in range(12):
    numeros.append(random.randint(1, 200))

print("Arreglo original:")
print(numeros)

intercambios = 0

# Bubble Sort
for i in range(len(numeros)):

    for j in range(len(numeros) - 1 - i):

        if numeros[j] > numeros[j + 1]:

            # Intercambio
            numeros[j], numeros[j + 1] = numeros[j + 1], numeros[j]

            intercambios += 1

print("\nArreglo ordenado:")
print(numeros)

print("\nCantidad de intercambios:", intercambios)
