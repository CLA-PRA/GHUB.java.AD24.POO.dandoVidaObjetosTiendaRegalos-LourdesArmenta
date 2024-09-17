package miPrincipal;

public class Inventario{

    //declare un arreglo de objetos de tipo Libro,
    //declare un arreglo de objetos de tipo Celular,
    //declare un arreglo de objetos de tipo Television,
    //declare un arreglo de objetos de tipo Licuadora,
    //declare un arreglo de objetos de tipo Tostadora,
    //declare un arreglo de objetos de tipo Calculadora
    //declare un contadorTotal de tipo entero contar el número de articulos que se ingresan al inventario
    //declare un contador por cada tipo de producto
    
    
    
   

    public Inventario() {

        //como la relacion del inventario con los productos es de 1 a muchos
        //es decir, un inventario puede tener muchos productos,
        // pero un producto solo pertenece a un inventario
        //y ademas es una relación de composición,
        //se inicializan los arreglos de productos en el constructor de la clase Inventario



        //como la realización de este ejercicio es de manera individual, 
        //se inicializa el tamaño de los arreglos en 10
       
        

        //se inicializan los contadores en 0
        
        
    }

    public Inventario(int capacidad) {
       
        //se inicializan los arreglos de productos con la capacidad que se recibe como parámetro
        //se inicializan los contadores en 0
        
    }

    public int getContadorTotal() {
        return contadorTotal;
    }

    public Libro[] getLibros() {
        return libros;
    }
   
    //desarrolla los métodos de los gets faltantes

    public boolean agregarLibro(Libro libro) {
        //desarrolla el método agregarLibro
    }

    public boolean eliminarLibro(String nombre) {
        
        //desarrolla el método eliminarLibro
    }

    public boolean eliminarLibro(Libro libro) {
        //desarrolla el método eliminarLibro
        
        
    }

    public Libro buscarLibro(String nombre) {

        //desarrolla el método buscarLibro
        
        
    }
    //desarrolla los métodos de los gets faltantes
    

   

    public double calcularValorTotalProductos() {
        double valorTotal = 0.0;

        //calcula el valor total de los productos

        return valorTotal;
       
    }

    public void aplicarDescuentoATodos(double porcentaje) {
        //aplica el descuento a todos los productos
        
    }

    public void mostrarInventario() {
        //muestra el inventario de libros
        //muestra el inventario de celulares
        //muestra el inventario de televisiones
        //muestra el inventario de licuadoras
        //muestra el inventario de tostadoras
        //muestra el inventario de calculadoras
        //utiliza el método toString de cada clase para mostrar la información de los productos
        

    }


}