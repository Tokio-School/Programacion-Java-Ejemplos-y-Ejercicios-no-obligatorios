package envio_ficheros;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Socket socketServidor = new Socket("localhost", 4444);)
		{
			File fichero = new File("datos.txt");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fichero));

			socketServidor.getOutputStream().write(bis.readAllBytes());

		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
