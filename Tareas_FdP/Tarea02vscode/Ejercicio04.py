import math

# Construya el algoritmo tal que, dado el radio de una esfera, calcule e imprima el área y su volumen.

print("Ingrese el valor del radio de la esfera: ")
radio = float(input())

# Fórmulas del libro
area = (4 * math.pi) * (radio ** 2)
volumen = ((4 * math.pi) * (radio ** 3)) / 3

print("El resultado del área de la esfera es: ", area)
print("El resultado del Volumen de la esfera es: ", volumen)