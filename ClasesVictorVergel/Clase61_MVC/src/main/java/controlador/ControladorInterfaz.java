package controlador;

import java.util.ArrayList;

import modelo.Persona;
import vista.Interfaz;

public class ControladorInterfaz {

	Interfaz interfaz;
	ArrayList<Persona> personas;
	
	public ControladorInterfaz(Interfaz interfaz, ArrayList<Persona> personas) {
		// TODO Auto-generated constructor stub
		this.interfaz = interfaz;
		this.personas=personas;
		interfaz.getBtnGuardar().addActionListener(e -> guardar());
	}

	private void guardar() {
		Persona persona = new Persona();
		persona.setNombre(interfaz.getTxtNombre().getText());
		personas.add(persona);
        System.out.println("Guardando ");
        personas.forEach(System.out::println);
        
    }
	
	
}
