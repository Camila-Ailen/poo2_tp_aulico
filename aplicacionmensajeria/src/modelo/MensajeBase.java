package modelo;

/**
 * La clase MensajeBase implementa la interfaz Mensaje y representa un mensaje básico que puede ser enviado.
 */
public class MensajeBase implements Mensaje {
    private String contenido;

    /**
     * Constructor de la clase MensajeBase.
     *
     * @param contenido el contenido del mensaje.
     */
    public MensajeBase(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Envía el mensaje.
     *
     * @return una cadena de texto que representa el contenido del mensaje.
     */
    @Override
    public String enviar() {
        return this.contenido;
    }
    
}
