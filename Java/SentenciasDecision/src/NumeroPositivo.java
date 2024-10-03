import java.util.Scanner;

public class NumeroPositivo {
    public static void main(String[] args) {
        System.out.println("*** Valor Positivo ***");

        var consola = new Scanner(System.in);

        // Input
        System.out.print("Ingresa un numero: ");
        var numeroIngresado = Integer.parseInt(consola.nextLine());

        // Condicion
        if (numeroIngresado > 0) {
            System.out.println("Es positivo");
        }
        else if (numeroIngresado == 0) {
            System.out.println("Es cero");
        }
        else {
            System.out.println("Es negativo");
        }

    }
}
