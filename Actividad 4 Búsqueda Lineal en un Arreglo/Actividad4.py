import random

numeros = []

# Generar arreglo aleatorio
for i in range(15):
    numeros.append(random.randint(1, 100))

print("Arreglo generado:")
print(numeros)

buscar = int(input("\nIngrese el número a buscar: "))

encontrado = False
comparaciones = 0

print("\nResultado de búsqueda:")

for i in range(len(numeros)):

    comparaciones += 1

    if numeros[i] == buscar:
        print(f"Número encontrado en el índice {i}")
        encontrado = True

if not encontrado:
    print("El número no fue encontrado.")

print(f"Comparaciones realizadas: {comparaciones}")
