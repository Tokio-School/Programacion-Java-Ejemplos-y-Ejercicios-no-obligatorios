package con_mvc.vista;

import java.awt.BorderLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import con_mvc.controlador.GestorEventos;
import sin_mvc.Persona;

public class InterfazVentana extends JFrame {

	private GestorEventos controlador;
	
	private JTextArea nombre;
	
	
	
	
	/**
	 * @return the nombre
	 */
	public JTextArea getNombre() {
		return nombre;
	}




	/**
	 * @param gestor 
 * @param title
	 * @throws HeadlessException
	 */
	public InterfazVentana(GestorEventos gestorEventos, String nombreVentana) {
		super(nombreVentana);

		this.controlador = gestorEventos;
		
		//JFrame ventana = new JFrame("Ejemplo de JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		setContentPane(panel);
		
		nombre = new JTextArea();
		panel.add(nombre, BorderLayout.NORTH);
		
		JButton boton = new JButton("Guardar");
		panel.add(boton, BorderLayout.SOUTH);
		
		boton.addActionListener(controlador);
		
		
		setLocationRelativeTo(null); 
        setResizable(false);
        setVisible(true);        

		
	}

	
}
