package persona;

public class PruebaPersona {
    public static void main(String[] args) {



        System.out.println("Variable estatica: " + Persona.getContadorPersonas());

        var persona1 = new Persona("Stephanny", "Solis");

        System.out.println(persona1); // Automaticamente se manda llamar el metodo toString

        var persona2 = new Persona("Emmilio", "Tapia");
        System.out.println(persona2);

        System.out.println("Variable estatica: " + Persona.getContadorPersonas());

    }
}
