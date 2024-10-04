import java.util.Scanner;

public class SistemaResevaHotel {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido al Siste Reserva Hotel ***");

        /*
        Se solicita crear un sistema de Resevacion de un Hotel
        Se debe pedir la siguiente informacion al usuario

            * Nombre de cliente
            * Dias de estadia en el Hotel
            * Cuarto con visita al mar?

            El Hotel tiene las siguientes tarifa
            * Cuarto sin vista al mar $150.50 por dia
            * Cuarto con vista al mar $190.50 por dia
        El sistema debe calcular el costo total de la estadia dependiendo si escogio
        un cuarto con vista al mar o no.
        Ademas de indicar si escogio un cuarto con visita al mar o no.
        */

        final var VISTA_AL_MAR = 190.5;
        final var SIN_VISTA_AL_MAR = 150.5;

        // Input
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el nombre del cliente: ");
        var usuario = consola.nextLine();
        System.out.print("Cuantos dias se quedara en el Hotel?: ");
        var estadia = Integer.parseInt(consola.nextLine());
        System.out.print("Cuenta con vista al mar?: ");
        var tieneVistaMar = Boolean.parseBoolean(consola.nextLine());

        var costoPorDia = (!tieneVistaMar) ? SIN_VISTA_AL_MAR : VISTA_AL_MAR;
        var costoTotal = costoPorDia * estadia;

        System.out.printf("""
                -----------------------------
                \nHola %s! Muchas gracias por tu preferencia,
                Dias de estadia: %d
                El costo total: $%.2f
                La habitacion cuenta con vista hacia el mar: %b
                Que disfrute su estadia!...
                ------------------------------
                """, usuario, estadia, costoTotal, tieneVistaMar);

    }
}
