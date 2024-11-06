import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClienteUDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (DatagramSocket socket = new DatagramSocket();){
			InetAddress address = InetAddress.getByName("localhost");
			
			String mensaje = "Hola mundo";
			byte[] buffer = mensaje.getBytes();
			socket.send(new DatagramPacket(buffer, buffer.length, address, 4444));
			
		} catch (SocketException | UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
