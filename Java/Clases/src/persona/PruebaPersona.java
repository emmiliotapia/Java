package persona;

public class PruebaPersona {
    public static void main(String[] args) {

        var persona1 = new Persona();

        persona1.setNombre("Stephanny");
        persona1.setApellido("Solis");

        persona1.mostrarPersona();
        persona1.saludo();

        var persona2 = new Persona("Emilio", "Tapia");
        persona2.saludo();

    }
}
