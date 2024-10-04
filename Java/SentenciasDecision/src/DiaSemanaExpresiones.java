import java.util.Scanner;

public class DiaSemanaExpresiones {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.print("Ingresa el numero correspondiente al dia (1 - 7): ");
        var dia = Integer.parseInt(consola.nextLine());
        String nombreDia;

        nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Dia invalido";
        };

        System.out.println(nombreDia);
    }
}
