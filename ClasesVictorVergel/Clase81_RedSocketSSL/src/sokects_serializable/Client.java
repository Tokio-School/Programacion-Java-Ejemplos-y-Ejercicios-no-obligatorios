package sokects_serializable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try (Socket socket = new Socket("192.168.1.21", 4444);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());){
			
			Mensaje mensaje = new Mensaje("Hola mundo");
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
