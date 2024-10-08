package prueba;

import arimetica.Arimetica;

public class PruebaArimetica {
    public static void main(String[] args) {
        System.out.println("*** Prueba Arimetica ***");
        var arimetica1 = new Arimetica(5, 7);
        arimetica1.suma();
        arimetica1.resta();
    }

}
