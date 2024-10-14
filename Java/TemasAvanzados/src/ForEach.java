public class ForEach {
    public static void main(String[] args) {
        int edades[] = {5,10,30,45};
        for(int edad : edades){
            System.out.println("edad = " + edad);
        }

        String nombres[] = {"Mayte", "Emilio", "David", "Lucia"};
        for (String nombre : nombres){
            System.out.println("Nombre = " + nombre);
        }
        
    }
}
