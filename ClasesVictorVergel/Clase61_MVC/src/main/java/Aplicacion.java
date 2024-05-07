import java.util.ArrayList;

import controlador.ControladorInterfaz;
import modelo.Persona;
import vista.Interfaz;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaz interfaz = new Interfaz();
		interfaz.setVisible(true);
		
		ArrayList<Persona> personas = new ArrayList<Persona>();
		ControladorInterfaz controlador = new ControladorInterfaz(interfaz,personas);
		
		
		
	}

}
