package Ventas;

import com.sun.security.jgss.GSSUtil;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");
        var producto1 = new Producto("Blusa", 30.0);
        //System.out.println(producto1);
        var producto2 = new Producto("Zapatos", 50.0);
        //System.out.println(producto2);

        // Primer orden
        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();


    }
}
