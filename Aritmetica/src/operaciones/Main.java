package operaciones;

public class Main {
    public static void main(String[] args) {
        // El metodo main solo puede llamar a otros metodos estaticos

        // Variables locales
        var a = 10; // var unicamente puede usarse para declarar variables locales
        var b = 2;

        // Las variables solo son accesibles dentro del metodo en el que fueron definidas

        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno(); // Guarda el retorno del metodo
        System.out.println("resultado desde la clase main = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(5, 8); // Parametros
        System.out.println("resultado usando argumentos = " + resultado);

        Aritmetica aritmetica2 = new Aritmetica();
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);

        Aritmetica aritmetica3 = new Aritmetica(5, 8);
        System.out.println("aritmetica3 a: " + aritmetica3.a);
        System.out.println("aritmetica3 b: " + aritmetica3.b);

        // Las variables locales se guardan en la memoria stack
        // Los objetos se guardan en la memoria heap

    }
}
