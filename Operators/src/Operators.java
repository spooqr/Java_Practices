public class Operators {
    public static void main(String args[]) {
        // Operadores aritmeticos
        //+, - , * , / , %

        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        resultado = a / b;
        System.out.println("resultado division int = " + resultado);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado); // Residuo de la division

        // Algoritmo ParImpar

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }
        // Operadores de asignacion

        int c = a + 5 - b; // El resultado del lado derecho se asigna a la variable del lado izq
        System.out.println("c = " + c);
        
        a += 1; // a = a + 1 Operador de composicion. Funciona con cualquier operador aritmetico
        System.out.println("a = " + a);
        a += 3; // a = a + 3
        System.out.println("a = " + a);
        a -= 2; // a = a - 2
        System.out.println("a = " + a);
        // *= , /= , %=
        
        // Operadores unitarios
        
        a = 3;
        b = -a; // Cambio de signo
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        var d = true;
        var e = !d; // Negacion
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // Incremento
        //1. Preincremento (simbolo antes de la variable)

        var f = 3;
        var g = ++f; // Primero se incrementa la variable y despues se usa su valor
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        //2. Postincremento (simbolo despues de la variable)

        var h = 5;
        var i = h++; // Primero se utiliza el valor y despues se incrementa
        System.out.println("h = " + h); // Teniamos pendiente un incremento
        System.out.println("i = " + i);

        // Tambien funciona con decremento
        var j = 2;
        var k = --j;
        System.out.println("j = " + j);
        System.out.println("k = " + k);

        var l = 2;
        var m = l--; // Primero se lee el valor y queda pendiente el decremento
        System.out.println("l = " + l); // Tenia pendiente un decremento
        System.out.println("m = " + m);

        // Operadores de igualdad y relacionales

        a = 3;
        b = 2;
        
        var igual = a == b; // Operador de igualdad
        System.out.println("igual = " + igual);
        
        var desigual = a != b; // Operador diferencia
        System.out.println("desigual = " + desigual);

        var cadena = "Hola";
        var cadena2 = "Adios";
        var e2 = cadena == cadena2; // Compara referencias de objetos
        System.out.println("e2 = " + e2);

        var f2 = cadena.equals(cadena2); // Comparamos contenido de cadenas
        System.out.println("f2 = " + f2);

        var g2 = a > b; // Ejemplo de operador relacional
        System.out.println("g2 = " + g2);

        if (a % 2 == 0) {
            System.out.println("Es numero par");
        }
        else {
            System.out.println("Es numero impar");
        }

        var edad = 10;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        }
        else {
            System.out.println("Es menor de edad");
        }

        // Operadores condicionales

        a = 10;
        var valorMinimo = 0;
        var valorMaximo = 10;
        // Verificamos si a esta entre valorMinimo y valorMaximo
        var verificacion = a >= valorMinimo && a <= valorMaximo; // Operador and
        if (verificacion) {
            System.out.println("Dentro del rango");
        }
        else {
            System.out.println("Fuera de rango");
        }

        var vacaciones = false;
        var diaDescanso = true;
        if(vacaciones || diaDescanso) { // Operador or
            System.out.println("Puede ir");
        }
        else {
            System.out.println("Esta ocupado");
        }

        // Operador ternario

        var verificacion2 = (3 > 2) ? "verdadero" : "falso";
        System.out.println("verificacion2 = " + verificacion2);
        /* El operador ternario sirve para simplificar estructuras if else, siendo que la forma es
        (boolean) ? if true : if false;
         */

        var numero = 9;
        verificacion2 = (numero % 2 == 0) ? "Es par" : "Es impar"; // Verificacion ParImpar
        System.out.println("verificacion2 = " + verificacion2);

        // Precedencia de operadores

        // Los operadores unitarios son los de mayor prioridad
        // Los operadores de asignacion son los de menor prioridad

        var x = 5;
        var y = 10;
        var z = ++x + y--; // Deberia dar 16
        System.out.println("x = " + x); // 6
        System.out.println("y = " + y); // 9
        System.out.println("z = " + z); // 16

        var ans = 4 + 5 * 6 / 3; // 4 + ((5 * 6) / 3)
        System.out.println("ans = " + ans); // 14

    }
}