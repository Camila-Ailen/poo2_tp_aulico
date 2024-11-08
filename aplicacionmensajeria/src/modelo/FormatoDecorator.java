package modelo;

/** Decorador concreto que ofrece funcionalidad de formato a un mensaje. */
public class FormatoDecorator extends MensajeDecorator {

    /** Constructor */
    public FormatoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    /**
     * Env a el mensaje con formato.
     * Este m todo sobreescribe el m todo {@code enviar()} de
     * {@link MensajeDecorator}
     * para a adir un mensaje que simula la aplicaci n de formato al mensaje.
     * 
     * @return El mensaje con formato como una cadena de texto.
     */
    public String enviar() {
        return "Formato(" + super.enviar() + ")";
    }
}
