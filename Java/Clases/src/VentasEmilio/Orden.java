package VentasEmilio;

public class Orden {
    private final int ordenId;
    private Producto[] productos;
    private final int MAX_PRODUCTOS = 10;
    private int contadorProductos;
    private static int contadorOrdenes;

    public Orden(){
        this.ordenId = ++Orden.contadorOrdenes;
        this.productos = new Producto[MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }
        else
            System.out.println("Alcanzaste el limite de productos en un orden: "
                    + MAX_PRODUCTOS);

    }

    public double calcularTotal(){
        double total = 0;
        for (int i=0; i < this.contadorProductos; i++){
            var temp = this.productos[i];
            total += temp.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        var totalOrden = this.calcularTotal();
        System.out.println("ID: " + this.ordenId);
        System.out.println("\tTotal de la orden: " + totalOrden);
        for (int i=0; i < this.contadorProductos; i++){
            System.out.println("\t\t" +this.productos[i]);
        }
    }
}
