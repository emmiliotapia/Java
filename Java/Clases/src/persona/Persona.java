package persona;

import java.sql.SQLOutput;

public class Persona {
    private String nombre;
    private String apellido;

    // Constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(){}

    void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    void saludo() {
        System.out.println("Hola, me llamo " + this.nombre + " y mi apellido es " + apellido);
    }

    // Setters and Getters


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
