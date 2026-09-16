Algoritmo ejercicio01
	Definir num, unidades, decenas Como Entero
	Definir cadena Como Cadena
	cadena <- ''
	Escribir 'Introduzca un número (0 a 99): '
	Leer num
	unidades <- num MOD 10
	decenas <- trunc(num/10)
	Según decenas Hacer
		0:
			cadena <- ''
		1:
			cadena <- 'diez'
		2:
			cadena <- 'veinte'
		3:
			cadena <- 'treinta'
		4:
			cadena <- 'cuarenta'
		5:
			cadena <- 'cincuenta'
		6:
			cadena <- 'sesenta'
		7:
			cadena <- 'setenta'
		8:
			cadena <- 'ochenta'
		9:
			cadena <- 'noventa'
	FinSegún
	Según unidades Hacer
		0:
			Si decenas==0 Entonces
				cadena <- 'cero'
			FinSi
		1:
			Si decenas==1 Entonces
				cadena <- 'once'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y uno'
				SiNo
					cadena <- 'uno'
				FinSi
			FinSi
		2:
			Si decenas==1 Entonces
				cadena <- 'doce'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y dos'
				SiNo
					cadena <- 'dos'
				FinSi
			FinSi
		3:
			Si decenas==1 Entonces
				cadena <- 'trece'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y tres'
				SiNo
					cadena <- 'tres'
				FinSi
			FinSi
		4:
			Si decenas==1 Entonces
				cadena <- 'catorce'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y cuatro'
				SiNo
					cadena <- 'cuarenta'
				FinSi // corregido a cuatro
			FinSi
		5:
			Si decenas==1 Entonces
				cadena <- 'quince'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y cinco'
				SiNo
					cadena <- 'cinco'
				FinSi
			FinSi
		6:
			Si decenas==1 Entonces
				cadena <- 'dieciséis'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y seis'
				SiNo
					cadena <- 'seis'
				FinSi
			FinSi
		7:
			Si decenas==1 Entonces
				cadena <- 'diecisiete'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y siete'
				SiNo
					cadena <- 'siete'
				FinSi
			FinSi
		8:
			Si decenas==1 Entonces
				cadena <- 'dieciocho'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y ocho'
				SiNo
					cadena <- 'ocho'
				FinSi
			FinSi
		9:
			Si decenas==1 Entonces
				cadena <- 'diecinueve'
			SiNo
				Si decenas>1 Entonces
					cadena <- cadena+' y nueve'
				SiNo
					cadena <- 'nueve'
				FinSi
			FinSi
	FinSegún
	Escribir cadena
FinAlgoritmo
