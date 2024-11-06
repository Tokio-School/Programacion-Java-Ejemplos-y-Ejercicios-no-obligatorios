package socket_ssl;

import java.io.IOException;
import java.io.ObjectInputStream;

import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocket;

public class ServerSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("javax.net.ssl.keyStore", "C:/Users/victor/mykey.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "victor");
        System.setProperty("javax.net.ssl.trustStore", "C:/Users/victor/mykey.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "victor");
		
		SSLServerSocketFactory factory = (SSLServerSocketFactory) SSLServerSocketFactory.getDefault();

		try (SSLServerSocket serverSocket = (SSLServerSocket) factory.createServerSocket(4444);){
            while(true){
            	SSLSocket socket = (SSLSocket) serverSocket.accept();
                System.out.println("Connection established");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                String message = (String) ois.readObject();
                System.out.println("mensaje: "+message);
                socket.close();
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
