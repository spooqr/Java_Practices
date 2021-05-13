package caja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Caja caja1 = new Caja();
        caja1.ancho = 3;
        caja1.alto = 2;
        caja1.profundo = 6;
        caja1.calcularVolumen();

        Caja caja2 = new Caja(3, 2, 6);
        caja2.calcularVolumen();

        Caja caja3 = new Caja(4, 5, 10);
        caja3.calcularVolumen();

        Caja caja4 = new Caja();
        System.out.println("Ancho: ");
        caja4.ancho = Integer.parseInt(sc.nextLine());
        System.out.println("Alto: ");
        caja4.alto = Integer.parseInt(sc.nextLine());
        System.out.println("Profundo: ");
        caja4.profundo = Integer.parseInt(sc.nextLine());
        caja4.calcularVolumen();

    }
}
