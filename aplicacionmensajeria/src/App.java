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
        Mensaje mensaje1 = new MensajeBase("Mensaje 1");
        mensaje1 = new EncriptadoDecorator(mensaje1);
        mensaje1 = new FormatoDecorator(mensaje1);
        mensaje1 = new CompresionDecorator(mensaje1);

        System.out.println(mensaje1.enviar());

        Mensaje mensaje2 = new MensajeBase("Mensaje 2");
        mensaje2 = new FormatoDecorator(mensaje2);
        mensaje2 = new EncriptadoDecorator(mensaje2);

        System.out.println(mensaje2.enviar());

        Mensaje mensaje3 = new MensajeBase("Mensaje 3");
        mensaje3 = new CompresionDecorator(mensaje3);

        System.out.println(mensaje3.enviar());

    }
}
