import java.util.Scanner;

public class Calificaciones {
    public static void main (String args[]) {
//        El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
//
//        El usuario proporcionará un valor entre 0 y 10.
//
//        Si está entre 9 y 10: imprimir una A
//
//        Si está entre 8 y menor a 9: imprimir una B
//
//        Si está entre 7 y menor a 8: imprimir una C
//
//        Si está entre 6 y menor a 7: imprimir una D
//
//        Si está entre 0 y menor a 6: imprimir una F
//
//        cualquier otro valor debe imprimir: Valor desconocido

        Scanner sc = new Scanner(System.in);
        System.out.println("Proporcione un valor entre 0 y 10:");
        var valor = Integer.parseInt(sc.nextLine());
        var calificacion = "Valor nulo";

        switch (valor) {
            case 0: case 1: case 2: case 3: case 4: case 5: // Si esta entre 0 y 5 imprimir f
                calificacion = "F";
                break;
            case 6: // Si vale 6 imprimir D
                calificacion = "D";
                break;
            case 7: // Si vale 7 imprimir C
                calificacion = "C";
                break;
            case 8: // Si vale 8 imprimir B
                calificacion = "B";
                break;
            case 9: case 10: // Si vale 9 0 10 imprimir A
                calificacion = "A";
                break;
            default: // Si no coincide con ninguno de los casos anteriores imprimir Valor desconocido
                calificacion = "Valor desconocido";
        }
        System.out.println("calificacion = " + calificacion);
    }
}
