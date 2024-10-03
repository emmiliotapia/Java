import java.util.Scanner;

public class SistemaPrestamosLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Prestamo de Libros ***");

        /*
        Se pide crear un sistema para una biblioteca, la cual desea prestar libros si cumple con cualquiera de la
        siguientes condiciones:
            1. El usuario tiene credencial de estudiante.
            2. El usuario vive a no mas de 3km a la redonda.

        Si cumple con cualquiera de estas condiciones se le puede prestar libro.
         */

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("Tienes credencial de Estudiante?: (true/false) ");
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuantos KM vives de la biblioteca?: ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        // Eligibilidad
        var esElegiblePrestamo = tieneCredencial || distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM;
        System.out.println("Es elegible para prestamo: " + esElegiblePrestamo);

    }
}
