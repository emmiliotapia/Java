import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class InformacionDinamica {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        // Declarar arreglo
        System.out.print("Proporciona el largo de tu arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        // Creamos arreglo
        var enteros = new int[largoArreglo];

        // Solicitar valores arreglo
        for (var i=0; i < largoArreglo; i++){
            System.out.print("Proporciona el valor entero[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        // Imprimir valores del arreglo
        for (var i = 0; i < enteros.length; i++) {
            System.out.println("Enteros["+i+"] = " + enteros[i]);
        }
    }
}
