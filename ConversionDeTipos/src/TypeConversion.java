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
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine());
        System.out.println("edad = " + edad);

    }
}
