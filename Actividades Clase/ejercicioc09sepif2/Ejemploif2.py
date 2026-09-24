import math

# Definir a, b, c Como Entero / Definir x1, x2, d Como Real
print("introduce el coeficiente numero 1 ")
a = int(input())

print("introduce el coeficiente numero 2 ")
b = int(input())

print("introduce el coeficiente numero 3 ")
c = int(input())

# d = ((b*b) - 4*a*c)
d = ((b * b) - 4 * a * c)

if d > 0:
    # x1 = (-b + RAIZ(d)) / (2*a)
    x1 = (-b + math.sqrt(d)) / (2 * a)
    
    # x2 = (-b - RAIZ(d)) / (2*a)
    x2 = (-b - math.sqrt(d)) / (2 * a)
    
    print("la solucion de x1", x1, "y la de X2", x2)
else:
    print(" no existe soluciones reales")