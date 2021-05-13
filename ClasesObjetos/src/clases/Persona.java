package clases; // Nombre del paquete donde estamos tranajando

public class Persona {

    // Una clase es como una plantilla desde la cual se crean objetos que comparten las propiedades de dicha clase
    // Un objeto tambien se llama instancia de una clase
    // public se refiere a que esta clase es accesible desde todos los otros paquetes
    // Las clases se nombran con cada palabra empezando en Mayuscula
    // Se escribe (modificador de acceso) class Nombre {}

    //Atributos de la clase
    // Se recomienda definirlos al inicio

    public String nombre; // No es buena practica, pero es momentaneo para modificarlo desde otro pkg
    public String apellido;

    // Metodos de la clase

    public void desplegarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

}
