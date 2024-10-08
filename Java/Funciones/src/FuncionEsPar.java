import java.util.Scanner;

public class FuncionEsPar {

    static String esPar(int num) {
        return (num % 2 == 0)? "Es par":"Es impar";
    }

    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        var numero = Integer.parseInt(consola.nextLine());
        System.out.println("El numero que ingresaste: " + esPar(numero));
    }
}
