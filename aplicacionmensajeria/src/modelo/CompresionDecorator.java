package modelo;

public class CompresionDecorator extends MensajeDecorator {

    public CompresionDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public String enviar() { 
        return "Compresion(" + super.enviar() + ")";
    }
}
