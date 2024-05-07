package vista;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import lombok.Getter;

@Getter
public class Interfaz extends JFrame{

	private JTextField txtNombre;
	private JButton btnGuardar;
	
	public Interfaz() {
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		setTitle("Interfaz");
		
		txtNombre = new JTextField();
		txtNombre.setColumns(20);
		getContentPane().add(txtNombre);
		
		btnGuardar = new JButton("Guardar");
		getContentPane().add(btnGuardar);
		
	}
}
