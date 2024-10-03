import java.util.Scanner;

public class SistemasDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuentos VIP ***");
        /*
        Una tienda de supermercado ofrece un descuento especial a clientes que compren 10 o mas articulos por
        dia Y ademas sean miembros de la tienda.

        El sistema debe solicitar al cliente que indique cuantos articulos ha comprado en el dia y preguntarle
        si cuenta con la membresia de la tienda.

        En el caso de haber comprado 10 o mas productos y ser miembro de la tienda entonces tendra acceso al
        descuento VIP
         */

        final var NO_PRODUCTOS_DESCUENTO = 10;

        System.out.print("Ingresa cuantos articulos ha comprado: ");
        var cantidadProductos = Integer.parseInt(new Scanner(System.in).nextLine());

        System.out.print("Es miembro de la tienda? (true/false): ");
        var tieneMembresia = Boolean.parseBoolean(new Scanner(System.in).nextLine());

        // Aplica descuento?
        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tieneMembresia;
        System.out.println("Tiene Descuento VIP: " + esElegibleDescuento);




    }
}
