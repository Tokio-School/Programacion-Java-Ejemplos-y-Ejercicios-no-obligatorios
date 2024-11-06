import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServidorUDP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (DatagramSocket socket=new DatagramSocket(4444);){
			byte[] buffer=new byte[1024];
			DatagramPacket packet=new DatagramPacket(buffer,buffer.length);
			socket.receive(packet);
			
			/*ByteArrayInputStream bais=new ByteArrayInputStream(buffer);
			ObjectInputStream ois=new ObjectInputStream(bais);*/
			String mensaje = new String(packet.getData(), 0, packet.getLength());
            System.out.println(mensaje);
			
			//System.out.println(ois.readObject());
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
	}

}
