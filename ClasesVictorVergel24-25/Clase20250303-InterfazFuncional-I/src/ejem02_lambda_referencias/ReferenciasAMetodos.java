package ejem02_lambda_referencias;

class Utilidades {
	public static void imprimirMensaje() {
		System.out.println("Mensaje desde imprimirMensaje");
	}

	public static void imprimirMensaje(String mensaje) {
		System.out.println("Mensaje desde imprimirMensaje: " + mensaje);
	}

	public void mostrarMensaje(String mensaje) {
		System.out.println("Mensaje desde mostrarMensaje: " + mensaje);
	}
}



public class ReferenciasAMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable=Utilidades::imprimirMensaje;
		runnable.run();
		
		MensajeInterfaz mensajeInterfaz=Utilidades::imprimirMensaje;
		mensajeInterfaz.mostrar("Hola Mundo");
		
		Utilidades utilidades=new Utilidades();
		MensajeInterfaz mensajeInterfaz2=utilidades::mostrarMensaje;
		mensajeInterfaz2.mostrar("hola mundo3");
		
	}

}

@FunctionalInterface
interface MensajeInterfaz {
	void mostrar(String mensaje);
}
