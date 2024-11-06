package socket_ssl;

import java.io.ObjectOutputStream;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public class ClientSSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("javax.net.ssl.keyStore", "C:/Users/victor/mykey.jks");
        System.setProperty("javax.net.ssl.keyStorePassword", "victor");
        System.setProperty("javax.net.ssl.trustStore", "C:/Users/victor/mykey.jks");
        System.setProperty("javax.net.ssl.trustStorePassword", "victor");
		
        SSLSocketFactory factory = (SSLSocketFactory) SSLSocketFactory.getDefault();
		try (SSLSocket socket = (SSLSocket) factory.createSocket("localhost", 4444)) {
			System.out.println("Connection established");
			ObjectOutputStream oos=new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject("Hola servidor");
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
