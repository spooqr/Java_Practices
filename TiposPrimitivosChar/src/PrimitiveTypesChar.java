public class PrimitiveTypesChar {
    public static void main (String args[]) {
        char miCaracter = 'a'; // El tipo char solo guarda un caracter
        System.out.println("miCaracter = " + miCaracter);
        // El tipo char guarda caracteres de unicode
        
        char varChar = '\u0021'; // Codigo unicode
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33; // Decimal unicode
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        //Si se usa var no se puede usar el codigo decimal unicode porque al inferir el valor pondra int
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'a';
        System.out.println("letra = " + letra);
        
        int letraMayus = 'A';
        System.out.println("letraMayus = " + letraMayus);
    }
}
