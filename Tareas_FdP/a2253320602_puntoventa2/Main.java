package a2253320602_puntoventa2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        menuPrincipal();
    }

    // Menú Principal (Ilustración 3 del Capítulo 4)
    public static void menuPrincipal() throws IOException {
        int opcion = -1;

        do {
            System.out.println("=================================");
            System.out.println("TIENDA DE ABARROTES LA PEQUEÑA");
            System.out.println("=================================");
            System.out.println("1. Categorías");
            System.out.println("2. Productos");
            System.out.println("3. Punto de Venta");
            System.out.println("4. Inventario");
            System.out.println("5. Ventas y Reportes");
            System.out.println("6. Gestión de Impuestos");
            System.out.println("7. Devoluciones");
            System.out.println("8. Proveedores");
            System.out.println("9. Salida");
            System.out.print("Selecciona una opción: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    menuCategorias();
                    break;
                case 2:
                    menuProductos();
                    break;
                case 3:
                    menuPuntoVenta();
                    break;
                case 4:
                    menuInventario();
                    break;
                case 5:
                    menuReportes();
                    break;
                case 6:
                    menuImpuestos();
                    break;
                case 7:
                    menuDevoluciones();
                    break;
                case 8:
                    menuProveedores();
                    break;
                case 9:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    pausar();
                    break;
            }
        } while (opcion != 9);
    }

    // 1.1 Opción Categorías (Ilustración 4)
    public static void menuCategorias() throws IOException {
        int opcion = -1;

        do {
            System.out.println("===============================");
            System.out.println("GESTIÓN DE CATEGORÍAS");
            System.out.println("===============================");
            System.out.println("1. Alta de Categorías");
            System.out.println("2. Modificación de Categorías");
            System.out.println("3. Listado de Categorías");
            System.out.println("4. Salida");
            System.out.println("===============================");
            System.out.print("¿Qué opción deseas? [1-4]: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    System.out.println("[Opción 1: Alta de Categorías - Solo navegación de menú]");
                    pausar();
                    break;
                case 2:
                    System.out.println("[Opción 2: Modificación de Categorías - Solo navegación de menú]");
                    pausar();
                    break;
                case 3:
                    System.out.println("[Opción 3: Listado de Categorías - Solo navegación de menú]");
                    pausar();
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    pausar();
                    break;
            }
        } while (opcion != 4);
    }

    // 1.2 Gestión de Productos (Ilustración 8)
    public static void menuProductos() throws IOException {
        int opcion = -1;

        do {
            System.out.println("===============================");
            System.out.println("GESTIÓN DE PRODUCTOS");
            System.out.println("===============================");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Modificar Producto");
            System.out.println("3. Listado de Productos");
            System.out.println("4. Salida");
            System.out.println("===============================");
            System.out.print("¿Qué opción deseas? [1-4]: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    System.out.println("[Opción 1: Agregar Producto - Solo navegación de menú]");
                    pausar();
                    break;
                case 2:
                    System.out.println("[Opción 2: Modificar Producto - Solo navegación de menú]");
                    pausar();
                    break;
                case 3:
                    System.out.println("[Opción 3: Listado de Productos - Solo navegación de menú]");
                    pausar();
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    pausar();
                    break;
            }
        } while (opcion != 4);
    }

    // 1.5 Punto de Venta (Ilustración 25)
    public static void menuPuntoVenta() throws IOException {
        int opcion = -1;

        do {
            System.out.println("==========================================");
            System.out.println("PUNTO DE VENTA");
            System.out.println("==========================================");
            System.out.println("Opciones del Ticket:");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Pagar Ticket");
            System.out.println("4. Cancelar Venta (Salir)");
            System.out.println("==========================================");
            System.out.print("¿Qué opción deseas? [1-4]: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    System.out.println("[Opción 1: Agregar Producto al Ticket - Solo navegación de menú]");
                    pausar();
                    break;
                case 2:
                    System.out.println("[Opción 2: Eliminar Producto del Ticket - Solo navegación de menú]");
                    pausar();
                    break;
                case 3:
                    System.out.println("[Opción 3: Pagar Ticket - Solo navegación de menú]");
                    pausar();
                    break;
                case 4:
                    System.out.println("Cancelando venta y regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    pausar();
                    break;
            }
        } while (opcion != 4);
    }

    // 1.4 Gestión de Inventario (Ilustración 21)
    public static void menuInventario() throws IOException {
        int opcion = -1;

        do {
            System.out.println("==========================================");
            System.out.println("GESTIÓN DE INVENTARIOS");
            System.out.println("==========================================");
            System.out.println("1. Agregar Stock (Entrada de Almacén)");
            System.out.println("2. Ajustar/Eliminar Stock (Salida/Baja)");
            System.out.println("3. Listado de Inventario");
            System.out.println("4. Salida");
            System.out.println("==========================================");
            System.out.print("¿Qué opción deseas? [1-4]: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                    System.out.println("[Opción 1: Agregar Stock - Solo navegación de menú]");
                    pausar();
                    break;
                case 2:
                    System.out.println("[Opción 2: Ajustar/Eliminar Stock - Solo navegación de menú]");
                    pausar();
                    break;
                case 3:
                    System.out.println("[Opción 3: Listado de Inventario - Solo navegación de menú]");
                    pausar();
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    pausar();
                    break;
            }
        } while (opcion != 4);
    }

    // 1.8 Reportes (Ilustración 48)
    public static void menuReportes() throws IOException {
        int opcion = -1;

        do {
            System.out.println("==========================================");
            System.out.println("MÓDULO DE REPORTES");
            System.out.println("==========================================");
            System.out.println("1. Reporte de Ventas (Corte de Caja)");
            System.out.println("2. Reporte de Productos Más Vendidos");
            System.out.println("3. Reporte de Valor de Inventario");
            System.out.println("4. Reporte de Impuestos Cobrados");
            System.out.println("5. Reporte de Devoluciones");
            System.out.println("6. Salida");
            System.out.println("==========================================");
            System.out.print("¿Qué opción deseas? [1-6]: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("[Opción " + opcion + " de Reportes - Solo navegación de menú]");
                    pausar();
                    break;
                case 6:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    pausar();
                    break;
            }
        } while (opcion != 6);
    }

    // 1.6 Gestión de Impuestos (Ilustración 36)
    public static void menuImpuestos() throws IOException {
        int opcion = -1;

        do {
            System.out.println("==========================================");
            System.out.println("GESTIÓN DE IMPUESTOS");
            System.out.println("==========================================");
            System.out.println("1. Alta de Impuesto");
            System.out.println("2. Modificación de Impuesto");
            System.out.println("3. Listado de Impuestos");
            System.out.println("4. Asignar Impuestos a Categorías");
            System.out.println("5. Salida");
            System.out.println("==========================================");
            System.out.print("¿Qué opción deseas? [1-5]: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("[Opción " + opcion + " de Impuestos - Solo navegación de menú]");
                    pausar();
                    break;
                case 5:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    pausar();
                    break;
            }
        } while (opcion != 5);
    }

    // 1.7 Devoluciones (Ilustración 43)
    public static void menuDevoluciones() throws IOException {
        int opcion = -1;

        do {
            System.out.println("==========================================");
            System.out.println("GESTIÓN DE DEVOLUCIONES");
            System.out.println("==========================================");
            System.out.println("1. Realizar Devolución (Cancelar Ticket Pagado)");
            System.out.println("2. Listado de Devoluciones");
            System.out.println("3. Salida");
            System.out.println("==========================================");
            System.out.print("¿Qué opción deseas? [1-3]: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                case 2:
                    System.out.println("[Opción " + opcion + " de Devoluciones - Solo navegación de menú]");
                    pausar();
                    break;
                case 3:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    pausar();
                    break;
            }
        } while (opcion != 3);
    }

    // 1.3 Gestión de Proveedores (Ilustración 17)
    public static void menuProveedores() throws IOException {
        int opcion = -1;

        do {
            System.out.println("==========================================");
            System.out.println("GESTIÓN DE PROVEEDORES");
            System.out.println("==========================================");
            System.out.println("1. Alta de Proveedor");
            System.out.println("2. Modificación de Proveedor");
            System.out.println("3. Listado de Proveedores");
            System.out.println("4. Salida");
            System.out.println("==========================================");
            System.out.print("¿Qué opción deseas? [1-4]: ");

            opcion = leerEntero();

            switch (opcion) {
                case 1:
                case 2:
                case 3:
                    System.out.println("[Opción " + opcion + " de Proveedores - Solo navegación de menú]");
                    pausar();
                    break;
                case 4:
                    System.out.println("Regresando al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    pausar();
                    break;
            }
        } while (opcion != 4);
    }

    private static int leerEntero() throws IOException {
        try {
            String entrada = lector.readLine();
            if (entrada == null) {
                return -1;
            }
            return Integer.parseInt(entrada.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static void pausar() throws IOException {
        System.out.print("Presione una tecla para continuar...");
        lector.readLine();
    }
}