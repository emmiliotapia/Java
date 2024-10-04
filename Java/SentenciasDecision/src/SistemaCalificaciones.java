import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        /*
        Crear un programa para convertir una calificacion numerica (entre 0 y 10)
        a una letra (de la F a la A)
            Si es mayor o igual a 9 y menor o igual a 10 es una A
            Si es mayor o igual a 8 y menor a 9 es una B
            Si es mayor o igual a 7 y menor a 8 es una C
            Si es mayor o igual a 6 y menor a 7 es una D
            Si es mayor o igual a 0 y menor a 6 es una F
        */

        var consola = new Scanner(System.in);
        System.out.print("Ingrese la calificacion en numero (0 - 10): ");
        double calificacion = Double.parseDouble(consola.nextLine());

        var nota = "";

        if (calificacion > 9 && calificacion <= 10) {
            nota = "A";
        }
        else if (calificacion >= 8 && calificacion < 9) {
            nota = "B";
        }
        else if (calificacion >= 7 && calificacion <= 8) {
            nota = "C";
        }
        else if (calificacion >= 6 && calificacion <= 7) {
            nota = "D";
        }
        else if (calificacion >= 0 && calificacion < 6) {
            nota = "F";
        }
        else {
            System.out.println("Calificacion invalida.");
        }

        System.out.printf("Tu calificacion %.1f es equivalente a %s", calificacion, nota);

    }
}
