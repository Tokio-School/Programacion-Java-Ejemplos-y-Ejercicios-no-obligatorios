package ejem01_losbasicos;

import java.util.Iterator;
import java.util.StringTokenizer;

public class EjemploStringTokenizer {
	
    public static void main(String[] args) {
        String frase = "Este es un ejemplo de StringTokenizer";
        
        // Crear un StringTokenizer utilizando un espacio en blanco como delimitador
        StringTokenizer tokenizer = new StringTokenizer(frase, " ");

        System.out.println("---"+tokenizer.countTokens());
        
        // Recorrer y mostrar los tokens
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token1: " + token);
        }
        
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Token2: " + token);
        }
        
        String[] result = "this is a test".split("\\s");
        for (int x=0; x<result.length; x++)
            System.out.println(result[x]);
        
    }
}
