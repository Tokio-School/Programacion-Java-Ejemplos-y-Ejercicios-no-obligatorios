import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Socket socket = new Socket("localhost", 4444);){
			
			
			ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
			try {
				System.out.println("Mensaje: "+input.readObject());;
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
