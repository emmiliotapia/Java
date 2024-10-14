package VentasEmilio;

public class PruebaVentas {
    public static void main(String[] args) {

        var producto1 = new Producto("Soda", 30);
        var producto2 = new Producto("Sabritas", 35.5);
        System.out.println(producto1);
        System.out.println(producto2);

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);


        orden1.mostrarProductos();

    }
}
