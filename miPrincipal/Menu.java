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
                //coloque aqui el codigo para capturar las datos deun libro
               

                //invoque al método agregarLibro de la tienda de regalos

               
                System.out.println("Libro agregado exitosamente.");
                
                break;
            case 2:
               //coloque aqui el codigo para capturar las datos deun celular

                //invoque al método agregarCelular de la tienda de regalos
                System.out.println("Celular agregado exitosamente.");
                
                break;
            case 3:
                //coloque aqui el codigo para capturar las datos deun televisor

                //invoque al método agregarTelevision de la tienda de regalos
                
                System.out.println("Televisor agregado exitosamente.");
                break;
            case 4:
                //invoque al método agregarLicuadora de la tienda de regalos
                
                //coloque aqui el codigo para capturar las datos de una licuadora
                
                System.out.println("Licuadora agregada exitosamente.");
                
                break;
            case 5:

                //coloque aqui el codigo para capturar las datos de una tostadora

              
                //invoque al método agregarTostadora de la tienda de regalos
                System.out.println("Tostadora agregada exitosamente.");
               
                break;
            case 6:
                //coloque aqui el codigo para capturar las datos de una calculadora

                //invoque al método agregarCalculadora de la tienda de regalos
               
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
                //coloqie aqui el codigo para eliminar un celular
                break;
            case 3:
                //coloqie aqui el codigo para eliminar un televisor
                break;
            case 4:
               //coloqie aqui el codigo para eliminar una licuadora
                break;
            case 5:
                //coloqie aqui el codigo para eliminar una tostadora
                break;
            case 6:
                //coloqie aqui el codigo para eliminar una calculadora
                break;
            default:    
                System.out.println("Tipo de producto no válido.");
                return;
        }
        
    }

    private void listarProductos() {
        //coloque aqui el codigo para listar los productos
        
    }

    private void venderProducto(Scanner scanner) {
        System.out.print("Ingrese el nombre del producto a vender: ");
        String nombre = scanner.nextLine();
        //coloque aqui el codigo para vender un producto
    }

    private void aplicarDescuento(Scanner scanner) {
        //coloque aqui el codigo para aplicar un descuento a todos los productos
       
    }

    private void actualizarPrecio(Scanner scanner) {
        //coloque aqui el codigo para actualizar el precio de un producto

      
    }

    private void calcularValorTotalProductos() {
        //coloque aqui el codigo para calcular el valor total de los productos
    }
}