import java.util.Scanner;

public class CasaEspejos {
    /*
    Supon que estas en un parque de diversiones y quieres entrar a la casa
    de los espejos.

    Sim embargo debes cumplir con algunas condiciones:
        1. Debes tener mas de 10 años
        2. No debe darte miedo la oscuridad

    Si se cumplen las condiciones anteriores puedes entrar
    Para realizar este ejemplo vamos a utilizar el operador not para
    aplicar la logica inversa.
     */
    public static void main(String[] args) {
        System.out.println("*** Bienvenido a la Casa de los Espejos ***");

        final var EDAD_MINIMA = 10;

        // Input
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        System.out.print("Le temes a la oscuridad (true/false)?: ");
        var miedoOscuridad = Boolean.parseBoolean(consola.nextLine());

        // Verificacion
        if (!miedoOscuridad && edad >= 10) {
            System.out.println("Puedes entrar...");
        }
        else {
            System.out.println("Lo siento pero no puedes entrar...");
        }

    }

}
