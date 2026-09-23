Algoritmo Ejercicio1_Sencillo
    Escribir "Ingresa la longitud del muro:"
    Leer longMuro
    Escribir "Ingresa la altura del muro:"
    Leer altMuro
    
    Escribir "Ingresa la longitud del ladrillo:"
    Leer longLadrillo
    Escribir "Ingresa la altura del ladrillo:"
    Leer altLadrillo
    Escribir "Ingresa el espesor de la junta horizontal:"
    Leer juntaH
    Escribir "Ingresa el espesor de la junta vertical:"
    Leer juntaV
    
    Escribir "Ingresa el número de castillos:"
    Leer numCastillos
    Escribir "Ingresa la longitud de cada castillo:"
    Leer longCastillo
    
    areaMuro <- longMuro * altMuro
    areaCastillos <- numCastillos * (longCastillo * altMuro)
    areaEfectiva <- areaMuro - areaCastillos
    
    areaLadrilloTotal <- (longLadrillo + juntaV) * (altLadrillo + juntaH)
    totalLadrillos <- areaEfectiva / areaLadrilloTotal
    
    Escribir "--- RESULTADO ---"
    Escribir "Se necesitan aproximadamente: ", totalLadrillos, " ladrillos"
FinAlgoritmo