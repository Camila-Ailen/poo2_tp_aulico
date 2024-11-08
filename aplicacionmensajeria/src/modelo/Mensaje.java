package modelo;

/**
 * Interface Mensaje representa un mensaje que puede ser enviado.
 */
public interface Mensaje {
    
    /**
     * Envía el mensaje.
     *
     * @return una cadena de texto que representa el resultado del envío del mensaje.
     */
    public String enviar();
}
