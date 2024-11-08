package modelo;
/**
 * Clase abstracta que actúa como base para los decoradores de mensajes.
 * Extiende la funcionalidad de un objeto {@link Mensaje}.
 */
abstract class MensajeDecorator {

    /**
     * Objeto de tipo {@link Mensaje} que será modificado.
     */
    protected Mensaje mensaje;

    /**
     * Constructor de la clase {@code MensajeDecorator}.
     *
     * @param mensaje El mensaje que será modificado.
     */
    public MensajeDecorator(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * Envía el mensaje modificado.
     * Este método puede ser sobreescrito para añadir funcionalidades.
     *
     * @return El mensaje modificado como una cadena de texto.
     */
    public String enviar() {
        return mensaje.enviar();
    }
}
