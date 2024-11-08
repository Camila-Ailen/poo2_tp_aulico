package modelo;

public class MensajeBase implements Mensaje {
    private String contenido;

    public MensajeBase(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public String enviar() {
        return this.contenido;
    }
    
}
