import java.util.ArrayList;

import controlador.ControladorInterfaz;
import controlador.ControladorInterfazFormulario;
import modelo.Persona;
import vista.Interfaz;
import vista.InterfazFormulario;

public class AplicacionFormulario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfazFormulario interfaz = new InterfazFormulario();
		interfaz.setVisible(true);
		
		//ArrayList<Persona> personas = new ArrayList<Persona>();
		ControladorInterfazFormulario controlador = new ControladorInterfazFormulario(interfaz);
		
		
	}

}
