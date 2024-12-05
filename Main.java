
package Main;

public class Main {
    public static void main(String[] args) {
        // Ejecutar el main del paquete Alerta (mostrar el logo)
        Alerta.Logo.main(args);

        // Pausa para esperar a que el usuario cierre la ventana del logo
        try {
            Thread.sleep(5000); // Pausa de 2 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ejecutar el main del paquete com.mycompany.vidasana
        com.mycompany.vidasana.VidaSana.main(args);
    }
}
