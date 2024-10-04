import java.util.Scanner;

public class IdentificaEstacionDelAnio {
    public static void main(String[] args) {
        System.out.println("*** Identifica la Estacion del Año ***");
        /*
        Se solicita proporcionar el valor de un mes ( valor numerico entre 1 y 12), e indicar la estacion del
        año segun lo siguiente:
            Meses: 1, 2 o 12  > Invierno
            Meses: 3, 4 o 5   > Primavera
            Meses: 6, 7 u 8   > Verano
            Meses: 9, 10 u 11 > Otoño
            Cualquier otro mes: Estacion desconocida
         */

        var consola = new Scanner(System.in);
        System.out.print("Ingresa el numero que coresponde al mes (1 -12): ");
        var mesDelAnio = Integer.parseInt(consola.nextLine());

        if (mesDelAnio == 1 || mesDelAnio == 2 || mesDelAnio == 12){
            System.out.println("Invierno");
        }
        else if (mesDelAnio == 3 || mesDelAnio == 4 || mesDelAnio == 5){
            System.out.println("Primavera");
        }
        else if (mesDelAnio == 6 || mesDelAnio == 7|| mesDelAnio == 8) {
            System.out.println("Verano");
        }
        else if (mesDelAnio == 9 || mesDelAnio == 10|| mesDelAnio == 11){
            System.out.println("Otoño");
        }
        else {
            System.out.println("Estacion desconocida");
        }
    }
}
