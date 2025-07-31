import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ejemplo19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**¿Qué imprime este código?

				

				Opciones:
				A) true si el archivo existe
				B) false si el archivo no existe
				C) true o false
				D) Compila pero lanza IOException*/
		
		Path p = Paths.get("test.txt");
		System.out.println(Files.exists(p));
	}

}
