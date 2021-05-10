public class PrimitiveTypesBool {
    public static void main (String args[]) {
        // Los valores booleanos solo guardan true o false
        
        boolean varBoolean = true; // Tambien se los conoce como tipos bandera
        System.out.println("varBoolean = " + varBoolean);
        varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);

        // Ejemplo con estructura if-else

        if (varBoolean) {
            System.out.println("La bandera es verdadera");
        }
        else {
            System.out.println("La bandera es falsa");
        }

        var edad = 30;
        var esAdulto = edad >= 18;
        if (esAdulto) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }
    }
}
