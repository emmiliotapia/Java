import java.sql.SQLOutput;
import java.util.Scanner;

public class CreacionValidacionPass {
    public static void main(String[] args) {
        /*
        Creacion y Validacion de Password
        Crear un programa para solicitar la validacion al momento de crear un valor de un
        password o contraseña.
        La contraseña debe tener al menos 6 caracteres
        En caso de no cumplir con esta condicion el programa debe volver a solicitar un nuevo valor hasta que
        cumpla con la condicion.
        Si el valor proporcionado es valido, se debe imprimir: Pssword Valido y debe terminar la ejecucion del
        sistema.
         */

        final var MINIMO_CARACTERES = 6;
        var consola = new Scanner(System.in);
        var contrasena = "";
        var salir = false;

        do {
            System.out.println("*** Sistema de Creacion de Contraseñas ***");
            System.out.print("Crea una contraseña (Minimo 6 Caracteres): ");
            contrasena = consola.nextLine();
            if (contrasena.length() >= MINIMO_CARACTERES) {
                System.out.println("Contraseña creada");
                salir = true;
            }
            else
                System.out.println("Contraseña invalida, intente nuevamente.\n");
        }while (!salir);

    }
}
