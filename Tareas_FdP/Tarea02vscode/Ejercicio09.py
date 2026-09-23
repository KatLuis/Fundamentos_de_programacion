import math

print("Ingrese el radio del cono: ")
radio = float(input())

print("Ingrese la altura del cono: ")
altura = float(input())

generatriz = math.sqrt((radio ** 2) + (altura ** 2))
areaLateral = math.pi * radio * generatriz
areaTotal = math.pi * radio * (radio + generatriz)
volumen = (math.pi * (radio ** 2) * altura) / 3

print("La generatriz es: ", generatriz)
print("El área lateral es: ", areaLateral)
print("El área total es: ", areaTotal)
print("El volumen es: ", volumen)