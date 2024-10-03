public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres Especiales
        // \n - imprimir un salto de linea
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);
        
        // \t - tabulacion
        var cadena2 = "\t Hola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // \' - agrega comilla simple
        var cadena3 = "Hola \' Mundo";
        System.out.println("cadena3 = " + cadena3);

        // \" - agrega comilla doble
        var cadena4 = "Hola \" Mundo";
        System.out.println("cadena4 = " + cadena4);
        
        // \\ - agregar diagonal invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);

    }
}

