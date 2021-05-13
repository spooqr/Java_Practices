package caja;

public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja() {}

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }

    public void calcularVolumen() {
        int volumen = this.ancho * this.alto * this.profundo;
        System.out.println("Volumen = " + volumen);
    }

}
