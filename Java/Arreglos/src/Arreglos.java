public class Arreglos {
    public static void main(String[] args) {
        // Arreglos
        var enteros = new int[5];

        // Modificar elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = enteros[0]+enteros[1];

        // Leer elementos de un arreglo
        // System.out.println(enteros[4]);

        // Sintaxis Simplificada de Arreglos
        var enteros2 = new int[]{100, 200, 300, 400, 500};

        // Iterar cada uno de los elementos del array
        for (var i = 0; i < enteros2.length; i++) {
            System.out.print(enteros2[i] + " ");
        }


    }
}
