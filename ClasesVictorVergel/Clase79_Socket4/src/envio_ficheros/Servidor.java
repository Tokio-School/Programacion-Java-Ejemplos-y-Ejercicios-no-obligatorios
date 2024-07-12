package envio_ficheros;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ServerSocket socketServidor = new ServerSocket(4444);
			 Socket socketCliente = socketServidor.accept();)
		{
			InputStream is=socketCliente.getInputStream();
			
			File fichero=new File("fichero_recibido.txt");
			FileOutputStream fos=new FileOutputStream(fichero);
			
			
			byte[] buffer=new byte[1024];
			fos.write(is.readAllBytes());

		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
