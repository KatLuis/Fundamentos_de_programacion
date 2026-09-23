import math

radio = 0.0
generatriz = 0.0
altura = 0.0
aBase = 0.0
alado = 0.0
aTotal = 0.0
volumen = 0.0

radio = float(input("Ingrese el radio del cono: "))
generatriz = float(input("Ingrese la generatriz del cono: "))
altura = float(input("Ingrese la altura del cono: "))

aBase = math.pi * (radio * radio)
alado = math.pi * radio * generatriz
aTotal = aBase + alado
volumen = (1 / 3) * aBase * altura

print("El área de la base es:", aBase)
print("El área lateral es:", alado)
print("El área total es:", aTotal)
print("El volumen es:", volumen)