import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SistemaAutenticacion {
    /*
    Crear un sistema para validar los valores de usuarios y password proporcionados.

    Se deben definir dos constantes con los valores validos de usuario y password

    Y el sistema debe comparar los valores validos contra los valores proporcionados

    Se deben considerar 4 casos:
        1. Usuario y password validos. Debe imprimir "Bienvenido al sistema"
        2. Usuario invalido
        3. Password invalido
        4. Usuario y password invalidos
     */

    public static void main(String[] args) {
        System.out.println("*** Bienvenido al Sistema de Autenticacion ***");

        // Valores Validos
        final var USUARIO = "emmiliodev";
        final var PASSWORD = "emm123";

        var consola = new Scanner(System.in);
        System.out.print("Ingresa el usuario: ");
        var user = consola.nextLine();
        System.out.print("Ingresa la contraseña: ");
        var pass = consola.nextLine();

        // Validacion
        var mensaje = switch (user) {
            case USUARIO -> {
                if (PASSWORD.equals(pass))
                    yield "Bienvenido al sistema!";
                else
                    yield "Contraseña equivacada, favor de corregir.";
            }
            default -> {
                if (PASSWORD.equals(pass))
                    yield "Usuario equivocado, favor de corregir.";
                else
                    yield "Usuario y contraseña equivocados, favor de corregir.";
            }
        };
        // Mensaje final:
        System.out.println(mensaje);
    }
}
