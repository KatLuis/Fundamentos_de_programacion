Algoritmo ciclomientras2
	Definir ciclop, cicloh Como Entero
	Definir nalum, nparcial, cal, scal Como Entero
	Definir palum, sprom, pgeneral Como Real
	
	Escribir "cuantos alumnos vas a evaluar"
	Leer nalum
	Escribir "cuantos parciales vas a evaluar"
	Leer nparcial
	
	ciclop <- 0
	sprom <- 0
	
	Mientras ciclop < nalum Hacer
		ciclop <- ciclop + 1
		cicloh <- 0
		scal <- 0
		
		Mientras cicloh < nparcial Hacer
			cicloh <- cicloh + 1
			Escribir "calificacion del alumno ", ciclop, " parcial ", cicloh
			Leer cal
			scal <- scal + cal
		FinMientras
		
		palum <- scal / nparcial
		Escribir "El promedio del alumno ", ciclop, " fue ", palum
		sprom <- sprom + palum
	FinMientras
	
	pgeneral <- sprom / nalum
	Escribir "El promedio general fue ", pgeneral
FinAlgoritmo