import java.util.Locale;
import java.util.Scanner;

public class SistemaEnvio {
    public static void main(String[] args) {
        /*
        Crea un programa para determinar el costo de envio de un pauqete segun el destino
        (nacional o internacional) y el peso del paquete.
        Costo Tarifas:
            1. Nacional 10 x kilo
            2. Internacional 20 x kilo
        El programa debe solicitar 2 valores:
            1. Destino (nacional o internacional)
            2. Peso (kilogramos) del paquete
        Al final debe imprimir el costo de envio del paquete.
         */

        System.out.println("*** Sistema de Envios ***");

        // Constantes
        final var COSTO_NACIONAL = 10.0;
        final var COSTO_INTERNACIONAL = 20.0;

        // Input
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el destino de tu paquete (nacional/internacional): ");
        var destino = consola.nextLine().strip().toLowerCase(); //strip quita espacios en blanco;

        System.out.print("Ingresa el peso de tu paquete (en Kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        // Calculo del envio del paquete
        Double costoEnvio = switch (destino) {
            case "nacional" -> peso * COSTO_NACIONAL;
            case "internacional" -> peso * COSTO_INTERNACIONAL;
            default -> {
                System.out.println("Destino invalido. Ingresa nacional/internacional");
                yield null;
            }
        };
        if (costoEnvio != null)
            System.out.printf("""
                \n*** Muchas gracias por su preferencia: ***
                El costo total de su envio es de: $%.2f
                ------------------------------------------
                """, costoEnvio);
    }
}
