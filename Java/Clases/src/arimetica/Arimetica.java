package arimetica;

public class Arimetica {
    private int operador1;
    private int operador2;

    // Constructor vacio
    public Arimetica() {}

    public Arimetica(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    // Metodos

    public void suma(){
        var resultado = this.operador1 + this.operador2;
        System.out.println("Resultado de la suma = " + resultado);
    }

    public void resta(){
        var resultado = this.operador1 - this.operador2;
        System.out.println("Resultado de la resta = " + resultado);
    }

    public void multiplicacion(){
        var resultado = this.operador1 * this.operador2;
        System.out.println("Resultado de la multiplicacion = " + resultado);
    }

    public void division(){
        var resultado = this.operador1 / this.operador2;
        System.out.println("Resultado de la division = " + resultado);
    }

    // Setter and Getter


    public int getOperador1() {
        return this.operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return this.operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

}

