X = float(input("Introduce la longitud total del muro (X): "))
Y = float(input("Introduce la altura del muro (Y): "))
N = float(input("Introduce el numero de castillos (N): "))
P = float(input("Introduce la longitud de cada castillo (P): "))
Lladrillo = float(input("Introduce la longitud del ladrillo: "))
Aladrillo = float(input("Introduce la altura del ladrillo: "))
Ajuntav = float(input("Introduce el espesor de la junta vertical: "))
Anjuntah = float(input("Introduce el espesor de la junta horizontal: "))

longitud_efectiva = X - (N * P)
area_muro = longitud_efectiva * Y
area_ladrillo = (Aladrillo + Anjuntah) * (Lladrillo + Ajuntav)
NL = area_muro / area_ladrillo

print("El numero de ladrillos necesarios es:", NL)