import java.util.Locale;

public class ProyectoGeneradorEmail {
    public static void main(String[] args) {
        /*
        Crea un programa para generar un email a partir de los siguientes datos:
            * Nombre: Jose Emilio
            * Empresa: Mentoring
            * Dominio: com.mx
        Resultado final: jose.emilio.tapia@mentoring.com.mx
         */
        System.out.println("*** Generador de Emails ***");
        var nombre = "Jose Emilio Tapia";
        var empresa = "Mentoring";
        var dominio = "com.mx";

        var stringBuilder = new StringBuilder();
        stringBuilder.append(nombre.replace(" ", ".").toLowerCase());
        stringBuilder.append("@");
        stringBuilder.append(empresa.toLowerCase());
        stringBuilder.append(".");
        stringBuilder.append(dominio);
        var resultadoFinal = stringBuilder.toString();
        System.out.println("resultado = " + resultadoFinal);


    }
}
