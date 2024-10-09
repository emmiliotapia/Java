package arimetica;

public class PruebaArimetica {
    public static void main(String[] args) {
        System.out.println("*** Prueba Arimetica ***");
        var arimetica1 = new Arimetica();

        arimetica1.setOperador1(10);
        arimetica1.setOperador2(15);
        System.out.println(arimetica1.getOperador1());
        System.out.println(arimetica1.getOperador2());

        arimetica1.suma();
        arimetica1.resta();

    }

}
