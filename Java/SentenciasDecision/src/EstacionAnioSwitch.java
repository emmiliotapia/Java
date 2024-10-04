import java.util.Scanner;

public class EstacionAnioSwitch {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Ingresa el numero correspondiente al mes (1 - 12 ): ");
        var mes = Integer.parseInt(consola.nextLine());

        var mesAnio = switch (mes) {
            case 1, 2, 12  -> "Invierno";
            case 3, 4, 5   -> "Primavera";
            case 6, 7, 8   -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Estacion desconocida: " + mes;
        };

        System.out.println("La estacion para el mes "+ mes + " es: " + mesAnio);
    }
}
