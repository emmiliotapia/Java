public class StephGenerador {
    public static void main(String[] args) {

        System.out.println(" *** Generador De Emails de mi novia ***");

        var nombre = "  Stephanny Mayte Solis Dominguez    ";
        var empresa = "Amo a Emilio";
        var dominio = "com.mx";

        var nombreModificado = nombre.trim().toLowerCase().replace(" ", ".");
        System.out.println("nombreModificado = " + nombreModificado);
        
        var empresaModificado = empresa.toLowerCase().replace(" ", "");
        System.out.println("empresaModificado = " + empresaModificado);

        System.out.println(nombreModificado + "@" + empresaModificado + "." + dominio);



    }
}
