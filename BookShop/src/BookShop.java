import java.util.Scanner;

public class BookShop {
    public static void main (String args[]) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        var titulo = consola.nextLine();
        System.out.println("Proporciona el id: ");
        var bookId = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble(consola.nextLine());
        System.out.println("Envio gratutito: ");
        var envioGratis = Boolean.parseBoolean(consola.nextLine());

        System.out.println(titulo + " #" + bookId);
        System.out.println("Precio: " + "$" + precio);
        System.out.println("Envio Gratuito: " + envioGratis);
    }
}
