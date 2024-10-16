import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap();
        persona.put("nombre", "Emilio");
        persona.put("apellido", "Tapia");
        persona.put("edad", "32");

        System.out.println("Valores del mapa o diccionario: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("edad", "35"); // Modificar el valor de la llave existente
        persona.remove("apellido");
        System.out.println("\nNuevos valores del mapa: ");
        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterando los elementos en forma de (llave/valor)");
        persona.forEach((llave, valor) -> System.out.println("Llave: " + llave + ", Valor: " + valor));

    }
}
