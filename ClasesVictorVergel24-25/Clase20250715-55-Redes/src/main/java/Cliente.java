import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 4444);){
			System.out.println("Me he conectado al servidor");
			
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Espera 5 segundos antes de enviar el mensaje
			
			//oos.writeObject("Hola, soy el cliente");
			oos.writeObject(new Mensaje("Hola, soy el cliente"));

			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			String mensaje = (String) ois.readObject();
			System.out.println("Mensaje recibido del servidor: " + mensaje);
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
	}

}
