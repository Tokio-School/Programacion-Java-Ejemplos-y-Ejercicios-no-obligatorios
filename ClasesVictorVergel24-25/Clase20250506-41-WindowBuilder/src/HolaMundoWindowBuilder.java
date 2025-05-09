import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class HolaMundoWindowBuilder {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HolaMundoWindowBuilder window = new HolaMundoWindowBuilder();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HolaMundoWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JCheckBox jcb_activar = new JCheckBox("Activar/Desactivar");
		jcb_activar.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (jcb_activar.isSelected()) {
					jcb_activar.setText("Desactivar");
				} else {
					jcb_activar.setText("Activar");
				}
				System.out.println("El check está " + (jcb_activar.isSelected() ? "activado" : "desactivado"));
			}
		});
		jcb_activar.setToolTipText("Activar o desactivar el check");
		jcb_activar.setFont(new Font("Tahoma", Font.BOLD, 14));
		jcb_activar.setSelected(true);
		frame.getContentPane().add(jcb_activar, BorderLayout.NORTH);
	}

}
