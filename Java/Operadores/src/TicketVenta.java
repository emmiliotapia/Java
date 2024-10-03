import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generacion de Ticket de Venta ***");
        /*
        Supongamos que compramos varios articulos en el supermercado y queremos obtener el ticket
        de venta total incluyendo impuestos.

        El sistema solicitara el precio de cada producto a comprar y el usuario debera indiciar su
        precio (valor de tipo con punto decimal)

        El sistema debe realizar la suma de cada producto, calcular el impuesto y finalmente imprimir
        el total de la compra.
        */

        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio platanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algun descuento (%)? ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Calculo subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        // Aplicar el el descuento
        var descuento = subtotal * (descuentoPorcentaje/100.0);
        System.out.println("descuento = " + descuento);

        // Subtotal con descuento
        var subTotalDescuento = subtotal - descuento;

        // Calculo con Impuestos
        var impuesto = subTotalDescuento * 0.16;

        // Calculo TOTAL
        var costoTotalCompra = subTotalDescuento + impuesto;

        // Imprimir ticket de venta
        System.out.printf("""
                %nTicket de Venta
                %n--------------------
                Subtotal:                 $%.2f
                Descuento:                 $%.2f (%d%%)
                Impuesto (16%%):           $%.2f
                Costo TOTAL de la compra: $%.2f
                """, subtotal, descuento, descuentoPorcentaje, impuesto, costoTotalCompra);

    }
}
