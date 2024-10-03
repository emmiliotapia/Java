import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        /* Sistema de Empleados
            Se solicita crear un programa para pedir la informacion de un empleado. Los datos solicitados
            se deben introducir por consola.
                * Nombre del empleado
                * Edad (int)
                * Salario (double)
                * Es jefe de depto. (boolean)
            Una vez se han capturado los datos, se deben de mandar a imprimir por consola.
         */

        System.out.println("*** Sistema de Empleados ***");

        // Captura de Datos
        var consola = new Scanner(System.in);

        // Nombre del empleado
        System.out.print("Ingresa el nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // Edad del empleado
        System.out.print("Ingresa la edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del empleado
        System.out.print("Ingresa el salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Jefe de depto
        System.out.print("El empleado es jefe de departamento (true/false)?: ");
        var esJefe = Boolean.parseBoolean(consola.nextLine());

        // Impresion de datos en consola:
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre = " + nombreEmpleado);
        System.out.println("\tEdad = " + edadEmpleado + " años.");
        //System.out.println("\tSalario = " + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs Jefe de Departamento? = " + esJefe);

    }
}
