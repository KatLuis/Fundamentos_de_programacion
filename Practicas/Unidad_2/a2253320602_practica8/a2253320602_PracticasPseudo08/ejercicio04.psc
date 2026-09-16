Algoritmo ejercicio04
    Definir opcion Como Entero
    Definir operando1, operando2, resultado Como Real
    Definir cadena Como Caracter
    
    Escribir "Introduce el valor del operando 1 "
    Leer operando1
    Escribir "Introduce el valor del operando 2 "
    Leer operando2
    
    Escribir " Menu de opciones de Operaciones Basicas "
    Escribir " 1.- Suma "
    Escribir " 2.- Multiplicacion "
    Escribir " 3.- Division "
    Escribir " Elige una Opcion [1..2..3]"
    
    Leer opcion
    cadena <- ""
    
    Segun opcion Hacer
        1: 
            resultado <- operando1 + operando2
            cadena <- "El resultado de la suma es " + ConvertirATexto(resultado)
        2: 
            resultado <- operando1 * operando2
            cadena <- "El resultado de la multiplicacion es: " + ConvertirATexto(resultado)
        3: 
            Si operando2 <> 0 Entonces
                resultado <- operando1 / operando2
                cadena <- "El resultado de la division es " + ConvertirATexto(resultado)
            Sino
                cadena <- "Error: Division entre cero"
            FinSi
        De Otro Modo:
            cadena <- "Opcion no reconocida"
    FinSegun
    
    Escribir cadena
FinAlgoritmo