
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Según estaba
		 * Controlador controlador = new Controlador();
		Vista vista = new Vista(controlador,"Hola Mundo");
		controlador.setVista(vista);*/

		Vista vista = new Vista();
		Controlador controlador = new Controlador(vista);
		vista.setControlador(controlador);

	}

}
