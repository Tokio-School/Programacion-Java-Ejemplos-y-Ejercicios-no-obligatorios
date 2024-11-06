

//ClienteUDPObjetos.java
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClienteUDPObjetos {
 public static void main(String[] args) {
	// String nombre=new Scanner(System.in).nextLine();
	 String nombre="Victor";
     try ( DatagramSocket socket = new DatagramSocket();){
        
         InetAddress address = InetAddress.getByName("localhost");
         
         for (int i = 0; i < 10000; i++) {
             String userInput = "Cliente"+nombre+"Mensaje " + i;
             Mensaje mensaje = new Mensaje(userInput);
             
             ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos);
             oos.writeObject(mensaje);
             oos.flush();
             
             byte[] buffer = baos.toByteArray();
             DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, 12345);
             socket.send(packet);
             
             // Recibir la respuesta (opcional, se puede comentar para enviar más rápido)
             byte[] responseBuffer = new byte[1024];
             DatagramPacket responsePacket = new DatagramPacket(responseBuffer, responseBuffer.length);
             socket.receive(responsePacket);
             
             ByteArrayInputStream bais = new ByteArrayInputStream(responsePacket.getData());
             ObjectInputStream ois = new ObjectInputStream(bais);
             
             Mensaje mensajeRespuesta = (Mensaje) ois.readObject();
             System.out.println("Respuesta del servidor: " + mensajeRespuesta.getContenido());
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}
