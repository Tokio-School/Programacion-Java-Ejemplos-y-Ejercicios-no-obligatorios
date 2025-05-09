package con_mvc;

import con_mvc.controlador.GestorEventos;
import con_mvc.vista.InterfazVentana;

public class Aplicacion {

	public static void main(String[] args) {
		GestorEventos gestor = new GestorEventos();
		InterfazVentana interfaz = new InterfazVentana(gestor,"Ejemplo de JFrame");
		gestor.setInterfaz(interfaz);

	}

}
