import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        /* Crear un programa para solicitar los valores mas importantes de una receta de cocina.
           Los valores que deben de introducir el usuario son:
                * Nombre de la receta
                * Ingredientes principales
                * Tiempo de preparacion (min)
                * Dificultad (Facil, Media o Alta)
         */

        var consola = new Scanner(System.in);
        // Captura de datos
        System.out.println("*** Receta de Cocina ***");
        System.out.print("Ingresa el nombre: ");
        var nombreReceta = consola.nextLine();
        System.out.print("Ingresa los ingredientes: ");
        var ingredientesReceta = consola.nextLine();
        System.out.print("Ingrega el tiempo de preparacion (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa la dificultad (Facil/Medio/Dificil): ");
        var dificultadReceta = consola.nextLine();

        // Impresion de datos en consola
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientesReceta);
        System.out.println("\tTiempo de preparacion: " + tiempoPreparacion + " min");
        System.out.println("\tDificultad: " + dificultadReceta);
        System.out.println();
        System.out.println("*** Finalizado ***");


    }
}
