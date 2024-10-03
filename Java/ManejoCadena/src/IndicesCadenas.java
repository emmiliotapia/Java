public class IndicesCadenas {
    public static void main(String[] args) {
        // Manejo de cadenas
        var cadena1 = "Hola Mundo";
        
        // Recuperear el primer caracter
        var primerCaracter = cadena1.charAt(0); // Recuperar el caractar "H"
        System.out.println("primerCaracter = " + primerCaracter);

        var ultimoCaracter = cadena1.charAt(9); // Recuperar el caracter "o"
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        var letraM = cadena1.charAt(5); // Recuperar letra "M"
        System.out.println("letraM = " + letraM);
    }
}
