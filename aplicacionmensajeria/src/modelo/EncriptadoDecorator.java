package modelo;


/**
 * Decorador concreto que añade funcionalidad de encriptado a un mensaje.
 * Extiende la clase {@link MensajeDecorator} para modificar el comportamiento del método {@code enviar()}.
 */


class EncriptadoDecorator extends MensajeDecorator {

    /**
     * Constructor de la clase {@code EncriptadoDecorator}.
     *
     * @param mensaje El mensaje que será modificado con funcionalidad de encriptacion.
     */
    public EncriptadoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    /**
     * Envía el mensaje encriptado.
     * Este método sobrescribe el método {@code enviar()} de {@link MensajeDecorator} 
     * para añadir un mensaje que simula la encriptación.
     *
     * @return El mensaje encriptado como una cadena de texto.
     */
    @Override
    public String enviar() {
        return "Encriptado(" + super.enviar() + ")";
    }
}
