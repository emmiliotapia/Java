import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio Calificaciones ***");
        var consola = new Scanner(System.in);
        System.out.print("Cuantas Calificaciones deseas agregar? ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        // Declaramos arreglo
        var calificaciones = new int[largoArreglo];

        // Input de datos en arreglo
        for (var i=0; i<calificaciones.length; i++){
            System.out.print("Ingresa la calificacion " +(i + 1) + ": ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }

        // Promedio de calificaciones
        var sumaCalificaciones = 0;
        for (var i=0; i < calificaciones.length; i++) {
            sumaCalificaciones += calificaciones[i];
        }
        var promedio = sumaCalificaciones/calificaciones.length;
        System.out.println("\nPromedio de las calificaciones: " + promedio);

    }
}
