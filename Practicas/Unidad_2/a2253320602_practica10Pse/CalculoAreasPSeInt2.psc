Funcion MostrarMenu
	Escribir ''
	Escribir 'Menú:'
	Escribir 'c.- Calcular área del círculo'
	Escribir 't.- Calcular área del triángulo'
	Escribir 's.- Salir'
	Escribir Sin Saltar 'Elige una opción: '
FinFuncion

Funcion num <- PedirDato(mensaje)
	Definir num Como Real
	Escribir Sin Saltar mensaje
	Leer num
FinFuncion

Funcion area <- CalcularAreaCirculo(radio)
	Definir area Como Real
	area <- PI*radio*radio
FinFuncion

Funcion area <- CalcularAreaTriangulo(base,altura)
	Definir area Como Real
	area <- (base*altura)/2
FinFuncion

Algoritmo CalculoAreasPSeInt2
	Definir opcion Como Caracter
	Definir radio,base,altura Como Real
	Repetir
		MostrarMenu
		Leer opcion
		Segun opcion Hacer
			'C','c':
				radio <- PedirDato('Ingresa el radio del círculo: ')
				Escribir 'El área del círculo es: ',CalcularAreaCirculo(radio)
			'T','t':
				base <- PedirDato('Ingresa la base del triángulo: ')
				altura <- PedirDato('Ingresa la altura del triángulo: ')
				Escribir 'El área del triángulo es: ',CalcularAreaTriangulo(base,altura)
			'S','s':
				Escribir 'Saliendo del programa.'
			De Otro Modo:
				Escribir 'Opción inválida.'
		FinSegun
	Hasta Que opcion='S' O opcion='-s'
FinAlgoritmo