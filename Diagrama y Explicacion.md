## Modelo: Decorator  
**Explicacion:** Para desarrollar un sistema de mensajes personalizados para una aplicación de mensajería utilizaremos el patron decorator, esto debido a que nos permite agregar de forma flexible y dinamica distintas caracteristicas sin modificar el codigo.

## Diagrama 

```mermaid
classDiagram
    class Mensaje {
        <<interface>>
        +String enviar()
    }

    class MensajeBase {
        -String contenido
        +MensajeBase(String contenido)
        +String enviar()
    }

    MensajeBase --> Mensaje

    class MensajeDecorator {
        #Mensaje mensaje
        +MensajeDecorator(Mensaje mensaje)
        +String enviar()
    }

    MensajeDecorator --> Mensaje

    class EncriptadoDecorator {
        +EncriptadoDecorator(Mensaje mensaje)
        +String enviar()
    }

    class CompresionDecorator {
        +CompresionDecorator(Mensaje mensaje)
        +String enviar()
    }

    class FormatoDecorator {
        +FormatoDecorator(Mensaje mensaje)
        +String enviar()
    }

    EncriptadoDecorator --> MensajeDecorator
    CompresionDecorator --> MensajeDecorator
    FormatoDecorator --> MensajeDecorator
    
    ```