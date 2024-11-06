

//ServidorUDPObjetos.java
import java.io.*;
import java.net.*;

public class ServidorUDPObjetos {
 public static void main(String[] args) {
     try {
         DatagramSocket socket = new DatagramSocket(12345);
         byte[] buffer = new byte[1024];
         
         System.out.println("Servidor UDP iniciado...");
         
         while (true) {
             DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
             socket.receive(packet);
             
             ByteArrayInputStream bais = new ByteArrayInputStream(packet.getData());
             ObjectInputStream ois = new ObjectInputStream(bais);
             
             Mensaje mensaje = (Mensaje) ois.readObject();
             System.out.println("Mensaje recibido: " + mensaje.getContenido());
             
             String respuesta	 = "Eco: " + mensaje.getContenido();
             Mensaje mensajeRespuesta = new Mensaje(respuesta);
             
             ByteArrayOutputStream baos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(baos);
             oos.writeObject(mensajeRespuesta);
             oos.flush();
             
             byte[] respuestaBytes = baos.toByteArray();
             DatagramPacket responsePacket = new DatagramPacket(respuestaBytes, respuestaBytes.length, packet.getAddress(), packet.getPort());
             socket.send(responsePacket);
         }
     } catch (Exception e) {
         e.printStackTrace();
     }
 }
}

