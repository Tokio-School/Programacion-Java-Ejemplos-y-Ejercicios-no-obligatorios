package ejem04_excepcionesComprobadasYNo;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Aplicacion2 {

    public static void main(String[] args) {
        try {
            // Intentar leer un archivo que no existe
            leerArchivo("archivo_que_no_existe.txt");
        } catch (IOException e) {
            System.out.println("Error: Archivo no encontrado o error de lectura.");
            System.out.println(e.getMessage());
        }
    }

    // Excepción no comprobada- unchecked
    private static void leerArchivo(String nombreArchivo) throws IOException {
        // Crear un objeto Path a partir del nombre del archivo
        Path path = Paths.get(nombreArchivo);

        // Intentar leer el archivo utilizando el constructor de Scanner con Path y charsetName
        try (Scanner fileReader = new Scanner(path, "UTF-8")) {
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (IOException e)
        {
        	throw new IOException("Fichero noooo encontrado");
        }
    }
}


