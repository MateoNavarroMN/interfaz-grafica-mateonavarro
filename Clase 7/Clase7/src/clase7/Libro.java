package clase7;

/**
 *
 * @author Alumno
 */
public class Libro {
    // Variables de instancia con acceso privado
    private int codigo;
    private String titulo;
    private String autor;
    private double precio;
    private int stock;

    // Metodo constructor para inicializar el objeto
    public Libro(int codigo, String titulo, String autor, double precio, int stock) {
        this.codigo = codigo; 
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.stock = stock;
    }
    
    // Metodos getter y setter
    public int getCodigo () {
        return codigo;
    }
    
    public void setCodigo (int codigo) {
        this.codigo = codigo;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }   
       
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("Aviso: el precio introducido es negativo.");
        }
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("Aviso: la cantidad de stock no puede ser menor a cero.");
        }
    }

    // Funcion para registrar ventas validando la cantidad solicitada
    public void vender(int cantidad) {
        if (cantidad > 0 && this.stock >= cantidad) {
            this.stock = this.stock - cantidad;
            System.out.println("Se procesaron " + cantidad + " unidades correctamente.");
            System.out.println("El stock actual de '" + titulo + "' es: " + this.stock);
        } else {
            System.out.println("Problema al vender: no hay " + cantidad + " unidades de '" + titulo + "' en deposito.");
        }
    }
    
    // Funcion para mostrar por pantalla la informacion del libro
    public void mostrarInfo() {
        System.out.println(">>> Informacion detallada del libro <<<");
        System.out.println("ID interno: " + codigo);
        System.out.println("Nombre del libro: " + titulo);
        System.out.println("Escrito por: " + autor);
        System.out.println("Valor al publico: $" + precio);
        System.out.println("Copias en deposito: " + stock);
        System.out.println("---------------------------------------");
    }
}