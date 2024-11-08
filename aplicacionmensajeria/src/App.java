import modelo.*;

public class App {
    public static void main(String[] args) {
        Mensaje mensaje = new MensajeBase("Mensaje de prueba");
        mensaje = new EncriptadoDecorator(mensaje);
        mensaje = new FormatoDecorator(mensaje);
        mensaje = new CompresionDecorator(mensaje);

        System.out.println(mensaje.enviar());
    }
}
