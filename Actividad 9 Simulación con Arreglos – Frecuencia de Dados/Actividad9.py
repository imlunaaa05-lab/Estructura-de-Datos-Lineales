import random

# Arreglo de frecuencias
frecuencia = [0] * 7

# Simular 1000 lanzamientos
for i in range(1000):

    dado = random.randint(1, 6)

    frecuencia[dado] += 1

print("Cara\tFrecuencia\tPorcentaje")

mayor = frecuencia[1]
menor = frecuencia[1]

cara_mayor = 1
cara_menor = 1

# Mostrar resultados
for i in range(1, 7):

    porcentaje = (frecuencia[i] / 1000) * 100

    print(f"{i}\t{frecuencia[i]}\t\t{porcentaje:.2f}%")

    if frecuencia[i] > mayor:
        mayor = frecuencia[i]
        cara_mayor = i

    if frecuencia[i] < menor:
        menor = frecuencia[i]
        cara_menor = i

print(f"\nLa cara que más apareció fue: {cara_mayor}")
print(f"La cara que menos apareció fue: {cara_menor}")
