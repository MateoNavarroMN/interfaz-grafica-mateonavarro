package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vista.FormAltayModificacion;
import vista.VistaPrincipal;

public class ControladorLibreria implements ActionListener {
    
    private VistaPrincipal vistaPrincipal;
    private FormAltayModificacion panelAlta;
    private JDialog modalAlta;
    private DefaultTableModel modeloTabla;

    public ControladorLibreria(VistaPrincipal vistaPrincipal) {
        this.vistaPrincipal = vistaPrincipal;
        this.panelAlta = new FormAltayModificacion(); // Instanciamos el diseño del formulario
        
        // 1. Configuramos la ventana emergente (Modal) que va a contener el formulario
        this.modalAlta = new JDialog(this.vistaPrincipal, "Alta de Nuevo Libro", true);
        this.modalAlta.setContentPane(this.panelAlta);
        this.modalAlta.pack(); // Ajusta el tamaño automáticamente
        this.modalAlta.setLocationRelativeTo(this.vistaPrincipal); // Lo centra en pantalla
        
        // 2. Extraemos el modelo de la tabla para poder agregarle filas
        this.modeloTabla = (DefaultTableModel) this.vistaPrincipal.jTable1.getModel();
        
        // 3. Le decimos al controlador que escuche los botones clave
        this.vistaPrincipal.btnAgregar.addActionListener(this);
        this.panelAlta.btnGuardar.addActionListener(this);
        this.panelAlta.btnCancelar.addActionListener(this);
    }

    public void iniciar() {
        vistaPrincipal.setTitle("Gestión Librería");
        vistaPrincipal.setLocationRelativeTo(null); 
        vistaPrincipal.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        // Si tocaste "+ Agregar" en la pantalla principal
        if (e.getSource() == vistaPrincipal.btnAgregar) {
            limpiarFormulario(); // Vaciamos los campos por si quedó texto viejo
            modalAlta.setVisible(true); // Abrimos la ventana emergente
        }
        
        // Si tocaste "Cancelar" adentro del formulario
        if (e.getSource() == panelAlta.btnCancelar) {
            modalAlta.setVisible(false); // Cerramos la ventana emergente
        }
        
        // Si tocaste "Guardar" adentro del formulario
        if (e.getSource() == panelAlta.btnGuardar) {
            guardarNuevoLibro();
        }
    }

    // Lógica para atrapar los datos y mandarlos a la tabla
    private void guardarNuevoLibro() {
        try {
            // 1. Leer los campos usando los nombres reales de tus variables
            String nombre = panelAlta.txtNombre.getText();
            String categoria = panelAlta.cmbCategoria.getSelectedItem().toString();
            int cantidad = Integer.parseInt(panelAlta.txtCantidad.getText());
            double precioCosto = Double.parseDouble(panelAlta.txtPrecioCosto.getText());
            double precioVenta = Double.parseDouble(panelAlta.PrecioVenta.getText());
            String proveedor = panelAlta.txtProveedor.getText();

            // Validación: Si el nombre está vacío, frenamos la ejecución
            if (nombre.trim().isEmpty()) {
                JOptionPane.showMessageDialog(modalAlta, "El nombre del libro es obligatorio.", "Atención", JOptionPane.WARNING_MESSAGE);
                return; 
            }

            // 2. Calculamos la disponibilidad según la cantidad
            String disponibilidad = (cantidad > 0) ? "En Stock" : "Sin Stock";

            // 3. Empaquetamos los datos en una fila para la tabla
            Object[] nuevaFila = {
                nombre, 
                categoria, 
                cantidad, 
                disponibilidad, 
                "$ " + precioCosto, 
                "$ " + precioVenta, 
                proveedor, 
                "Editar | Borrar"
            };

            // 4. Agregamos la fila a la tabla visual
            modeloTabla.addRow(nuevaFila);

            // 5. Avisamos que salió bien y cerramos el modal
            JOptionPane.showMessageDialog(modalAlta, "Libro guardado con éxito.");
            modalAlta.setVisible(false);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(modalAlta, "Revisá los datos. Cantidad y Precios deben ser números válidos.", "Error de formato", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método de limpieza
    private void limpiarFormulario() {
        panelAlta.txtNombre.setText("");
        panelAlta.txtCantidad.setText("");
        panelAlta.txtPrecioCosto.setText("");
        panelAlta.PrecioVenta.setText("");
        panelAlta.txtProveedor.setText("");
        panelAlta.cmbCategoria.setSelectedIndex(0);
    }
}