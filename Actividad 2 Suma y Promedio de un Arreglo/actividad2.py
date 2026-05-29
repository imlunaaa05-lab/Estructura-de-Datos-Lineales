calificaciones = []
suma = 0

# Ingreso de datos
for i in range(10):
    nota = int(input(f"Ingrese la calificación {i + 1}: "))
    calificaciones.append(nota)

# Suma total
for nota in calificaciones:
    suma += nota

# Promedio
promedio = suma / len(calificaciones)

# Contar notas mayores al promedio
mayores = 0

for nota in calificaciones:
    if nota > promedio:
        mayores += 1

# Resultados
print("\nResultados:")
print("Suma total:", suma)
print("Promedio:", promedio)
print("Cantidad de notas por encima del promedio:", mayores)
