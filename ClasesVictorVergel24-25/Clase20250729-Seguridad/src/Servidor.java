import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket=null;
		try (ServerSocket serverSocket = new ServerSocket(4444);){
				socket = serverSocket.accept();

				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				
				
				// Problema
				//ois.readObject();
				// Solución
				Object objetoRecibido=null;
				if ((objetoRecibido=ois.readObject()) instanceof Mensaje) {
					Mensaje mensaje = (Mensaje) ois.readObject();
					System.out.println("Mensaje recibido: " + mensaje.getDato());
				} else {
					throw new SecurityException("Objeto recibido no es un Mensaje");
					//System.out.println("Objeto desconocido recibido");
				}

			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Se ha conectado alguien");

		
		
	}

}
