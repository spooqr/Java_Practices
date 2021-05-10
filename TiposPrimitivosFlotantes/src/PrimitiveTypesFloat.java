public class PrimitiveTypesFloat {
    public static void main (String args[]) {
        // Los numeros tipo flotante permiten ingresar numeros decimales
        //Son float y double
        
        float numeroFloat = 10.0F; // Se agrega una F para indicar que es de tipo flotante
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo float: " + Float.MAX_VALUE);

        double numeroDouble = 10; // Los tipos int pueden almacenarse en los double sin problemas
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo double: " + Double.MIN_VALUE);
        System.out.println("Valoir maximo double: " + Double.MAX_VALUE);
        /*
        Los literales que contengan punto decimal son double por default.
         */
    }
}
