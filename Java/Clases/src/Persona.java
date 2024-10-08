public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de clases y objeto del tipo persona ***");
        var objeto1 = new Persona();
        objeto1.nombre = "Emilio";
        objeto1.apellido = "Tapia";
        objeto1.mostrarPersona();

        System.out.println();

        var objeto2 = new Persona();
        objeto2.nombre = "Stephanny";
        objeto2.apellido = "Solis";
        objeto2.mostrarPersona();
    }
}
