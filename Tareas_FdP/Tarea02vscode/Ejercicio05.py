# Construya el algoritmo tal que, dado como dato el lado de un hexaedro o cubo,
# calcule el área de la base, el área lateral, el área total y el volumen.

print("Ingrese el valor del lado del Hexaedro o Cubo: ")
lado = float(input())

# Fórmulas del libro
aBase = lado * lado
alado = 4 * (lado * lado)
aTotal = 6 * (lado * lado)
volumen = lado * lado * lado

print("El área de la base es: ", aBase)
print("El área lateral de la base es: ", alado)
print("El área total de la base es: ", aTotal)
print("El volumen es: ", volumen)