import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Emilio");
        conjunto.add("Fanny");
        conjunto.add("Fanny");
        conjunto.add("David");

        conjunto.forEach(System.out::println);

        // Remover un elemento
        conjunto.remove("David");
        System.out.println("\nNuevos elementos del set: ");
        conjunto.forEach(System.out::println);
    }
}
