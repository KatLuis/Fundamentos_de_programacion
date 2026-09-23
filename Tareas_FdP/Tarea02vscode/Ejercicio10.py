import math

print("Ingrese el radio de la esfera: ")
radio = float(input())

area = 4 * math.pi * (radio ** 2)
volumen = (4 * math.pi * (radio ** 3)) / 3.0

print("El área de la esfera es: ", area)
print("El volumen de la esfera es: ", volumen)