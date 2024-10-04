import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {
        /*
        Se solicita crear una aplicacion de salud y fitness que solicite lo siguiente:
            * Nombre del usuario
            * Pasos caminados en el dia
        Ademas definiremos las siguientes constantes:
            META_PASOS_DIARIOS: 10,000
            CALORIAS_POR_PASO: 0.04 // Valor aproximado en calorias

        Con los valores anteriores debemos calcular las calorias quemadas segun los pasos caminados.
        calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO

        Y verificaremos si se cumplio la meta de pasos diarios
        meta_alcanzada = pasos_diarios >= META_DE_PASOS_DIARIO
         */
        System.out.println("*** Salud y Fitness ***");

        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu nombre de usuario: ");
        var user = consola.nextLine();
        System.out.print("Ingresa cuantos pasos realizaste en el dia: ");
        var pasosRealizados = Integer.parseInt(consola.nextLine());

        var metaAlcanzada = pasosRealizados >= META_PASOS_DIARIO ? "Si :)" : "No :(";
        var caloriasQuemadas = pasosRealizados * CALORIAS_POR_PASO;

        // Impresion en consola
        System.out.printf("""
                %nUsuario: %s
                Pasos realizados hoy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diarios alcanzada: %s
                -----------------------------------
                La meta de pasos diarios es de: %d
                """, user, pasosRealizados, caloriasQuemadas, metaAlcanzada, META_PASOS_DIARIO);



    }
}
