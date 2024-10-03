import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticacion ***");
        /*
        Crea un programa para validar el usuario y password proporcionados por el usuario.
        Crea 2 constantes con los valores correctos y posteriormente compara que el usuario y pass
        proporcionados por el usuario sean validos.
        Debe solicitar el usuario y el password al usuario y si son iguales que los valores correctos
        almacenados en las constantes debe imprimir true, de lo contrario debe imprimir false.
         */

        final var USER = "emmiliodev";
        final var PASS = "emmilio123";
        var consola = new Scanner(System.in);

        // Input
        System.out.print("Ingresa el usuario: ");
        var user = consola.nextLine();
        System.out.print("Ingresa la contraseña: ");
        var pass = consola.nextLine();

        // Validacion
        var validacionUser = user.equals(USER);
        var validacionPass = pass.equals(PASS);
        var autenticacion = validacionUser && validacionPass;
        System.out.println("Autenticacion: " + autenticacion);

    }
}
