package modelo;

/** Decorador concreto que ofrece funcionalidad de formato a un mensaje. */
public class FormatoDecorator extends MensajeDecorator {

    /** Constructor */
    public FormatoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    /**
     * Env a el mensaje formateado.
     * Este m todo sobrescribe el m todo {@code enviar()} de {@link MensajeDecorator} 
     * para a adir un mensaje que simula el formato.
     * 
     * @return El mensaje formateado como una cadena de texto.
     */
    @Override
    public String enviar() {
        return "Formato(" + super.enviar() + ")";
    }
}
