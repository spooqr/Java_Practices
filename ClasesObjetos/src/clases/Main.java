package clases;

public class Main {
    public static void main(String[] args) {
        // Crear objetos
        Persona persona1; // Creando una variable persona1 de tipo Persona
        persona1 = new Persona(); // variable = new Constructor() Creando un objeto
        // El constructor de una clase es el metodo que permite crear objetos dentro de esa clase
        persona1.nombre = "Juan"; // objeto.atributo
        persona1.apellido = "Perez";
        /*
        De esta forma, el objeto persona1 guarda la informacion de sus atributos en memoria
        entonces puedo crear multiples objetos con diferentes atributos.
         */
        persona1.desplegarInformacion(); // objeto.metodo

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2); // paquete.Clase@referenciamemoria
        // Cada objeto tiene su propia informacion
        persona2.desplegarInformacion(); // Al no estar definidos aun sus atributos despliega null
        persona2.nombre = "Karla";
        persona2.apellido = "Lara";
        persona2.desplegarInformacion();

    }
}
