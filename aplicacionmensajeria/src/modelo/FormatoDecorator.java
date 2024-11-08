package modelo;

/** Decorador concreto que ofrece funcionalidad de formato a un mensaje. */
public class FormatoDecorator extends MensajeDecorator {

    /** Constructor */
    public FormatoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public String enviar() {
        return "Formato(" + super.enviar() + ")";
    }
}
