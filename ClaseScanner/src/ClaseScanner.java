import java.util.Scanner;

public class ClaseScanner {
    public static void main(String args[]) {
      //La clase Scanner se encarga de recibir informacion ingresada por un usuario
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);// Lee la entrada de la consola
        // Eso fue la creacion de un objeto dentro de la clase Scanner
        
        var usuario = consola.nextLine();// Metodo nextLine
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}
