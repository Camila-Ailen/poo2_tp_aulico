package modelo;

public class FormatoDecorator extends MensajeDecorator {

    public FormatoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public String enviar() {
        return "Formato(" + super.enviar() + ")";
    }
}
