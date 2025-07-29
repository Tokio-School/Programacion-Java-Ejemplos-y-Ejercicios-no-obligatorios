import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;

public class Servidor {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		try (ServerSocket servidor = new ServerSocket(4444);
			 ){
			Socket socket=null;
			for (int i = 0; i < 5; i++) {
				socket = servidor.accept();
				ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
				output.writeObject("Hola, cliente!");
			}
			
			ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

			System.out.println("Mensaje: " + input.readObject());
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
