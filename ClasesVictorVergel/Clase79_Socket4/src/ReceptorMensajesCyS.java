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
					System.out.println("Mensaje recibido: "+mensaje);
					
					if (mensaje.getMensaje().equalsIgnoreCase("fin")) {
						Servidor.canales_salida.remove(mensaje.getNombre_cliente());
						System.out.println("Se ha eliminado al cliente "+mensaje.getNombre_cliente());
					}
					
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
				System.out.println("Llegó la interrupción del hilo receptor del cliente");
				finalizar = true;
				//e.printStackTrace();
				
			}
		}while(!finalizar);
	}

}
