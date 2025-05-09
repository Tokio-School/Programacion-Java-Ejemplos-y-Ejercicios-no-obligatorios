import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Vista extends JFrame {
	
	private JCheckBox jcb_activar;
	private Controlador controlador;
	
	
	
	/**
	 * @return the jcb_activar
	 */
	public JCheckBox getJcb_activar() {
		return jcb_activar;
	}




	public Vista()
	{
		
		this.controlador = controlador;
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcb_activar = new JCheckBox("Activar/Desactivar");
		//jcb_activar.addChangeListener(controlador);
		jcb_activar.setToolTipText("Activar o desactivar el check");
		jcb_activar.setFont(new Font("Tahoma", Font.BOLD, 14));
		jcb_activar.setSelected(true);
		getContentPane().add(jcb_activar, BorderLayout.NORTH);
		setVisible(true);
	}




	public void setControlador(Controlador controlador2) {
		// TODO Auto-generated method stub
		controlador = controlador2;
		jcb_activar.addChangeListener(controlador);
	}

/*


	public void setActivarGestorEventos() {
		// TODO Auto-generated method stub
		jcb_activar.addChangeListener(controlador);
	}
*/
}
