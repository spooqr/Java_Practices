package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);

        cambioValor(x);

        System.out.println("x nuevo valor = " + x);

    }

    public static void cambioValor(int arg1) {
        /*
        El paso por valor solo recibe argumentos de tipo primitivo
        El metodo debe ser static para poder ser llamado por main
         */

        System.out.println("arg1 = " + arg1);
        arg1 = 15; // Aunque modifique el valor aca, la variable x en el otro metodo no cambia

    }

}
