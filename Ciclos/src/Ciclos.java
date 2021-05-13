public class Ciclos {
    public static void main (String args[]) {
        // Ciclo WHILE

        var contador = 0; // Esta variable es la que se verifica

        while (contador < 3) { // Se repite el bloque interior mientras la condicion sea verdadera
            System.out.println("contador = " + contador);
            contador++; // Aumenta en 1 el valor de contador
        }

        // Ciclo DO WHILE
        //Solo cambia el orden en el que aparece la condicion
        // En este ciclo, siempre se ejecuta al menos una vez

        var contador2 = 0;

        do {
            System.out.println("contador2 = " + contador2);
            contador2++; // Si no agregamos esta line el ciclo sera infinito, siempre verificar que en algun momento termine
        } while (contador2 < 3);

        // Se recomienda usar este ciclo si se necesita que el codigo se ejecute al menos una vez

        // Ciclo FOR

        for (var contador3 = 0; contador3 < 3; contador3++) { // for (contador; condicion; incremento) La variable contador3 solo esta definida en el ciclo
            System.out.println("contador3 = " + contador3);
        } // Es una forma mas explicita de ejercer el ciclo

        // Cada ejecucion se llama iteracion
        // No olvidar que la variable contador3 solo existe dentro del ciclo FOR

        // Break y continue

        for ( var i = 0; i < 3; i++) {
            if (i % 2 == 0) { // Imprime numeros pares
                System.out.println("i = " + i);
                break; // Rompe el ciclo apenas encuentra la primera coincidencia
            }

        }

        for (var contador4 = 0; contador4 < 3; contador4++) {
            if ( contador4 % 2 != 0) {
                continue; // Ir a la siguiente iteracion
            }
            System.out.println("contador4 = " + contador4);
        }

        // Labels

        // !!!! No se recomienda su uso !!!! Solo si hay ciclos anidados en otros ciclos
        // Programacion Go To

        inicio:
        for (var i = 0; i < 3; i++) {
            if (i % 2 != 0) {
                continue inicio; // Va a la iteracion de la etiqueta marcada
            }
            System.out.println("i = " + i);
        }

    }
}
