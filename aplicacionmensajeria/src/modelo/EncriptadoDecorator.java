package modelo;

<<<<<<< HEAD
/**
 * Decorador concreto que añade funcionalidad de encriptado a un mensaje.
 * Extiende la clase {@link MensajeDecorator} para modificar el comportamiento del método {@code enviar()}.
 */
=======
>>>>>>> 9bd3a79de7d35f7224b401362676508458c50f4e
class EncriptadoDecorator extends MensajeDecorator {

    /**
     * Constructor de la clase {@code EncriptadoDecorator}.
     *
     * @param mensaje El mensaje que será modificado con funcionalidad de encriptacion.
     */
    public EncriptadoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

<<<<<<< HEAD
    /**
     * Envía el mensaje encriptado.
     * Este método sobrescribe el método {@code enviar()} de {@link MensajeDecorator} 
     * para añadir un mensaje que simula la encriptación.
     *
     * @return El mensaje encriptado como una cadena de texto.
     */
=======

>>>>>>> 9bd3a79de7d35f7224b401362676508458c50f4e
    @Override
    public String enviar() {
        return "Encriptado(" + super.enviar() + ")";
    }
}
