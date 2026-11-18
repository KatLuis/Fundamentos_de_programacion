package Capitulo6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a2253320602_estudiodecaso {

    // Variable global de productos [código, nombre, precio, stock]
    static String[][] productos;

    // ==========================================
    // 1. MÉTODOS DE APOYO (CAPÍTULO 3)
    // ==========================================

    public static String Dialogo(String texto) throws IOException {
        String cadena;
        System.out.print(texto + " : ");
        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
        cadena = lectura.readLine();
        return cadena;
    }

    public static String Leer(String texto) throws IOException {
        String cadena = "";
        cadena = Dialogo(texto);
        if (cadena != null) {
            cadena = cadena.trim();
            if (cadena.isEmpty()) {
                cadena = null;
            }
        } else {
            cadena = null;
        }
        return cadena;
    }

    public static boolean EsNumeroEntero(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean EsNumeroDouble(String dato) {
        if (dato == null || dato.isEmpty()) return false;
        boolean valido = false;
        for (char c : dato.toCharArray()) {
            if (!Character.isDigit(c)) {
                if (c == '.' && !valido) {
                    valido = true;
                } else {
                    return false;
                }
            }
        }
        return valido;
    }

    public static boolean EvaluarNumerico(String dato, int tipo) {
        boolean valido = false;
        switch (tipo) {
            case 1:
                valido = EsNumeroEntero(dato);
                break;
            case 2:
                valido = EsNumeroDouble(dato);
                break;
        }
        return valido;
    }

    public static String MostrarMenu(String[] opciones) {
        String cadena = "";
        int i = 0;
        while (i < opciones.length) {
            cadena += (i + 1) + ". " + opciones[i] + "\n";
            i++;
        }
        return cadena;
    }

    public static String DesplegarMenu(String Titulo1, String[] menu) throws IOException {
        String cadena;
        cadena = Titulo1 + "\n\n";
        cadena = cadena + MostrarMenu(menu);
        cadena = cadena + "\nQue opcion deseas";
        return Dialogo(cadena);
    }

    public static String RellenarEspacios(String dato, int tamano) {
        String cadena = (dato == null) ? "" : dato;
        for (int ciclo = cadena.length(); ciclo < tamano; ciclo++) {
            cadena = cadena + " ";
        }
        return cadena;
    }

    public static String IdTicketSiguiente(String idticket) {
        String idticketnext = "";
        int num = Integer.parseInt(idticket) + 1;
        if (num < 10) {
            idticketnext = "00" + String.valueOf(num).trim();
        } else if ((num > 9) && (num < 100)) {
            idticketnext = "0" + String.valueOf(num).trim();
        } else {
            idticketnext = String.valueOf(num).trim();
        }
        return idticketnext;
    }

    public static int ObtenerUltimaPosicion(String[][] matriz) {
        int ultimaPosicion = -1;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] != null && !matriz[i][0].isEmpty()) {
                ultimaPosicion = i;
            }
        }
        return ultimaPosicion;
    }

    public static String Fecha() {
        Date fecha = new Date();
        SimpleDateFormat formatodia = new SimpleDateFormat("dd-MM-yyyy");
        return formatodia.format(fecha);
    }

    // ==========================================
    // 2. GESTIÓN DE PRODUCTOS (CAPÍTULO 5)
    // ==========================================

    public static String[][] CargarProductos() {
        String[][] producto = {
            { "001", "Arroz 1kg", "35", "10" },
            { "002", "Azúcar 1kg", "25", "10" },
            { "003", "Harina 1kg", "28", "10" },
            { "004", "Aceite 1L", "50", "10" },
            { "005", "Leche 1L", "35", "10" },
            { "006", "Huevos 12 unidades", "45", "10" },
            { "007", "Fideos 500g", "20", "10" },
            { "008", "Sal 1kg", "15", "10" },
            { "009", "Pasta de tomate 400g", "25", "10" },
            { "010", "Atún lata 170g", "35", "10" }
        };
        return producto;
    }

    public static String MostrarProducto(String[] vproducto) {
        String codigo = RellenarEspacios(vproducto[0], 5);
        String producto = RellenarEspacios(vproducto[1], 30);
        String precio = RellenarEspacios(vproducto[2], 10);
        String cantidad = RellenarEspacios(vproducto[3], 10);
        String cadena = codigo.concat(producto + precio + cantidad);
        return cadena;
    }

    public static String MostrarLista(String[][] vproductos) {
        String salida = "";
        for (int ciclo = 0; ciclo < 10; ciclo++) {
            String[] vproducto = {
                vproductos[ciclo][0],
                vproductos[ciclo][1],
                vproductos[ciclo][2],
                vproductos[ciclo][3]
            };
            String cadena = MostrarProducto(vproducto);
            salida = salida.concat(cadena + "\n");
        }
        return salida;
    }

    public static int ExisteProducto(String codigo, String[][] vproductos) {
        int enc = -1;
        int pos = 0;
        int tam = vproductos.length;
        for (int ciclo = 0; ciclo < tam; ciclo++) {
            if (vproductos[ciclo][0].compareTo(codigo.trim()) == 0) {
                enc = pos;
            }
            pos++;
        }
        return enc;
    }

    public static void ModificarProducto(String[][] vproductos) throws IOException {
        String codigo, precio;
        int posicion;
        String info = MostrarLista(vproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
        if (codigo != null) {
            posicion = ExisteProducto(codigo, vproductos);
            if (posicion > -1) {
                String[] vproducto = {
                    vproductos[posicion][0],
                    vproductos[posicion][1],
                    vproductos[posicion][2],
                    vproductos[posicion][3]
                };
                precio = Leer("\nIntroduce el precio de " + MostrarProducto(vproducto) + " ");
                if (precio != null) {
                    if (EvaluarNumerico(precio, 2) || EvaluarNumerico(precio, 1)) {
                        vproductos[posicion][2] = precio;
                        System.out.println("Producto modificado con éxito.");
                    } else {
                        System.out.println("no es un valor numerico");
                    }
                } else {
                    System.out.println(" dato nulo");
                }
            } else {
                System.out.println("no existe el codigo");
            }
        } else {
            System.out.println(" dato nulo");
        }
    }

    // ==========================================
    // 3. GESTIÓN DE INVENTARIO (CAPÍTULO 6)
    // ==========================================

    public static void AgregarStock(String[][] vproductos) throws IOException {
        String codigo, cantidad;
        int posicion;
        String info = MostrarLista(vproductos);
        codigo = Leer(info + "\nIntroduce el codigo del producto a modificar");
        if (codigo != null) {
            posicion = ExisteProducto(codigo, vproductos);
            if (posicion > -1) {
                String[] vproducto = {
                    vproductos[posicion][0],
                    vproductos[posicion][1],
                    vproductos[posicion][3],
                    ""
                };
                cantidad = Leer("\nIntroduce la Cantidad de Stock a Agregar" + MostrarProducto(vproducto) + " ");
                if (cantidad != null) {
                    if (EvaluarNumerico(cantidad, 2) || EvaluarNumerico(cantidad, 1)) {
                        String nuevacantidad = String.valueOf((Integer.valueOf(cantidad) + Integer.valueOf(vproducto[2])));
                        vproductos[posicion][3] = nuevacantidad;
                        System.out.println("Stock actualizado correctamente.");
                    } else {
                        System.out.println("no es un valor numerico");
                    }
                } else {
                    System.out.println(" dato nulo");
                }
            } else {
                System.out.println("no existe el codigo");
            }
        } else {
            System.out.println(" dato nulo");
        }
    }

    // ==========================================
    // 4. MENÚS Y NAVEGACIÓN (CAPÍTULO 6)
    // ==========================================

    public static void MenuProductos(String[][] vproductos) throws IOException {
        String[] datosmenuproductos = { "1.-Modificar ", "2.-Listado ", "3.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Productos", datosmenuproductos);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        ModificarProducto(vproductos);
                        break;
                    case "2":
                        System.out.println(MostrarLista(vproductos));
                        break;
                    case "3":
                        System.out.println("Salida del Sistema ");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcion.compareTo("3") != 0);
    }

    public static void MenuPuntoVenta(String idticket) throws IOException {
        String opcion, membrete;
        Boolean pago = false;
        idticket = IdTicketSiguiente(idticket);
        String fechadia = Fecha();
        membrete = "Fecha del Dia " + fechadia + " Ticket No " + idticket;
        membrete = membrete + "\n-----------------------------------------------------\n";
        String[] datosmenu = { "1.-Agregar ", "2.-Eliminar ", "3.-Listado ", "4.-Pagar ", "5.-Salida " };
        do {
            opcion = DesplegarMenu(membrete + "\n Menu de Punto de Venta", datosmenu);
            if (opcion == null) {
                System.out.println("dato incorrecto introducido");
            } else {
                switch (opcion) {
                    case "1": System.out.println("Agregar Articulo al Ticket "); break;
                    case "2": System.out.println("Eliminar Articulo del Ticket "); break;
                    case "3": System.out.println("Listado de Articulos del Ticket "); break;
                    case "4":
                        System.out.println("Pagar Ticket y salir");
                        opcion = "5";
                        pago = true;
                        break;
                    case "5":
                        System.out.println("Salida del Ventas ");
                        if (!pago) {
                            System.out.println("No pago el ticket ");
                            System.out.println("eliminando ticket" + idticket);
                        }
                        break;
                    default:
                        System.out.println("No existe esta opcion");
                        break;
                }
            }
        } while (opcion.compareTo("5") != 0);
    }

    public static void MenuInventario(String[][] vproductos) throws IOException {
        String[] datosmenuinventario = { "1.-Listado ", "2.-Agregar ", "3.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Opciones de Inventarios", datosmenuinventario);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        System.out.println(MostrarLista(vproductos));
                        break;
                    case "2":
                        AgregarStock(vproductos);
                        break;
                    case "3":
                        System.out.println("Salida del Sistema ");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcion.compareTo("3") != 0);
    }

    public static void MenuPrincipal(String[][] vproductos) throws IOException {
        String[] datosmenuprincipal = { "1.-Productos ", "2.-Punto de Venta ", "3.- Inventario", "4.-Ventas ", "5.-Salida " };
        String opcion = "0";
        do {
            opcion = DesplegarMenu("Menu de Punto de Tienda de Abarrotes la Pequeña", datosmenuprincipal);
            if (opcion == null) {
                System.out.println("opcion incorrecta ");
            } else {
                switch (opcion) {
                    case "1":
                        MenuProductos(vproductos);
                        break;
                    case "2":
                        MenuPuntoVenta("000");
                        break;
                    case "3":
                        MenuInventario(vproductos);
                        break;
                    case "4":
                        System.out.println("Ventas");
                        break;
                    case "5":
                        System.out.println("Salida del Sistema ");
                        break;
                    default:
                        System.out.println("No existe esta opcion ");
                        break;
                }
            }
        } while (opcion.compareTo("5") != 0);
    }

    public static void main(String[] args) throws IOException {
        productos = CargarProductos();
        MenuPrincipal(productos);
    }
}