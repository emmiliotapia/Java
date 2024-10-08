import java.util.Scanner;

public class MatrizDinamica {
    public static void main(String[] args) {
        // Introducir valores a una matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);

        // Definir matriz
        System.out.print("Ingresa los renglones de la matriz: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa las columnas de la matriz: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];

        // Solicitar los valores
        for(var i=0; i < renglones; i++) {
            for (var j=0; j < columnas; j++){
                System.out.print("Valor["+i+"]["+j+"] = ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        // Interar Valores de la matriz
        System.out.println("\n*** Valores de nuestra matriz ***");
        for(var i=0; i < renglones; i++) {
            for (var j=0; j < columnas; j++){
                System.out.println("Valor["+i+"]["+j+"] = " + matriz[i][j]);
            }
        }


    }
}
