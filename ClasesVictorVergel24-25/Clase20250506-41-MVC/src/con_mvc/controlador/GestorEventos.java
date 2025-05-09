package con_mvc.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import con_mvc.modelo.Persona;
import con_mvc.vista.InterfazVentana;

public class GestorEventos implements ActionListener {

	private InterfazVentana interfaz;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String nombrePersona = interfaz.getNombre().getText();
		Persona persona = new Persona(nombrePersona);
		System.out.println("Nombre guardado: " + persona.nombre());
		
	}

	public void setInterfaz(InterfazVentana interfaz) {
		// TODO Auto-generated method stub
		this.interfaz=interfaz;
	}
	


}
