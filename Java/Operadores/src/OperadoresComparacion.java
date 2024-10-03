public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparacion ***");
        int a = 3, b = 2;

        // Operador de igualdad ==
        var resultado = a == b;
        System.out.println("resultado a == b: " + resultado);

        // Operador de distinto
        resultado = a != b;
        System.out.println("resultado a != b: " + resultado);

        // Mayor que >
        resultado = a > b;
        System.out.println("resultado a > b: " + resultado);

        // Mayor o igual que >=
        resultado = a >= b;
        System.out.println("resultado a > b: " + resultado);

        // Menor que >
        resultado = a < b;
        System.out.println("resultado a < b: " + resultado);

        // Menor o igual que <=
        resultado = a <= b;
        System.out.println("resultado a <= b: " + resultado);
    }
}
