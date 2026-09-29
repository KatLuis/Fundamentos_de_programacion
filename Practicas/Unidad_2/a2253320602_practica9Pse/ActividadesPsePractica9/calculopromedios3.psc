Algoritmo calculopromedios3
	Definir ciclop, cicloh, nalum, nparcial, cal, scal Como Entero
	Definir palum, sprom, pgeneral Como Real
	Definir salida Como Caracter
	
	salida <- ""
	Escribir "Cuantos alumnos vas a evaluar"
	Leer nalum
	Escribir "Cuantos parciales vas a evaluar"
	Leer nparcial
	
	sprom <- 0
	
	Para ciclop <- 1 Hasta nalum Con Paso 1 Hacer
		scal <- 0
		cicloh <- 0
		
		Mientras cicloh < nparcial Hacer
			cicloh <- cicloh + 1
			Escribir "Calificacion del alumno ", ciclop, " parcial ", cicloh
			Leer cal
			scal <- scal + cal
		FinMientras
		
		palum <- scal / nparcial
		salida <- salida + "El promedio del alumno " + ConvertirATexto(ciclop) + " fue " + ConvertirATexto(palum) + "\n"
		sprom <- sprom + palum
	FinPara
	
	pgeneral <- sprom / nalum
	salida <- salida + "El promedio general fue " + ConvertirATexto(pgeneral)
	Escribir salida
FinAlgoritmo