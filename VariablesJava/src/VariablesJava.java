public class VariablesJava {
    public static void main (String[] args){
        int miVariableEntera = 10; //int corresponde a un numero entero. Las variables se nombran con camelCase.
        System.out.println(miVariableEntera);

        miVariableEntera = 5; //Puedo reutilizar las variables y redefinirlas a lo largo del codigo.
        System.out.println(miVariableEntera); // Puedo llamar este metodo escribiendo sout y aprentando tab.

        /* Las variables tienen limites. Esto se conoce como el alcance(scoup).
        Por ejemplo, las variables definidas en main no pueden usarse fuera de éste, y asi pasa con
        las que estan definidas en otros archivos, metodos,etc.
         */

        String miVariableCadena = "Saludos"; // String es una clase de Java. El valor de una variable String va entre ""
        System.out.println(miVariableCadena);

        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);

        // Inferencia de tipo
        /* A partir de la version 10 de Java, puedo definir una variable
        simplemente usando var y Java va inferir el tipo segun su literal (lo del otro lado del igual).
         */
        var miVariableEntera2 = 10;
        System.out.println(miVariableEntera2);

        var miVariableCadena2 = "Hola";
        System.out.println("miVariableCadena2 = " + miVariableCadena2); // Esto lo conseguis con soutv.
        // El operador + entre cadenas implica concatenacion.

        // REGLAS PARA NOMBRAR VARIABLES
        /*
        Deben empezar con mayusculas y formateadas en camelCase.
        No pueden empezar con numeros o caracteres extraños como á.
        Pueden empezar con $.
        Pueden empezar con _.
         */
    }
}
