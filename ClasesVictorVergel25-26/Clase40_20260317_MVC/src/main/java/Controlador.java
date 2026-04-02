import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// TODO: Auto-generated Javadoc
/**
 * The Class Controlador.
 */
//public class Controlador implements java.awt.event.ActionListener , WindowListener {
public class Controlador extends WindowAdapter implements java.awt.event.ActionListener, ListSelectionListener { 

	/** The alumnos. */
	ArrayList<Alumno> alumnos=null;
	
	/**
	 * Instantiates a new controlador.
	 *
	 * @param alumnos the alumnos
	 */
	public Controlador(ArrayList<Alumno> alumnos) {
		this.alumnos=alumnos;
	}

	
	/**
	 * Action performed. Saltará al pulsar el botón Guardar, pero también al pulsar cualquier otro botón que tenga asignada esta acción. Para diferenciarlo, se puede usar el texto del botón o la acción asociada al botón.
	 *
	 * @param e the e Es el evento que se ha producido al pulsar el botón. Contiene información sobre el origen del evento (el botón que se ha pulsado) y la acción asociada al botón (si se ha definido una).
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Opción 1: Usar el texto del botón para identificarlo
		/*if (((JButton)e.getSource()).getText().equals("Guardar"))
			System.out.println("Botón Guardar presionado");
		else
			System.out.println("Otro botón presionado");*/
		
		// Opción 2: Usar la acción asociada al botón
		if (e.getActionCommand().equals("Guardar"))
			System.out.println("Botón Guardar presionado");
		else
			System.out.println("Otro botón presionado");
		
	}

	/**
	 * Window opened.
	 *
	 * @param e the e
	 */
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	/**
	 * Value changed.
	 *
	 * @param e the e
	 */
	// Pulsación sobre la lista
	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		if (!e.getValueIsAdjusting()) {
			JList<String> source = (JList<String>) e.getSource();
			int index = source.getSelectedIndex();
			if (index >= 0 && index < alumnos.size()) {
				Alumno alumnoSeleccionado = alumnos.get(index);
				System.out.println("Alumno seleccionado: " + alumnoSeleccionado);
			}
		}
		
	}
	
	
	/*@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}*/
}
