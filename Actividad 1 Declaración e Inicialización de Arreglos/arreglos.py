# Forma A: Lista inicializadora
arr1 = [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

print("Arreglo inicializado con lista:")

for i in range(len(arr1)):
    print(f"arr1[{i}] = {arr1[i]}")

# Forma B: Usando fórmula
arr2 = [0] * 10

for i in range(10):
    arr2[i] = 2 * i + 1

print("\nArreglo inicializado con fórmula:")

for i in range(len(arr2)):
    print(f"arr2[{i}] = {arr2[i]}")
