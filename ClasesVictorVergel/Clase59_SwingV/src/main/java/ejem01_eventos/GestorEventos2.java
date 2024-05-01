package ejem01_eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GestorEventos2 extends WindowAdapter {
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana cerrando");
	}
}
