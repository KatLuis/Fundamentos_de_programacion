Algoritmo Ejercicio02
    Escribir "Ingrese la longitud de la losa (metros):"
    Leer largo
    
    Escribir "Ingrese el ancho de la losa (metros):"
    Leer ancho
    
    Escribir "Ingrese el espesor de la losa (metros):"
    Leer espesor
    
    volumenLosa <- largo * ancho * espesor
    
    sacosCemento <- volumenLosa * 7.5
    cantidadArena <- volumenLosa * 0.56
    cantidadGrava <- volumenLosa * 0.84
    
    Escribir "--- MATERIALES PARA LA LOSA ---"
    Escribir "Volumen de concreto: ", volumenLosa, " m3"
    Escribir "Sacos de cemento aproximados: ", sacosCemento
    Escribir "Cantidad de arena: ", cantidadArena, " m3"
    Escribir "Cantidad de grava: ", cantidadGrava, " m3"
FinAlgoritmo