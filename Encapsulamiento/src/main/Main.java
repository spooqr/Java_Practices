package main;

import dominio.Persona; // Si pones pkg.* se importan todas las clases de ese pkg

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan", 5000.00, false);
        System.out.println("persona1 nombre: " + persona1.getNombre());
        System.out.println("persona1: " + persona1.toString());
        persona1.setNombre("Juan Carlos"); // Para acceder al atributo si o si hay que usar set, porque son de acceso private
//        System.out.println("persona1 nombre cambiado: " + persona1.getNombre());
//        System.out.println("persona1 sueldo: " + persona1.getSueldo());
//        System.out.println("persona1 eliminado: " + persona1.isEliminado());
        System.out.println("persona1: " + persona1.toString());
    }
}
