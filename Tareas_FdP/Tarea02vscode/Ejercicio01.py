# Ejercicio 1: Ganancia por Inversión

print("Ingrese el monto a invertir: ")
capital = float(input())

print("Ingrese el número total de días del mes a considerar: ")
dias = int(input())

interes = 0.02
ganancia = capital * dias * interes

print("La ganancia por cobrar después del mes es de:", ganancia)