package modelo;

public class FormatoDecorator extends MensajeDecorator {

    public FormatoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    public String enviar() {
        return "Formato(" + super.enviar() + ")";
    }
}
