import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {

	static ArrayList<ObjectOutputStream> canales_salida=new ArrayList<ObjectOutputStream>();
	
	
	public static void main(String[] args) {
		boolean finalizarServidor=false;
		
		try (ServerSocket servidor = new ServerSocket(4444);){
/*			for(int i=0;i<2;i++)
			{*/	
			while(!finalizarServidor)
			{
				Socket socket=servidor.accept();
				System.out.println("Cliente conectado");
				ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
				ReceptorMensajesCyS receptor=new ReceptorMensajesCyS(ois);
				receptor.start();
				ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
				canales_salida.add(oos);
			}
			//}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public static void enviarMensaje(Mensaje mensaje) {
		for (ObjectOutputStream oos : canales_salida) {
			try {
				oos.writeObject(mensaje);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
