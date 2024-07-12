import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Servidor {

	//static ArrayList<ObjectOutputStream> canales_salida=new ArrayList<ObjectOutputStream>();
	static HashMap<String, ObjectOutputStream> canales_salida = new HashMap<String, ObjectOutputStream>();
	
	
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
				//Leemos un mensaje inicial simplemente para conocer el nombre del cliente conectado
				String nombreCliente=null;
				try {
					nombreCliente = (String) ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ReceptorMensajesCyS receptor=new ReceptorMensajesCyS(ois);
				receptor.start();
				ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
				canales_salida.put(nombreCliente, oos);
			}
			//}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	public static void enviarMensaje(Mensaje mensaje) {
		for (Map.Entry<String, ObjectOutputStream> entry : canales_salida.entrySet()) {
			try {
				entry.getValue().writeObject(mensaje);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Mensaje enviado: a "+canales_salida.size()+" clientes");
	}
}
