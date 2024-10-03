public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de Email ***");
        // Nombre de Usuario
        var nombreCompleto = " Jose Emilio Tapia ";
        System.out.println("nombreCompleto = " + nombreCompleto);

        // Procesar o normalizar el nombre del usuario
        // Limpiar los espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        // Reemplazar los espacios en blanco por punto
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        // Convertir a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);
        
        // Datos de la empresa
        var nombreEmpresa = " Global Mentoring ";
        System.out.println("\nNombre Empresa:" + nombreEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("Extension del dominio: " + extensionDominio);
        
        // Quitamos los espacios en blanco y convertivos a minusculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("Dominio Email Normalizado = " + dominioEmailNormalizado);

        // Creamos email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("\nEmail Final = " + emailNormalizado);
        System.out.println();
        System.out.println("*** Finalizado ***");
        
    }
}
