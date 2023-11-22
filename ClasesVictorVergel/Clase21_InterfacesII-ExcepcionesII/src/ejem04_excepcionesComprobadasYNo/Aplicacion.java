package ejem04_excepcionesComprobadasYNo;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        try {
            // Intentar leer un archivo que no existe
            leerArchivo("archivo_que_no_existe.txt");
        } catch (Exception e) {
            System.out.println("Error: Archivo no encontrado.");
        }
    }

    private static void leerArchivo(String nombreArchivo) throws java.io.FileNotFoundException {
        try (// Intentar leer un archivo
		Scanner fileReader = new Scanner(nombreArchivo)) {
			System.out.println(fileReader.next());
		}
        
    }

}
