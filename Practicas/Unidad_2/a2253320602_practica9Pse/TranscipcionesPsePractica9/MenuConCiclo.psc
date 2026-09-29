Algoritmo MenuConCiclo
	Definir opcion Como Caracter
	Repetir
		Escribir "Menú:"
		Escribir "a.- Opción 1"
		Escribir "b.- Opción 2"
		Escribir "c.- Opción 3"
		Escribir "x.- Salir"
		Escribir "Elige una opción: "
		Leer opcion
		
		Segun opcion Hacer
			"a", "A":
				Escribir "Has elegido la Opción 1"
			"b", "B":
				Escribir "Has elegido la Opción 2"
			"c", "C":
				Escribir "Has elegido la Opción 3"
			"x", "X":
				Escribir "Adiós, saliendo del menú."
			De Otro Modo:
				Escribir "Opción inválida"
		FinSegun
	Hasta Que opcion = 'x' O opcion = 'X'
FinAlgoritmo