import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class AplicacionConWindowBuilder {

	private JFrame frame;
	private JTextField jtfNombre;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplicacionConWindowBuilder window = new AplicacionConWindowBuilder();
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
	public AplicacionConWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 301, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		jtfNombre = new JTextField();
		frame.getContentPane().add(jtfNombre);
		jtfNombre.setColumns(10);

		
		JLabel jbTextoSaludo = new JLabel("New label");
		frame.getContentPane().add(jbTextoSaludo);
		
		
		JButton jbRecuperarNombre = new JButton("Recuperar nombre");
		jbRecuperarNombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre = jtfNombre.getText();
				jbTextoSaludo.setText("Hola " + nombre);
			}
		});
		frame.getContentPane().add(jbRecuperarNombre);
		

	}

}
