package modelo;

public class CompresionDecorator extends MensajeDecorator {

    public CompresionDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    public String enviar() { 
        return "Compresion(" + super.enviar() + ")";
    }
}
