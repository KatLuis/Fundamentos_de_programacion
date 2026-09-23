import math

print("Ingrese el radio del cilindro: ")
radio = float(input())

print("Ingrese la altura del cilindro: ")
altura = float(input())

area = 2 * math.pi * radio * (radio + altura)
volumen = math.pi * (radio ** 2) * altura

print("El área del cilindro es: ", area)
print("El volumen del cilindro es: ", volumen)