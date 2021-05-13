package pasoporreferencia;

import clases.Persona;

import java.util.Arrays;

public class PasoPorReferencia {
    public static void main(String[] args) {
        // Tiene que ver con objetos

        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiarValor(persona1); // Guarda el objeto que devuelve cambiarValor()
        System.out.println("persona1 cambio nombre = " + persona1.nombre);

    }

    public static Persona cambiarValor(Persona persona) {
        persona.nombre = "Karla"; // Esto SÍ modifica el atributo, porque referencia a un objeto en la memoria
        // De esta forma, se modifica el valor del atributo desde otro metodo
        // Si se quisiera que devuelva el objeto
        return persona; // Despues de la palabra return no se puede poner mas codigo
    }

}
