package Capitulo5;

import java.io.IOException;

public class Capitulo5MenuPrincipal {

    // Actualización del procedimiento MenuPrincipal recibiendo la matriz de productos[cite: 181]
    public static void MenuPrincipal(String[][] vproductos) throws IOException 
    { 
        String[] datosmenuprincipal = { "1.-Productos ", "2.-Punto de Venta ", "3.-Inventario", "5.-Salida " }; 
        String opcion = "0"; 
        do
        {
            opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña", datosmenuprincipal); 
            if (opcion == null) 
            {
                System.out.println("opcion incorrecta ");
            }
            else 
            {
                switch (opcion) 
                { 
                    case "1": 
                        MenuProductos(vproductos); 
                        break; 
                    case "2": 
                        MenuPuntoVenta("000"); 
                        break; 
                    case "3": 
                        MenuInventario(vproductos); 
                        break; 
                    case "5": 
                        System.out.println("Salida del Sistema "); 
                        break; 
                    default: 
                        System.out.println("No existe esta opcion "); 
                        break; 
                } 
            }
        } 
        while (opcion.compareTo("5") != 0); 
    }
}