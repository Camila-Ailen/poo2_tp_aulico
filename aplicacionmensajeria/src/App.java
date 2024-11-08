import modelo.*;

public class App {

        /**
         * Punto de entrada principal del programa.
         *
         * Crea un mensaje básico y lo decora con funcionalidades de encriptado, formateo y compresión.
         * Luego, se envía el mensaje y se imprime el resultado.
         *
         * @param args no utiliza argumentos.
         */
    public static void main(String[] args) {
        Mensaje mensaje = new MensajeBase("Mensaje de prueba");
        mensaje = new EncriptadoDecorator(mensaje);
        mensaje = new FormatoDecorator(mensaje);
        mensaje = new CompresionDecorator(mensaje);

        System.out.println(mensaje.enviar());
    }
}
