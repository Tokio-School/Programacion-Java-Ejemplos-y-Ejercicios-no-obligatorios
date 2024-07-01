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
			while(finalizarServidor==false)
			{
				Socket socket=servidor.accept();
				System.out.println("Cliente conectado");
				ObjectInputStream ois=new ObjectInputStream(socket.getInputStream());
				Mensaje mensaje=(Mensaje)ois.readObject();
				System.out.println(mensaje);
				
				
				ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
				canales_salida.add(oos);
				canales_salida.forEach((oos1) -> {
					try {
						oos1.writeObject("Hola " + mensaje.getNombre_cliente() + ", soy el servidor");
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});

				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
