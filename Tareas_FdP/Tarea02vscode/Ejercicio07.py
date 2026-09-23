print("Ingresa la cordenada de x1: ")
x1 = float(input())
print("Ingresa la cordenada de y1: ")
y1 = float(input())
print("Ingresa la cordenada de x2: ")
x2 = float(input())
print("Ingresa la cordenada de y2: ")
y2 = float(input())
print("Ingresa la cordenada de x3: ")
x3 = float(input())
print("Ingresa la cordenada de y3: ")
y3 = float(input())

area = (((x1 * y2) + (x2 * y3) + (x3 * y1)) - ((x1 * y3) + (x3 * y2) + (x2 * y1))) / 2.0

print("El Área del Triangulo con respecto a sus Vertices es: ", area)