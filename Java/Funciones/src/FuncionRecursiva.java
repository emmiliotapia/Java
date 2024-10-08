public class FuncionRecursiva {

    // Imprimir 1 al 5 usando una funcion recursiva
    // Funcion recursiva

    static void funcionRecursiva(int numero){
        // Caso base
        if (numero == 1){
            System.out.print(numero + " ");
        }
        else {
            // Caso Recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {

        funcionRecursiva(3);
    }
}
