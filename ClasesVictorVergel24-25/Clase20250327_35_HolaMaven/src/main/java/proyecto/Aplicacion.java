package proyecto;

import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo!");
		
		Persona p = new Persona("Juan", "Perez", 30);
		p.setApellido("Rodriguez");
		System.out.println(p);
		
		String pruebaCadena="hola mundo. esto es una prueba. estamos en el curso de java";
		System.out.println(StringUtils.isBlank(pruebaCadena));
		System.out.println(StringUtils.isNumeric(pruebaCadena));
		System.out.println(StringUtils.capitalize(pruebaCadena));

		
		InputStream inputStream=null;
		try {
			inputStream = Aplicacion.class.getClassLoader().getResourceAsStream("Datos.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if (inputStream == null) {
            System.err.println("No se encontró el archivo: " + "Datos.txt");
            return;
        }

        try (Scanner scanner = new Scanner(inputStream)) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine()); // Imprime línea a línea
            }
        }
        
        System.out.println(System.getProperty("java.version"));
		
	}

}
