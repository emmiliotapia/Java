public interface Traductor {
    // public y abstract
    void traducir();

    // Metodos con implementacion por default
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

class Ingles implements Traductor{
    @Override
    public void traducir() {
        System.out.println("Traduzco en Ingles");
    }
}

class Frances implements Traductor{

    @Override
    public void traducir() {
        System.out.println("Traduczo en Frances");
    }
    @Override
    public void iniciarTraductor(){
        System.out.println("Iniciando traductor en frances...");
    }
}

class PruebaTraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();

        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();


    }
}
