public class SentenciaIf {
    public static void main(String[] args) {

        // Uso de la sentencia if
        var edad = 16;

        if(edad >=18){
            System.out.println("Mayor de edad");
        }
        else if(edad >= 13 && edad < 18){
            System.out.println("Eres un adolecente");
        }
        else {
            System.out.println("Eres un niño");
        }
    }
}
