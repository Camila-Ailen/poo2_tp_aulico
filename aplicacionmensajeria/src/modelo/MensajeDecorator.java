package modelo;
abstract class MensajeDecorator {
    protected Mensaje mensaje;

    public MensajeDecorator(Mensaje mensaje) {
        this.mensaje = mensaje;
    }

    public String enviar() {
        return mensaje.enviar();
    }
}
