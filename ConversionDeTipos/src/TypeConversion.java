import java.util.Scanner;

public class TypeConversion {
    public static void main (String args[]) {
        // Convertir tipo String a tipo int
        
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

        // Pedir un valor
        var consola = new Scanner(System.in);
//        System.out.println("Proporciona tu edad: ");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("edad = " + edad);

        // Convertir tipo int a String
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        // Convertir String a char
        var caracter = "hola".charAt(1); // En Java se cuenta desde 0.
        System.out.println("caracter = " + caracter);

        System.out.println("Proporciona un caracter: ");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);

    }
}
