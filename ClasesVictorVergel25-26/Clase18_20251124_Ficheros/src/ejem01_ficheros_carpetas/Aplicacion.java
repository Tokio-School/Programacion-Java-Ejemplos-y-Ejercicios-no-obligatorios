package ejem01_ficheros_carpetas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path fichero=Path.of("archivo.txt");
		if (Files.exists(fichero)) {
			System.out.println("El fichero existe");
			try {
				Files.writeString(fichero, "Hola mundo");
				Files.createDirectories(Paths.get("carpeta3"));
				Files.copy(fichero, Paths.get("carpeta3/archivo_copiado.txt"));
				Files.delete(fichero);
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else {
			System.out.println("El fichero no existe");
		}
		
	}

}
