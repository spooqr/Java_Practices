public class SentenciaSwitch {
    public static void main (String args[]) {
        // La estructura switch suele usarse para los menus

        // Convertir un numero a texto
        var numero = 1;
        var numeroTexto = "Valor desconocido";

        switch (numero) {
            case 1: // Caso a evaluar
                numeroTexto = "Numero uno"; // Sentencia a ejecutar
                break; // Si no se agrega esta palabra la sentencia sigue evaluando los otros casos
            case 2:
                numeroTexto = "Numero dos";
                break; // No olvidar el break
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado"; // Juega el mismo papel que el else en IfElse
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
