import org.w3c.dom.ls.LSOutput;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanzas {
    /*
    Crear un juego donde el jugador debe adivinar un numero secreto.

    Pudes usar un ciclo while hasta que el jugador adivine correctamente.

    El numero secreto se puede crear usando la clase random para generar un valor aleatorio entre 1 y 50

    Por cada intento fallido se debe incrementar una variable que lleve el conteo de intentos.

    El programa debe orientar al jugador indicandole si el valor que proporciono fue mayor o menor que
    el numero secreto.

    Finalmente si adivina el numero secreto debe felicitar al usuario e indicar cuantos intentos realizo.

    (opcionalmente) se puede limitar el juego a un numero de intentos maximo (ej. 10) de lo contrario
    termina el juego.
     */
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var random = new Random();

        // Generamos un numero aleatorio entre 1 y 50
        var numeroSecreto = random.nextInt(50) + 1;
        var intentos = 0;
        var adivinanza = 0;
        final var INTENTOS_MAXIMOS = 5;

        while (adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMOS){
            System.out.print("Adivina el numero secreto (1-50): ");
            adivinanza = consola.nextInt();

            // Ayuda al jugador
            if (adivinanza < numeroSecreto)
                System.out.println("El numero Secreto es mayor");
            else if (adivinanza > numeroSecreto)
                System.out.println("El numero Secreto es menor");

            // Incrementamos la variable de intentos
            intentos++;
        }

        // Conclusion del juego
        if (adivinanza == numeroSecreto) {
            System.out.printf("Felicidades! Adivinaste el numero secreto en %d intentos%n", intentos);
        }
        else {
            System.out.printf("Lo siento, has agotado tus intentos maximos: %d%n", INTENTOS_MAXIMOS);
            System.out.printf("El numero secreto era: %d%n", numeroSecreto);
        }
    }
}
