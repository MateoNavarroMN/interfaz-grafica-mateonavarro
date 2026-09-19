/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9;

import java.util.ArrayList;

public class Clase9 {

    public static void main(String[] args) {
        
        // 1. Creamos la lista (catálogo) para guardar nuestros libros
        ArrayList<Libro> catalogo = new ArrayList<>();

        // 2. Instanciamos distintos tipos de libros
        LibroFisico l1 = new LibroFisico("Cien Decadas de Soledad", "G. Garcia Marquez", 15000, 2500, 10);
        LibroDigital l2 = new LibroDigital("Clean Code", "Robert C. Martin", 12000, "PDF");
        LibroUsado l3 = new LibroUsado("Rayuela", "Julio Cortazar", 8000, "Muy bueno");

        // 3. Forzamos que un libro esté agotado para probar nuestra Excepción
        l2.setEstado(EstadoLibro.AGOTADO);

        // 4. Agregamos los libros a la lista
        catalogo.add(l1);
        catalogo.add(l2);
        catalogo.add(l3);


        // 5. Recorremos el catálogo
        for (Libro libro : catalogo) {
            libro.mostrarInfo();
            libro.mostrarDetalle();

            // Verificamos si el libro implementa la interfaz Promocionable
            if (libro instanceof Promocionable) {
                Promocionable promo = (Promocionable) libro;
                System.out.println("Aplica Promo " + promo.getMotivoPromocion());
                System.out.println("Descuento extra:" + promo.calcularDescuento());
            }

            System.out.println("Precio final: $" + libro.calcularPrecioFinal());

            // 6. Intentamos vender el libro (Bloque Try-Catch obligatorio)
            try {
                libro.vender();
            } catch (LibroNoDisponible e) {
                System.out.println("EXCEPCION CAPTURADA: " + e.getMessage());
            } 
            
        }
    }
}