import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        /*
        Considerando que estamos dentro de un sistema bancario, se solicita pregunta al usuario si
        desea continuar dentro del sistema.

        Utilizando el operador not (!)para aplicar una logica inersa se dee programar las siguientes
        condiciones.

        Si NO deseamos salir del sistema, imprimir:
            Continuamos dentro del sistema.

        De lo contrario, imprimir:
            Saliendo del sistema.
        */

        System.out.println("*** Bienvenido al Sistema Bancario ***");

        var consola = new Scanner(System.in);

        System.out.print("Deseas salir del sistema (true/false)?: ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        // Verificamos (aplicando una logica inversa)
        if (!salirSistema) {
            System.out.println("Continuamos dentro del sistema...");
        }
        else {
            System.out.println("Saliendo del sistema...");
        }


    }
}
