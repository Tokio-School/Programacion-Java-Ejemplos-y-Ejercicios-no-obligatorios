import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Socket socket=new Socket("localhost",4444);
			Scanner scanner=new Scanner(System.in);){
			System.out.println("Ya me he conectado al servidor");
			OutputStream outputStream=socket.getOutputStream();
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(outputStream);
			String mensaje=null;
			do
			{
				mensaje=scanner.nextLine();
				objectOutputStream.writeObject(mensaje);
			} while(!mensaje.equals("fin"));
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
