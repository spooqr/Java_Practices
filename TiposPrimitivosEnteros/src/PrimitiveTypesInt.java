public class PrimitiveTypesInt {
    public static void main (String args[]) {
        /*

        Tipos primitivos enteros:
        byte, short, int, long.
        Int es el tipo mas comun
        RANGOS:
        byte 8bits -128 a 127
        short 16bits -32768 a 32767
        int 32bits -2^31 a 2^31-1
        long 64bits -2^63 a 2^63-1
        float 32bits 1.4e-045 a 3.4e+038
        double 64bits 4.9e-324 a 1.8e308
        char 16bits 0 a 65525
        boolean 1(puede variar) true o false

         */

        byte numeroByte = 10;
        System.out.println("valor minimo byte: " + Byte.MIN_VALUE);//Clase.metodo
        System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);
        byte numeroByteGrande = (byte)129;// Numero fuera de rango. Lo que esta entre parentesis realiza una conversion
        System.out.println("Valor byte: " + numeroByteGrande);// Muestra de la falta de precision en la conversion
        
        short numeroShort = 10;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo short: " + Short.MAX_VALUE);
        /* Los errores de precision por numeros fuera de rango suceden
        con todos los tipos.
         */

        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo int: " + Integer.MAX_VALUE);

        /*
        Por default, cuando escribis un numero Java lo interpreta como una literal de tipo int. Si estas asignando
        el valor a una variable y el numero esta fuera de rango, podes solucionarlo especificando
        el tipo del numero a Long, agregando un L al final del numero. Puede ser mayuscula o minuscula, pero se
        recomienda usar L para evitar confusiones.
         */

        int numeroIntGrande = (int)2147483648L; //Pero ahora tenemos problema de conversion de tipo

        long numeroLong= 10;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo long: " + Long.MAX_VALUE);

    }
}
