package sokects_serializable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMaligno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Socket socket = new Socket("localhost", 4444);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());){
			
			MensajeMaligno mensaje = new MensajeMaligno();
			oos.writeObject(mensaje);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
