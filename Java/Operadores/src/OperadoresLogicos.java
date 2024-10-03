public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Logicos ***");
        boolean a = true, b = false;

        // AND &&
        var resultado = a && b;
        System.out.println("resultado a && b: " + resultado);

        // OR ||
        resultado = a || b;
        System.out.println("resultado a || b: " + resultado);

        // NOT !
        resultado = !a;
        System.out.println("resultado !a= " + resultado);
    }
}
