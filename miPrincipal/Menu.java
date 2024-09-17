package miPrincipal;


import java.util.Scanner;

public class Menu {
   
    private TiendaDeRegalos tiendaDeRegalos;

    public Menu() {
       
        this.tiendaDeRegalos = new TiendaDeRegalos("Tienda de Lulu", "Culiacan, Sin.", 100);// Capacidad del inventario
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    tiendaDeRegalos.presentarse();
                    break;
                case 2:
                    agregarProducto(scanner);
                    break;
                case 3:
                    eliminarProducto(scanner);
                    break;
                case 4:
                    listarProductos();
                    break;
                case 5:
                    venderProducto(scanner);
                    break;
                case 6:
                    actualizarPrecio(scanner);
                    break;
                case 7:
                    aplicarDescuento(scanner);
                    break;
                case 8:
                    calcularValorTotalProductos();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        scanner.close();
    }

    private void mostrarMenu() {
        System.out.println("\n--- Menú de Tienda de Regalos ---");
        System.out.println("1. Presentarse");
        System.out.println("2. Agregar Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Listar Productos");
        System.out.println("5. Vender Producto");
        System.out.println("6. Actualizar Precio");
        System.out.println("7. Aplicar Descuento");
        System.out.println("8. Calcular valor total de productos");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private void agregarProducto(Scanner scanner) {
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Libro");
        System.out.println("2. Celular");
        System.out.println("3. Televisor");
        System.out.println("4. Licuadora");
        System.out.println("5. Tostadora");
        System.out.println("6. Calculadora");
        System.out.println("0. Cancelar");
        System.out.print("Ingrese el número correspondiente al tipo de producto: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea

        switch (tipoProducto) {
            case 1:
                System.out.print("Ingrese el titulo del libro: ");
                String titulo= scanner.nextLine();
                System.out.print("Ingrese el autor del libro: ");
                String autor = scanner.nextLine();
                System.out.print("Ingrese el número de páginas del libro: ");
                int paginas = scanner.nextInt();

                tiendaDeRegalos.agregarLibro(nombre, precio, titulo,autor, paginas);
                System.out.println("Libro agregado exitosamente.");
                
                break;
            case 2:
                System.out.print("Ingrese la marca del celular: ");
                String marca = scanner.nextLine();
                System.out.print("Ingrese el modelo del celular: ");
                String modelo = scanner.nextLine();
                tiendaDeRegalos.agregarCelular(nombre, precio, marca, modelo);
                System.out.println("Celular agregado exitosamente.");
                
                break;
            case 3:
                System.out.print("Ingrese el tamaño del televisor (en pulgadas): ");
                String tamanio = scanner.nextLine();
                //scanner.nextLine(); // Consumir la nueva línea
                System.out.print("Ingrese la resolución del televisor: ");
                String resolucion = scanner.nextLine();
                tiendaDeRegalos.agregarTelevision(nombre, precio, tamanio, resolucion);
                System.out.println("Televisor agregado exitosamente.");
                break;
            case 4:
                System.out.print("Ingrese la potencia de la licuadora (en vatios): ");
                int potencia = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                System.out.print("Ingrese la capacidad de la licuadora (en litros): ");
                int capacidad = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                tiendaDeRegalos.agregarLicuadora(nombre, precio, potencia, capacidad);
                System.out.println("Licuadora agregada exitosamente.");
                
                break;
            case 5:
                System.out.print("Ingrese el número de ranuras de la tostadora: ");
                int ranuras = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea
                String material = scanner.nextLine();
                tiendaDeRegalos.agregarTostadora(nombre, precio, ranuras, material);
                System.out.println("Tostadora agregada exitosamente.");
               
                break;
            case 6:
                System.out.print("Ingrese el tipo de calculadora (científica, básica, etc.): ");
                String tipo = scanner.nextLine();
                tiendaDeRegalos.agregarCalculadora(nombre, precio, tipo);
                System.out.println("Calculadora agregada exitosamente.");
               
                break;
            default:
                System.out.println("Tipo de producto no válido.");
                return;
    }

   
    }

    private void eliminarProducto(Scanner scanner) {
        System.out.println("Seleccione el tipo de producto:");
        System.out.println("1. Libro");
        System.out.println("2. Celular");
        System.out.println("3. Televisor");
        System.out.println("4. Licuadora");
        System.out.println("5. Tostadora");
        System.out.println("6. Calculadora");
        System.out.println("0. Cancelar");
        System.out.print("Ingrese el número correspondiente al tipo de producto: ");
        int tipoProducto = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = scanner.nextLine();
        
        switch (tipoProducto) {

            case 1:
                tiendaDeRegalos.eliminarLibro(nombre);
                break;
            case 2:
                tiendaDeRegalos.eliminarCelular(nombre);
                break;
            case 3:
                tiendaDeRegalos.eliminarTelevision(nombre);
                break;
            case 4:
                tiendaDeRegalos.eliminarLicuadora(nombre);
                break;
            case 5:
                tiendaDeRegalos.eliminarTostadora(nombre);
                break;
            case 6:
                tiendaDeRegalos.eliminarCalculadora(nombre);
                break;
            default:    
                System.out.println("Tipo de producto no válido.");
                return;
        }
        
    }

    private void listarProductos() {
        tiendaDeRegalos.listarProductos();
    }

    private void venderProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a vender: ");
        String nombre = scanner.nextLine();
        tiendaDeRegalos.venderLibro(nombre);
    }

    private void aplicarDescuento(Scanner scanner) {
        System.out.print("Ingrese el porcentaje de descuento: ");
        double porcentaje = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        tiendaDeRegalos.aplicarDescuentoATodosLosProductos(porcentaje);
    }

    private void actualizarPrecio(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nuevo precio del producto: ");
        double nuevoPrecio = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        tiendaDeRegalos.actualizarPrecioLibro(nombre, nuevoPrecio);

      
    }

    private void calcularValorTotalProductos() {
        double valorTotal = tiendaDeRegalos.calcularValorTotalProductos();
        System.out.println("Valor total de los productos en inventario: $" + valorTotal);
    }
}