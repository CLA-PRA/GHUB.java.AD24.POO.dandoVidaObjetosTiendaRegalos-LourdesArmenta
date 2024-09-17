package miPrincipal;


public class TiendaDeRegalos{
    private String nombre;
    private String direccion;
    private Inventario inventario;
    

    public TiendaDeRegalos(int capacidadInventario) {
        //como la relacion entre la clase TiendaDeRegalos y la clase Inventario es de 1 a 1
        //es decir, una tienda de regalos solo tiene un inventario
        //y un inventario solo pertenece a una tienda de regalos
        //y ademas es una relación de composición,
        //se inicializa el inventario en el constructor de la clase TiendaDeRegalos
        //como la realización de este ejercicio es de manera individual,
        //se inicializa el inventario con una capacidad que se recibe como parámetro
        
        
        
    }

    public TiendaDeRegalos(String nombre, String direccion, int capacidadInventario) {
       //coloca aquí el código para inicializar los atributos de la clase
    }

    public void presentarse() {
        System.out.println("Bienvenido a " + nombre + " ubicada en " + direccion);
    }

    public void cumplirAños() {
        System.out.println(nombre + " está celebrando su aniversario!");
    }

    public void agregarLibro(Libro libro) {
        //invoca el metodo agregarLibro de la clase Inventario
        System.out.println("Libro agregado: " + libro);

    }

    public void eliminarLibro(String nombreLibro) {
        Libro libro = buscarLibro(nombreLibro);
        //invoca el metodo eliminarLibro de la clase Inventario
        //imprime un mensaje indicando si el libro fue eliminado o no
        //si el libro no fue encontrado, imprime un mensaje indicando que no se encontró el libro
        
    }

    public void agregarCelular(String nombre, double precio, String marca, String modelo) {
        Celular celular = new Celular(nombre, precio, marca, modelo);
        
        //invoca el metodo agregarCelular de la clase Inventario
        System.out.println("Celular agregado: " + celular.toString());
    }

    public void eliminarCelular(String nombreCelular) {
        //coloca el codigo para buscar el celular
        //invoca el metodo eliminarCelular de la clase Inventario
        //imprime un mensaje indicando si el celular fue eliminado o no
        //si el celular no fue encontrado, imprime un mensaje indicando que no se encontró el celular

    }

    public void agregarTelevision(String nombre, double precio, String tamanio, String resolucion) {
        Television television = new Television(nombre, precio, tamanio, resolucion);
       
        //invoca el metodo agregarTelevision de la clase Inventario
        System.out.println("Televisor agregado: " + television.toString());
    }

    
    //coloca los métodos faltantes, según el diagrama de clases
    //recuerda que debes invocar los métodos de la clase Inventario
    //y mostrar mensajes en consola para indicar si se realizó la operación o no
    //y si no se encontró el producto, mostrar un mensaje indicando que no se encontró el producto


    public Libro buscarLibro(String nombreLibro) {
        Libro[] libros = inventario.getLibros();
        for (int i = 0; i < libros.length; i++) {
           if (libros[i] != null && libros[i].getNombre().equals(nombreLibro)) {
            return libros[i];
           }
        }
        return null; // Devuelve null si no se encuentra el producto
    }

    
    //coloca los métodos faltantes buscar, según el diagrama de clases

    public void venderLibro(String nombreLibro) {

        Libro libro = buscarLibro(nombreLibro);
        //invoca el metodo eliminarLibro de la clase Inventario
        //eso hará que el libro sea eliminado del inventario
        
    }

    public void actualizarPrecioLibro(String nombreLibro, double nuevoPrecio) {
        Libro libro = buscarLibro(nombreLibro);
        //utiliza el setter de precio para actualizar el precio del libro
    }

    //coloca los métodos faltantes, según el diagrama de clases para actualizar el precio de un producto
    public void aplicarDescuentoATodosLosProductos(double porcentaje) {
        //invoca el metodo aplicarDescuentoATodos de la clase Inventario
        //imprime un mensaje indicando el porcentaje de descuento aplicado

        System.out.println("Descuento aplicado a los productos permitidos: " + porcentaje + "%");
    }

    public double calcularValorTotalProductos() {
        //invoca el metodo calcularValorTotalProductos de la clase Inventario
        //retorna el valor total de los productos
    }
    
    public void agregarLibro(String nombre, double precio, String titulo,String autor, int paginas) {
        Libro libro = new Libro(nombre, precio, titulo, autor, paginas);
        
        if(inventario.agregarLibro(libro))
            System.out.println("Libro agregado: " + libro);
        else
            System.out.println("No se pudo agregar el libro: " + libro);
    }

    public void agregarCelular(Celular celular) {
        //invoca el metodo agregarCelular de la clase Inventario
        System.out.println("Celular agregado: " + celular.toString());
    }

    public void agregarTelevision(Television television) {
       //invoca el metodo agregarTelevision de la clase Inventario
        System.out.println("Television agregado: " + television.toString());

    }

    public void agregarLicuadora(Licuadora licuadora) {
       //a
        System.out.println("Licuadora agregada: " + licuadora.toString());

    }

    public void agregarTostadora(Tostadora tostadora) {
        inventario.agregarTostadora(tostadora);
        System.out.println("Tostadora agregada: " + tostadora.toString());
    }

    public void agregarCalculadora(Calculadora calculadora) {
        inventario.agregarCalculadora(calculadora);
        System.out.println("Calculadora agregada: " + calculadora.toString());
    }


  

} 