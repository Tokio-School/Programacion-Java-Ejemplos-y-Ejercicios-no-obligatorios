package guardando_bytes_caracteres;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AplicacionGuardando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream("FicheroEscrituraBytes.txt");){
			//fos.write(65);
			byte holaMundo[]= {72, 111, 108, 97, 32, 77, 117, 110, 100, 111};
			fos.write(holaMundo);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try (FileInputStream fis = new FileInputStream("FicheroEscrituraBytes.txt");){
			System.out.println("Contenido del fichero:");
			while (fis.available() > 0) {
				System.out.print((char) fis.read());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
