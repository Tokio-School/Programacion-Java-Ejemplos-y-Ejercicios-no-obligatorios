import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static java.nio.file.StandardCopyOption.*;
//import java.nio.file.StandardCopyOption;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");
		//System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.dir"));
		
		Path ruta=Paths.get("fichero.txt");
		
		if (!Files.exists(ruta)) {
			System.out.println("El fichero no existe");
			try {
				Files.createFile(ruta);
				Files.writeString(ruta, "Hola mundo");
				Files.createDirectory(Paths.get("directorio"));
				//Files.copy(ruta, Paths.get("directorio/fichero.txt"));
				Files.copy(ruta, Paths.get("directorio/fichero.txt"), REPLACE_EXISTING);
				Files.delete(ruta);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.println("El fichero existe");
		}
		
		
		
	}

}
