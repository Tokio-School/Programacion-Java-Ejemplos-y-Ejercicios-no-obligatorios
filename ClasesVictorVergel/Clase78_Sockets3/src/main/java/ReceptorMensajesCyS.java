import java.io.IOException;
import java.io.ObjectInputStream;

public class ReceptorMensajesCyS extends Thread{
	
	private ObjectInputStream ois;
	
	
	public ReceptorMensajesCyS(ObjectInputStream ois) {
		super();
		this.ois = ois;
	}


	public void run() 
	{
		boolean finalizar=false;
		
		do{
			try {
				Mensaje mensaje=(Mensaje)ois.readObject();
				if (mensaje.getNombre_cliente().startsWith("Cliente_"))
				{
					System.out.println("Mensaje recibido: "+mensaje.getMensaje());
					mensaje.setMensaje(mensaje.getMensaje()+" --> del cliente "+mensaje.getNombre_cliente());
					mensaje.setNombre_cliente("Servidor");
					Servidor.enviarMensaje(mensaje);
				}
				else
				{
					System.out.println("Mensaje recibido: " + mensaje);
					if (mensaje.getMensaje().equals("fin")) {
						finalizar = true;
					}
				}
				
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
