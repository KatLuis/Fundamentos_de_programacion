X = float(input("Introduce la longitud de la losa (X): "))
Y = float(input("Introduce el ancho de la losa (Y): "))
N = float(input("Introduce el espesor de la losa (N): "))

volumen = X * Y * N
cemento = volumen * 7
arena = volumen * 0.52
grava = volumen * 0.82
agua = volumen * 200

print("Volumen total de la losa:", volumen, "m3")
print("Cemento necesario (bultos):", cemento)
print("Arena necesaria (m3):", arena)
print("Grava necesaria (m3):", grava)
print("Agua necesaria (litros):", agua)