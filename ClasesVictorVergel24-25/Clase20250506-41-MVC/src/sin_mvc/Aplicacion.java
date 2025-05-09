package sin_mvc;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Aplicacion {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Ejemplo de JFrame");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(400, 300);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		ventana.setContentPane(panel);
		
		JTextArea nombre = new JTextArea();
		panel.add(nombre, BorderLayout.NORTH);
		
		JButton boton = new JButton("Guardar");
		panel.add(boton, BorderLayout.SOUTH);
		
		boton.addActionListener(e -> {
			String nombrePersona = nombre.getText();
			Persona persona = new Persona(nombrePersona);
			System.out.println("Nombre guardado: " + persona.nombre());
		});
		
		
		ventana.setLocationRelativeTo(null); 
        ventana.setResizable(false);
        ventana.setVisible(true);        
		

	}

}
