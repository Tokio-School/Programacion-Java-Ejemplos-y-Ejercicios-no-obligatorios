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
			oos.writeObject("Cliente_"+numero_Cliente);
			
			Scanner scanner=new Scanner(System.in);
			boolean enviandoMensajes=true;
			

			InputStream is=socket.getInputStream();
			ObjectInputStream ois=new ObjectInputStream(is);
			ReceptorMensajesCyS receptor=new ReceptorMensajesCyS(ois);
			receptor.start();
			
			while(enviandoMensajes)
			{
				System.out.println("Introduce un texto a enviar");
				String texto=scanner.nextLine();
	
				Mensaje mensaje=new Mensaje("Cliente_"+numero_Cliente,texto);
				oos.writeObject(mensaje);
				if (texto.equals("fin")) {
					enviandoMensajes = false;
				}
			}
			receptor.interrupt();
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
