package ejem01_eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

public class GestorRaton extends MouseAdapter {

	JLabel jlPunteroRaton;
	
	public GestorRaton(JLabel jlPunteroRaton) {
		// TODO Auto-generated constructor stub
		this.jlPunteroRaton=jlPunteroRaton;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		super.mouseClicked(e);
		jlPunteroRaton.setText(e.getX()+" "+e.getY());
	}
	
}
