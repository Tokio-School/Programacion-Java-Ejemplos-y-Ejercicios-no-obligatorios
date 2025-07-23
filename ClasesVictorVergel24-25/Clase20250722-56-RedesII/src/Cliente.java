import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Cliente {

	static String mensajeTexto = "";
	public static void main(String[] args) {
		
		
		
		
		
		try (Socket socket = new Socket("localhost", 4444);){
			System.out.println("Me he conectado al servidor. Escriba fin para finalizar");
			
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // Espera 5 segundos antes de enviar el mensaje
			Thread escribirServidor = new Thread(() -> {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Escribe tu nombre:");
				String nombre = scanner.nextLine();
				
				do{
					System.out.println("Escribe un mensaje para enviar al servidor:");
					mensajeTexto = scanner.nextLine();
					try {
						oos.writeObject(new Mensaje(mensajeTexto,nombre));
					} catch (IOException e) {
						e.printStackTrace();
					}
				}while (!mensajeTexto.equalsIgnoreCase("fin"));
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
			escribirServidor.start();
			//oos.writeObject("Hola, soy el cliente");
			//oos.writeObject(new Mensaje("Hola, soy el cliente"));

			
			while (!mensajeTexto.equalsIgnoreCase("fin")) {
				try {
					Mensaje mensaje = (Mensaje) ois.readObject();
					System.out.println("Mensaje recibido del servidor: " + mensaje);
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					System.out.println("El servidor ha cerrado la conexión.");
					break;
				}
			}
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
		
	}

}
