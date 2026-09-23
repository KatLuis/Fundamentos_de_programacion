print("Ingrese el largo: ")
largo = float(input())

print("Ingrese el ancho: ")
ancho = float(input())

print("Ingrese la altura: ")
altura = float(input())

area = 2 * ((largo * ancho) + (largo * altura) + (ancho * altura))
volumen = largo * ancho * altura

print("El área total es: ", area)
print("El volumen es: ", volumen)