import java.io.IOException;
import java.io.ObjectInputStream;

public class ClienteReceptor extends Thread{
	
	private ObjectInputStream ois;
	
	
	public ClienteReceptor(ObjectInputStream ois) {
		super();
		System.out.println("Creando el objeto receptor");
		this.ois = ois;
	}


	public void run() 
	{
		System.out.println("Iniciando hilo receptor");
		boolean finalizar=false;
		
		do{
			try {
				System.out.println(ois.readObject());
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}while(!finalizar);
	}

}
