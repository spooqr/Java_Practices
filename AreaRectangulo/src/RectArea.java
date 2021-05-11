import java.util.Scanner;

public class RectArea {
    public static void main (String args[]) {
        Scanner consola = new Scanner(System.in);

        System.out.println("Proporciona el alto: ");
        var alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        var ancho = Integer.parseInt(consola.nextLine());

        var area = alto * ancho;
        var perimetro = (alto + ancho) * 2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}
