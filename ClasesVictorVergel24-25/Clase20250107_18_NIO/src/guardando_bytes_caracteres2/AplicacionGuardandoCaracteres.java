package guardando_bytes_caracteres2;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class AplicacionGuardandoCaracteres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream archivo = new FileOutputStream("datosCaracteres.txt");
			ObjectOutputStream escritura = new ObjectOutputStream(archivo);){
			//escritura.writeObject("Hola");
			MiTipoDato dato = new MiTipoDato();
			dato.setValor(10);
			escritura.writeObject(dato);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
