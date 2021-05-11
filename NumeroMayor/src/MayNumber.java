import java.util.Scanner;

public class MayNumber {
    public static void main (String args[]) {
        Scanner consola = new Scanner(System.in);
        int numeroMayor;

        System.out.println("Proporciona el numero1: ");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero2: ");
        int numero2 = Integer.parseInt(consola.nextLine());

        numeroMayor = (numero1 > numero2) ? numero1 : numero2;

        System.out.println("El numero mayor es: " + numeroMayor);
    }
}
