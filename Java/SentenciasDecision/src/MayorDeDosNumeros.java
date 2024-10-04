import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        /*
        Crear un programa para indicar cual es el mayor de dos numeros
        El programa debe pedir al usuario dos numeros enteros
        Posteriormente se deben comparar y mandar a imprimir el numero mayor.
         */

        System.out.println("*** El Mayor de dos Numeros ***");

        // Input
        var consola = new Scanner(System.in);
        System.out.print("Ingresa el primer numero entero: ");
        var num1 = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el segundo numero entero: ");
        var num2 = Integer.parseInt(consola.nextLine());


        // Validacion
        if (num1 > num2) {
            System.out.println("Numero Mayor = " + num1);
        }
        else {
            System.out.println("Numero Mayor = " + num2);
        }

    }
}
