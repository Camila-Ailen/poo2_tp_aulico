package modelo;

/** Decorador concreto que ofrece funcionalidad de compresión a un mensaje. */
public class CompresionDecorator extends MensajeDecorator {

    /** Constructor. */
    public CompresionDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    /**
     * Envía el mensaje comprimido.
     * Este método sobrescribe el método {@code enviar()} de
     * {@link MensajeDecorator}
     * para añadir un mensaje que simula la compresión.
     *
     * @return El mensaje comprimido como una cadena de texto.
     */
    public String enviar() {
        return "Compresion(" + super.enviar() + ")";
    }
}
