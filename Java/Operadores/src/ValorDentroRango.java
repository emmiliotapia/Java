import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor Dentro de un Rango ***");
        // Definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        // Solicitar valor entre 0 y 5
        System.out.print("Ingrese un numero en el rango de 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());

        // Verificar si dato esta dentro de rango
        var dentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("Esta dentro de rango? " + dentroRango);

    }
}
