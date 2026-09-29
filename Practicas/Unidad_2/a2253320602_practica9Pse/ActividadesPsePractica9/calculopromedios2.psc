Algoritmo calculopromedios2
	Definir ciclop, cicloh, nalum, nparcial, cal, scal Como Entero
	Definir palum, sprom, pgeneral Como Real
	Definir salida Como Caracter
	
	salida <- ""
	Escribir "Cuantos alumnos vas a evaluar"
	Leer nalum
	Escribir "Cuantos parciales vas a evaluar"
	Leer nparcial
	
	ciclop <- 0
	sprom <- 0
	
	Repetir
		ciclop <- ciclop + 1
		cicloh <- 0
		scal <- 0
		
		Repetir
			cicloh <- cicloh + 1
			Escribir "Calificacion del alumno ", ciclop, " parcial ", cicloh
			Leer cal
			scal <- scal + cal
		Hasta Que cicloh = nparcial
		
		palum <- scal / nparcial
		salida <- salida + "El promedio del alumno " + ConvertirATexto(ciclop) + " fue " + ConvertirATexto(palum) + "\n"
		sprom <- sprom + palum
		
	Hasta Que ciclop = nalum
	
	pgeneral <- sprom / nalum
	salida <- salida + "El promedio general fue " + ConvertirATexto(pgeneral)
	Escribir salida
FinAlgoritmo