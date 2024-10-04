public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternanrio ***");
        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar si el numero es par
        var numero = 4;
        var resultado = (numero %2 == 0) ? "Par" : "Impar";
        System.out.println("El numero " + numero + " es " + resultado);

        // Calcular si es mayor de edad
        var edad = 17;
        var mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Si tienes " + edad + " eres " + mensaje);

        // Valor positivo, negativo o cero (operador ternario anidado)
        numero = 0;
        resultado = (numero >0) ? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("El numero " + numero + " es: " + resultado);

    }
}
