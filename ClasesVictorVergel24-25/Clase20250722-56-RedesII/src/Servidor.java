import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Servidor {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ObjectOutputStream> oos_canales= new ArrayList<ObjectOutputStream>();
		
		try (ServerSocket serverSocket = new ServerSocket(4444);){

				while (true) {
					try {
						Socket socket=serverSocket.accept();
						
						System.out.println("Nuevo cliente conectado: " + socket.getInetAddress());
						
						ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
						ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
						oos_canales.add(oos);
						//oos.writeObject("Hola, soy el servidor,bienvenido al servidor");
						
						
						Thread escucharCliente = new Thread(() -> {
							try {
								String mensajeTexto = "";
								do {
									Mensaje mensaje = (Mensaje) ois.readObject();
									mensajeTexto = mensaje.getDato();
									System.out.println("Mensaje recibido: " + mensaje);
									for (ObjectOutputStream canal : oos_canales) {
										// Si el socket del ObjectOutputStream es el mismo que el del ObjectInputStream no enviaría el mensaje
										if (oos!=canal)
											canal.writeObject(mensaje);
									}
								}while (mensajeTexto != null && !mensajeTexto.equalsIgnoreCase("fin")); 
							} catch (IOException | ClassNotFoundException e) {
								e.printStackTrace();
							}
						});
						escucharCliente.start();
						
					} catch (IOException e) {
						e.printStackTrace();
					} /*catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}*/ 
					
				}
			/*});
				
			escucharConexiones.start();

				

			
		*/
		//System.out.println("Se ha conectado alguien");

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}

}
