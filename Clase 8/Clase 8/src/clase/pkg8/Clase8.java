/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase.pkg8;

import java.util.ArrayList;

/**
 *
 * @author Alumno
 */
public class Clase8 {

    public static void main(String[] args) {
        
        // Comprobacion de clase abstracta (comentado para evitar error)
        // Libro testError = new Libro("Libro de Prueba", "Autor Random", 5000); 
        
        // Creacion de instancias con datos completamente distintos
        LibroFisico impreso = new LibroFisico("Cien Anos de Soledad", "Gabriel Garcia Marquez", 22000, 3000, 15);
        LibroDigital ebook = new LibroDigital("Padre Rico Padre Pobre", "Robert Kiyosaki", 12000, "EPUB");
        LibroUsado segundaMano = new LibroUsado("El Alquimista", "Paulo Coelho", 14000, "Excelente");
        LibroDeColeccion edicionRara = new LibroDeColeccion("Don Quijote de la Mancha", "Miguel de Cervantes", 55000, 25);

        // Salida por consola de cada ejemplar
        System.out.println("RESULTADOS DE LOS METODOS");
        
        impreso.mostrarInfo();
        impreso.mostrarDetalle();
        System.out.println("Valor a pagar: $" + impreso.calcularPrecioFinal());
        System.out.println("En venta: " + impreso.disponibleParaVenta() + "\n");
        
        ebook.mostrarInfo();
        ebook.mostrarDetalle();
        System.out.println("Valor a pagar: $" + ebook.calcularPrecioFinal());
        System.out.println("En venta: " + ebook.disponibleParaVenta() + "\n");
        
        segundaMano.mostrarInfo();
        segundaMano.mostrarDetalle();
        System.out.println("Valor a pagar: $" + segundaMano.calcularPrecioFinal());
        System.out.println("En venta: " + segundaMano.disponibleParaVenta() + "\n");
        
        edicionRara.mostrarInfo();
        edicionRara.mostrarDetalle();
        System.out.println("Valor a pagar: $" + edicionRara.calcularPrecioFinal());
        System.out.println("En venta: " + edicionRara.disponibleParaVenta() + "\n");

        // Desafio 1 resuelto con otros nombres de variables
        System.out.println("LISTADO DEL INVENTARIO");
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(impreso);
        listaLibros.add(ebook);
        listaLibros.add(segundaMano);
        listaLibros.add(edicionRara);
        
        System.out.println("NOMBRE DEL LIBRO               | COSTO TOTAL");
        System.out.println("---------------------------------------------");
        
        for (Libro item : listaLibros) { 
            // Formateo a 30 caracteres para prolijidad visual
            System.out.printf("%-30s | $%.2f\n", item.getTitulo(), item.calcularPrecioFinal());
        }
    }
}

// --- PARTE A ---
abstract class Libro { 
    private String titulo; 
    private String autor; 
    private double precioBase; 

    public Libro(String titulo, String autor, double precioBase) {
        this.titulo = titulo;
        this.autor = autor;
        this.precioBase = precioBase;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getPrecioBase() { return precioBase; }

    public void mostrarInfo() {
        System.out.println("Obra: " + titulo + " - Escrito por: " + autor); 
    }

    public abstract double calcularPrecioFinal(); 
    public abstract void mostrarDetalle(); 
    public abstract boolean disponibleParaVenta();
}

// --- PARTE B ---
class LibroFisico extends Libro {
    private double costoEnvio; 
    private int stock; 

    public LibroFisico(String titulo, String autor, double precioBase, double costoEnvio, int stock) {
        super(titulo, autor, precioBase);
        this.costoEnvio = costoEnvio;
        this.stock = stock;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + costoEnvio; 
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Unidades en deposito: " + stock + " (Libro Fisico)"); 
    }

    @Override
    public boolean disponibleParaVenta() {
        return stock > 0; 
    }
}


class LibroDigital extends Libro {
    private String formato; 

    public LibroDigital(String titulo, String autor, double precioBase, String formato) {
        super(titulo, autor, precioBase);
        this.formato = formato;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * 0.80; 
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Tipo de archivo digital: " + formato); 
    }

    @Override
    public boolean disponibleParaVenta() {
        return true; 
    }
}


class LibroUsado extends Libro {
    private String estado; 

    public LibroUsado(String titulo, String autor, double precioBase, String estado) {
        super(titulo, autor, precioBase);
        this.estado = estado;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * 0.50; 
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Condicion del ejemplar: " + estado); 
    }

    @Override
    public boolean disponibleParaVenta() {
        return estado.equalsIgnoreCase("bueno") || estado.equalsIgnoreCase("excelente"); 
    }
}


class LibroDeColeccion extends Libro {
    private double porcentajeRecargo;

    public LibroDeColeccion(String titulo, String autor, double precioBase, double porcentajeRecargo) {
        super(titulo, autor, precioBase);
        this.porcentajeRecargo = porcentajeRecargo;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() + (getPrecioBase() * (porcentajeRecargo / 100)); 
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Version de Coleccionista (Aumento del " + porcentajeRecargo + "%)");
    }

    @Override
    public boolean disponibleParaVenta() {
        return true;
    }
}