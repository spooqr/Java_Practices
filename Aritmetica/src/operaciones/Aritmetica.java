package operaciones;

public class Aritmetica {
    //Atributos
    int a; // Su valor por default es 0
    int b;

    // Constructor vacio
    public Aritmetica() { // Los constructores nunca devuelven un valor
        System.out.println("Ejecutando constructor");
    }

    // Sobrecarga de constructores
    public Aritmetica(int a, int b) { // Constructor que inicializa los atributos a y b
        this.a = a; // No usar a = a ._.
        this.b = b;
        System.out.println("Ejecutando constructor con arg");
    }

    //Metodos
    public void sumar() {
        int resultado = this.a + this.b; // Variable local a este metodo
        System.out.println("resultado = " + resultado);
        // void indica que el metodo no regresa ninguna informacion
    }

    public int sumarConRetorno() {
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }

    public int sumarConArgumentos(int a, int b) { // Argumentos
        this.a = a; // Operador this, apunta al objeto que se esta ejecutando
        this.b = b; // Solo se puede usar adentro de su clase
        //return a + b;
        return this.sumarConRetorno();
    }

}
