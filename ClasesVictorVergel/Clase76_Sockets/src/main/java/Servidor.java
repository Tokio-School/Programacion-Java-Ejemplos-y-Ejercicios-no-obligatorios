import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (ServerSocket serverSocket=new ServerSocket(4444);){
			Socket socket=serverSocket.accept();
			System.out.println("Cliente conectado");
			InputStream inputStream=socket.getInputStream();
			ObjectInputStream objectInputStream=new ObjectInputStream(inputStream);
			String mensaje=null;
			do
			{
				mensaje=(String) objectInputStream.readObject();
				System.out.println(mensaje);
			} while(!mensaje.equals("fin"));
				
			
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
