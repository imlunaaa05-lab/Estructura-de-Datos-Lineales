matriz = [
    [85, 90, 78, 92, 88],
    [70, 65, 80, 75, 72],
    [95, 98, 91, 97, 94],
    [60, 55, 68, 71, 63]
]

promedios = []

# Promedio por estudiante
print("Promedio por estudiante:")

for i in range(len(matriz)):

    promedio = sum(matriz[i]) / len(matriz[i])
    promedios.append(promedio)

    print(f"Estudiante {i + 1}: {promedio}")

# Promedio por materia
print("\nPromedio por materia:")

for columna in range(len(matriz[0])):

    suma = 0

    for fila in range(len(matriz)):
        suma += matriz[fila][columna]

    promedio = suma / len(matriz)

    print(f"Materia {columna + 1}: {promedio}")

# Estudiante con mejor promedio
mejor_promedio = max(promedios)
mejor_estudiante = promedios.index(mejor_promedio) + 1

print(f"\nEl estudiante con mejor promedio es el {mejor_estudiante}")
print(f"Promedio: {mejor_promedio}")
