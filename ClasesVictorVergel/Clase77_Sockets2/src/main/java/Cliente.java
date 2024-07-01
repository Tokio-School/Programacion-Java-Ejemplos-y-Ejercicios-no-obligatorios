import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {
	private static final int numero_Cliente = (int) (Math.random()*100);

	public static void main(String[] args) {
		try (Socket socket = new Socket("localhost", 4444);){
			System.out.println("Cliente_"+numero_Cliente+". Conectado al servidor");
			
			OutputStream os=socket.getOutputStream();
			ObjectOutputStream oos=new ObjectOutputStream(os);
			
			Scanner scanner=new Scanner(System.in);
			boolean enviandoMensajes=true;
			

			InputStream is=socket.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(is);
			ClienteReceptor receptor=new ClienteReceptor(ois);
			receptor.start();
			
			while(enviandoMensajes)
			{
				System.out.println("Introduce un texto a enviar");
				String texto=scanner.nextLine();
	
				Mensaje mensaje=new Mensaje("cliente_"+numero_Cliente,"Hola servidor, te envío: "+texto);
				oos.writeObject(mensaje);
			}
			
			
			
			oos.close();
			os.close();
			ois.close();
			is.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
