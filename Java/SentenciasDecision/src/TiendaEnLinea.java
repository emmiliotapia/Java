import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        /*
        Crear un sistema que ofrezca descuentos dependiendo del monto de la compra, o si es
        miembro de la tienda.
        Se deben revisar las siguientes condiciones:
            1. Si ha comprado mas de $1000 y es miembre > Descuento del 10%
            2. Si solo es miembro de la tienda > Descuento del 5%
            3. Si no es miembro ni compro mas de $1000 > Descuento 0%
         */
        System.out.println("*** Tienda En Linea ***");

        var consola = new Scanner(System.in);
        System.out.print("Ingresa el monto de compra: ");
        var montoDeCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Es miembro (true/false)?: ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());

        double descuento;
        double montoFinal;


        if (montoDeCompra > 1000 && esMiembro) {
            descuento = 0.10;
        }
        else if (esMiembro) {
            descuento = 0.05;
        }
        else {
            descuento = 0.0;
        }

        // Aplicar descuento
        montoFinal = montoDeCompra * (1 - descuento);
        var descuentoFinal = montoDeCompra * descuento;
        if (descuento > 0){
            System.out.printf("""
                ------------------
                Ticket de Venta:
                Felicidades! Has obtenido un descuento del %.0f%%
                Total Compra: $%.2f
                Descuento: ($%.0f)
                TOTAL: $%.2f
                """,descuento * 100, montoDeCompra, descuentoFinal, montoFinal);
        }
        else {
            System.out.printf("""
                ------------------
                Ticket de Venta: 
                Total Compra: $%.2f
                Descuento: ($%.0f)
                TOTAL: $%.2f
                """, montoDeCompra, descuentoFinal, montoFinal);
        }

    }
}
