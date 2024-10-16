import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Luningo");

//        for (String elemento: miLista){
//            System.out.println("Dia de la semana " + elemento);
//        }

        // Funciones Lambda (funcion anonima de un codigo muy compacto)
//        miLista.forEach(elemento -> {
//            System.out.println("Elemento: " + elemento);
//        });

        // Metodo de referencia
        miLista.forEach(System.out::println);

        List<String> nombres = Arrays.asList("Emilio", "Fanny", "David", "Lucia");
        System.out.println("\nListas de nombres:");
        nombres.forEach(System.out::println);








    }
}
