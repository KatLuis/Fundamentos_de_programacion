import math

# Construya el algoritmo tal que, dadas las coordenadas de los puntos P1, P2
# y P3 que corresponden a los vértices de un triángulo, calcule su perímetro.

print("Introduce el valor de x1: ")
x1 = float(input())
print("Introduce el valor de y1: ")
y1 = float(input())

print("Introduce el valor de x2: ")
x2 = float(input())
print("Introduce el valor de y2: ")
y2 = float(input())

print("Introduce el valor de x3: ")
x3 = float(input())
print("Introduce el valor de y3: ")
y3 = float(input())

# Fórmulas de distancia y perímetro basadas en el libro
distancia1 = math.sqrt(((x1 - x2) ** 2) + ((y1 - y2) ** 2))
distancia2 = math.sqrt(((x2 - x3) ** 2) + ((y2 - y3) ** 2))
distancia3 = math.sqrt(((x3 - x1) ** 2) + ((y3 - y1) ** 2))

perimetro = distancia1 + distancia2 + distancia3

print("El perímetro del triángulo es: ", perimetro)