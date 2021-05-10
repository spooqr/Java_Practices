public class CarEspeciales {
    public static void main(String args[]) {
        var nombre = "Karla";

        System.out.println("Nueva linea: \n" + nombre);// Caracter de salto de linea
        System.out.println("Tabulador: \t" + nombre);// Agrega tabulaciones
        System.out.println("Retroceso: \b" + nombre);// Caracter de retroceso
        System.out.println("RetrocesoDoble: \b\b" + nombre);// Agrupacion de caracter de retroceso
        System.out.println("Comilla simple: \'" + nombre + "'");// Agregar comillas simples
        System.out.println("Comilla doble: \"" + nombre + "\"");// Agregar comilla doble
        // La comilla simple no rompe la cadena, por lo que no es necesario usar el caracter de escape \

    }
}
