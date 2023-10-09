public class Ejem04_CadenasTexto {
    public static void main(String[] args) {
    	String frase="Esto es una frase de ejemplo.mundo";
        // Dividir una cadena en substrings
        String palabras[] = frase.split(" ");
        System.out.println("Palabras en la frase:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Reemplazar texto en una cadena
        String nuevoTexto = frase.replace("mundo", "Java");
        System.out.println("Reemplazo: " + nuevoTexto);

        // Eliminar espacios en blanco al principio y al final
        String cadenaConEspacios = "   Esto tiene espacios en blanco   ";
        String cadenaSinEspacios = cadenaConEspacios.trim();
        System.out.println("Sin espacios en blanco: " + cadenaSinEspacios);

        // Verificar si una cadena comienza o termina con un prefijo o sufijo
        String archivo = "documento.txt";
        boolean comienzaConPrefijo = archivo.startsWith("doc");
        boolean terminaConSufijo = archivo.endsWith(".txt");
        System.out.println("Comienza con 'doc': " + comienzaConPrefijo);
        System.out.println("Termina con '.txt': " + terminaConSufijo);

        // Obtener una subcadena
        String textoCompleto = "Ejemplo de subcadena";
        String subcadena = textoCompleto.substring(8, 16);
        System.out.println("Subcadena: " + subcadena);
        
        //Cast a String
        int datoNumero=33;
        String cadenaDatoNumero=String.valueOf(datoNumero);
        
        

    }
}
