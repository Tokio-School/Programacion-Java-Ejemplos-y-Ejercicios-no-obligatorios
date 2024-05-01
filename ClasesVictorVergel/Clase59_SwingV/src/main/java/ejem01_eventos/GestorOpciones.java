package ejem01_eventos;

import javax.swing.event.ChangeEvent;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;

public class GestorOpciones implements ChangeListener {

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Opción seleccionada. "+((JSpinner)e.getSource()).getValue());
	}

}
