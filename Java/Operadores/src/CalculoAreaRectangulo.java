import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Calculo Area y Perimetro de un Rectangulo ***");
        /*
        Se solicita cacular el area y perimetro de un rectangulo aplicando las siguientes formulas:
            area = base * altura
            perimetro = 2 * (base + altura);
        */

        var consola = new Scanner(System.in);

        // Input
        System.out.print("Ingresa la base del rectangulo: ");
        var base = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa la altura del rectangulo: ");
        var altura = Integer.parseInt(consola.nextLine());

        // Formulas
        var areaRectangulo = base * altura;
        var perimetroRectangulo = 2 * (base + altura);

        // Impresion en consola
        System.out.println("El area del rectangulo es: " + areaRectangulo);
        System.out.println("El perimetro del rectangulo es: " + perimetroRectangulo);




    }
}
