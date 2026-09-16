Algoritmo ejercicio02
	Definir num Como Entero
	Definir cadena Como Cadena
	Escribir ' Menu de Opciones '
	Escribir ' 1.-Opcion 1 '
	Escribir ' 2.-Opcion 2 '
	Escribir ' 3.-Opcion 3 '
	Escribir ' 4.-Opcion 4 '
	Escribir ' Elige una opcion [1..4]-->'
	Leer num
	cadena <- ''
	Según num Hacer
		1:
			cadena <- 'Elegiste la opcion 1'
		2:
			cadena <- 'Elegiste la opcion 2'
		3:
			cadena <- 'Elegiste la opcion 3'
		4:
			cadena <- 'Elegiste la opcion 4'
		De Otro Modo:
			cadena <- 'Elegiste una opcion que no existe'
	FinSegún
	Escribir ''
	Escribir cadena
FinAlgoritmo
