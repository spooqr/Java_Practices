public class IfElse {
    public static void main(String args[]) {

        // La estructura if-else primero evalua un valor booleano
        var condicion = false;

        if (condicion) {
            System.out.println("Condicion verdadera"); // Se ejecuta si condicion = true
        }
        else {
            System.out.println("Condicion falsa");// Se ejecuta si condicion = false
            // El else es opcional
        }

        var numero = 1;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        }
        else if (numero == 2) {
            numeroTexto = "numero dos";
        }
        else if (numero == 3) {
            numeroTexto = "numero tres";
        }
        else if (numero == 4) {
            numeroTexto = "numero cuatro";
        }
        else {
            numeroTexto = "numero no encontrado";
        }
        System.out.println(numeroTexto);

    }
}