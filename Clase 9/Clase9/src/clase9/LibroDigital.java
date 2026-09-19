/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

public class LibroDigital extends Libro implements Promocionable {
    private String formato;

    public LibroDigital(String titulo, String autor, double precioBase, String formato) {
        super(titulo, autor, precioBase);
        this.formato = formato;
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecioBase() * 0.80; // 20% de descuento por ser digital
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Tipo: Digital  Formato: " + formato);
    }

    @Override
    public double calcularDescuento() {
        return getPrecioBase() * 0.20;
    }

    @Override
    public String getMotivoPromocion() {
        return "Descuento por formato digital";
    }
}
