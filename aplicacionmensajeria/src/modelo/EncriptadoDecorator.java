class EncriptadoDecorator extends MensajeDecorator {
    public EncriptadoDecorator(Mensaje mensaje) {
        super(mensaje);
    }

    @Override
    public String enviar() {
        return "Encriptado(" + super.enviar() + ")";
    }
}
