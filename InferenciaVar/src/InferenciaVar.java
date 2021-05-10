public class InferenciaVar {
    public static void main (String args[]) {
        var numeroEntero = 10; //int
        System.out.println("numeroEntero = " + numeroEntero);

        /* MODO DEBUG
        Para usar Java en modo debug, hay que agregar puntos de ruptura en el codigo para
        ejecutarlo paso a paso. Estos puntos deben estar en lineas de codigo que puedan ser
        ejecutadas.
         */
        
        var numeroDouble = 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
    }
}
