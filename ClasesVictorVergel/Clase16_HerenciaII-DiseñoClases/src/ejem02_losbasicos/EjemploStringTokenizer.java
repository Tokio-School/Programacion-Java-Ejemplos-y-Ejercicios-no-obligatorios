package ejem02_losbasicos;

import java.util.StringTokenizer;

public class EjemploStringTokenizer {
    public static void main(String[] args) {
        String frase = "Este es un ejemplo de StringTokenizer";
        
        // Crear un StringTokenizer utilizando un espacio en blanco como delimitador
        StringTokenizer tokenizer = new StringTokenizer(frase, " ");

        // Recorrer y mostrar los tokens
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token: " + token);
        }
    }
}
