public class Matrices {
    public static void main(String[] args) {
        // Definimos una matriz
        // int[][] matriz = new int[2][3];
        final var RENGLONES = 2;
        final var COLUMNAS = 3;
        var matriz = new int[RENGLONES][COLUMNAS];

        // Modificar valores de la matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Recorrer una matriz
        // Recorrer renglones
        for (var i = 0; i < RENGLONES; i++){
            // Recorrer columnas
            for (var j = 0; j < COLUMNAS; j++) {
                System.out.println("Valor["+i+"]["+j+"] es: " + matriz[i][j]);
            }
        }


    }

}
