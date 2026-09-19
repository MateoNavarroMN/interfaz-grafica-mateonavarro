package clase7;

import java.util.ArrayList; // Importacion de la libreria para usar listas

/**
 *
 * @author Alumno
 */
public class Clase7 {

    public static void main(String[] args) {
        // 1. Aca iniciamos la lista que va a contener los libros
        ArrayList<Libro> catalogo = new ArrayList<>();
        
        // 2. Agregamos 4 libros diferentes al catalogo
        catalogo.add(new Libro(1001, "Fahrenheit 451", "Ray Bradbury", 11000.0, 12));
        catalogo.add(new Libro(1002, "Dune", "Frank Herbert", 18000.0, 4));
        catalogo.add(new Libro(1003, "El Hobbit", "J.R.R. Tolkien", 14500.0, 7));
        catalogo.add(new Libro(1004, "Fundacion", "Isaac Asimov", 13000.0, 6));

        System.out.println("REPORTE INICIAL DEL CATALOGO");
        imprimirTablaStock(catalogo);

        // 3. Simulamos algunas operaciones de venta
        System.out.println(">> Se registra la venta de 2 unidades de 'Fahrenheit 451'...");
        catalogo.get(0).vender(2); 
        
        System.out.println(">> Se registra la venta de 1 unidad de 'Fundacion'...");
        catalogo.get(3).vender(1);
        
        System.out.println(">> Se intenta vender 10 unidades de 'Dune' (para verificar el mensaje de error)...");
        catalogo.get(1).vender(10); 
        
        System.out.println();

        // 4. Mostramos nuevamente la tabla para verificar que el stock bajo
        System.out.println("REPORTE POSTERIOR A LAS VENTAS");
        imprimirTablaStock(catalogo);
    }
    
    // Funcion adicional para mostrar el catalogo en consola
    public static void imprimirTablaStock(ArrayList<Libro> lista) {
        System.out.println("===============================");
        System.out.println("tITULO               | STOCK");
        System.out.println("===============================");
        
        int totalEjemplares = 0;
        
        // Bucle que recorre cada libro dentro del arreglo
        for (Libro libro : lista) {
            System.out.println("- " + libro.getTitulo() + " | " + libro.getStock());
            totalEjemplares += libro.getStock(); // Se suma la cantidad al contador
        }
        
        System.out.println("=========================================");
        System.out.println("CANTIDAD TOTAL DE EJEMPLARES: " + totalEjemplares);
        System.out.println("=========================================\n");
    }
}