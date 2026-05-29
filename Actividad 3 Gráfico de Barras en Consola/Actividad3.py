import math

valores = [20, 50, 80, 40, 60, 10, 70, 30]

# Encontrar valor máximo
maximo = max(valores)

print("GRÁFICO DE BARRAS\n")

for i in range(len(valores)):

    # Calcular cantidad de asteriscos
    asteriscos = round((valores[i] / maximo) * 20)

    # Crear barra
    barra = "*" * asteriscos

    print(f"[{i}] {valores[i]} -> {barra}")
