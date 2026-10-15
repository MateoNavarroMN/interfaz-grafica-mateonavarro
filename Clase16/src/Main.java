import controlador.ControladorLibreria;
import vista.VistaPrincipal;

public class Main {
    
    public static void main(String[] args) {
        
        // 1. Instanciamos la Vista (Pantalla principal)
        VistaPrincipal vista = new VistaPrincipal();
        
        // 2. Instanciamos el Controlador y le inyectamos la Vista
        ControladorLibreria controlador = new ControladorLibreria(vista);
        
        // 3. Le decimos al controlador que inicie la aplicación
        controlador.iniciar();
    }
}