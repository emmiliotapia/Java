import java.util.Scanner;

public class DiagonalMatriz {
    public static void main(String[] args) {
        // Definir matriz manera dinamica
        var consola = new Scanner(System.in);
        System.out.print("Ingresa cuantos renglones tiene la matriz: ");
        var renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa cuantas columnas tiene la matriz: ");
        var columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];

        // Ingreso de valores en matriz
        for (var i=0; i < renglones; i++ ){
            for (var j=0; j < columnas; j++) {
                System.out.print("Valor ["+i+"]["+j+"] = ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        var suma = 0;
        for (var i=0; i < renglones; i++) {
            for (var j=0; j < columnas; j++) {
                if (i == j) {
                    suma += matriz[i][j];
                }
            }
        }
        System.out.println("La suma de la diagonal en tu matriz es: " + suma);
    }
}
