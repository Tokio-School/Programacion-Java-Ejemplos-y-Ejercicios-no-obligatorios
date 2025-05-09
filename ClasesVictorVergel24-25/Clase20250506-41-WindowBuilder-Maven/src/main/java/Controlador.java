import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controlador implements ChangeListener{

	private Vista vista;
	
	public Controlador(Vista vista) {
		this.vista = vista;
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if (vista.getJcb_activar() == null) {
			System.out.println("El check está null");
		}else {
			if (vista.getJcb_activar().isSelected()) {
				vista.getJcb_activar().setText("Desactivar");
			} else {
				vista.getJcb_activar().setText("Activar");
			}
			System.out.println("El check está " + (vista.getJcb_activar().isSelected() ? "activado" : "desactivado"));
		}
		
	}

	public void setVista(Vista vista) {
		// TODO Auto-generated method stub
		this.vista = vista;
	}

}
