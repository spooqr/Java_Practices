public class HolaMundo {
    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";

        var union = titulo + " " + usuario; // El operador + sirve para sumar numeros y concatenar cadenas.
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); // Suma de numeros
        System.out.println(i + j + usuario);// Evaluacion de izq a der, realiza suma
        System.out.println(usuario + i + j);// Cointexto cadena, all es una cadena
        System.out.println(usuario + (i + j));// Los parentesis se evaluan primero
    }
}
