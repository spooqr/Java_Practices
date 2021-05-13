package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Perez");
        System.out.println("persona = " + persona);
        System.out.println("persona nombre: " + persona.nombre);
        System.out.println("persona apellido: " + persona.apellido);

    }
}

class Persona { // Solo puede haber una clase public por archivo
    String nombre; // Esto solo se puede usar dentro del mismo pkg
    String apellido;

    Persona(String nombre, String apellido) { // Constructor solo usable en este pkg
        //super(); Llamada al constructor de la clase padre implicita
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("objeto persona usando this: " + this);
        new Imprimir().imprimir(this); // Creando objeto ahorrando la creacion de una variable
    }


}

class Imprimir {
    public void imprimir(Persona persona) {
        System.out.println("persona desde imprimir:" + persona);
        System.out.println("objeto actual: " + this);
    }
}
