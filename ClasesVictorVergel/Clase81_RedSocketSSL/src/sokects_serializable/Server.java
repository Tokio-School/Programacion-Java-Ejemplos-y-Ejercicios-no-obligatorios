package sokects_serializable;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (ServerSocket server = new ServerSocket(4444);){
			Socket socket=server.accept();
			InputStream is=socket.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(is);
			System.out.println(ois.readObject());
			
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
