package ejem01_eventos;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class GestorFoco extends FocusAdapter {

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		super.focusGained(e);
		
		e.getComponent().setBackground(java.awt.Color.YELLOW);
		
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		super.focusLost(e);
		e.getComponent().setBackground(java.awt.Color.WHITE);
	}
	
	
}
