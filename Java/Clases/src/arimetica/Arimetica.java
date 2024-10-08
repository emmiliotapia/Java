package arimetica;

public class Arimetica {
    int operando1;
    int operando2;

    // Constructor vacio
    public Arimetica() {}

    public Arimetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void suma(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Resultado de la suma = " + resultado);
    }

    public void resta(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resultado de la resta = " + resultado);
    }

    void multiplicacion(){
        var resultado = this.operando1 * this.operando2;
        System.out.println("Resultado de la multiplicacion = " + resultado);
    }

    void division(){
        var resultado = this.operando1 / this.operando2;
        System.out.println("Resultado de la division = " + resultado);
    }


}

