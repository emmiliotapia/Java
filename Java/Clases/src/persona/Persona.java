package persona;

public class Persona {
    private static int contadorPersonas = 0;
    private int idUnico;
    private String nombre;
    private String apellido;

    // Constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        // Asignamos el id unico con ayuda del valor estatico
        this.idUnico = ++Persona.contadorPersonas;
    }

    public Persona(){}

    // Metodos
    @Override
    public String toString(){
        return
                "ID unico : " + this.idUnico +
                ", Nombre: " + this.nombre + ", Apellido: " + this.apellido
        + ", Dir. Mem. " + super.toString();
    }

    // Setters and Getters

    public int getIdUnico(){
        return this.idUnico;
    }

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

    public static int getContadorPersonas(){
        return Persona.contadorPersonas;
    }
}
