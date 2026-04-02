import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class Vista extends JFrame {
	
	
	
	
	public DefaultListModel<String> modeloLista=new DefaultListModel<>();
	public JList<String> listaAlumnos=new JList<>(modeloLista);
	public ArrayList<Alumno> alumnos;
	
	public Vista(ArrayList<Alumno> alumnos, Controlador controlador) {
		this.alumnos=alumnos;
		listaAlumnos.setModel(modeloLista);
		listaAlumnos.setVisible(true);
		modeloLista.addAll(alumnos.stream().map(Alumno::toString).toList());
		//modeloLista.addElement("Alumno 1");
		
		
		
		setTitle("Ejemplo MVC");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets.set(5, 5, 5, 5);
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		// Datos del nombre
		gbc.gridx = 0;
		gbc.gridy = 0;
		add(new javax.swing.JLabel("Nombre:"), gbc);
		gbc.gridx = 1;
		add(new javax.swing.JTextField(15), gbc);
		
		
		// Datos de la nota
		gbc.gridx = 0;
		gbc.gridy = 1;
		add(new javax.swing.JLabel("Nota:"), gbc);
		gbc.gridx = 1;
		add(new javax.swing.JTextField(15), gbc);
		
		// Botón para guardar
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		JButton guardarButton = new javax.swing.JButton("Guardar");
		guardarButton.setActionCommand("Guardar");
		add(guardarButton, gbc);
		guardarButton.addActionListener(controlador);
		
		// Lista para mostrar los alumnos
		gbc.gridy=3;
		add(new javax.swing.JScrollPane(listaAlumnos), gbc);
		
		gbc.gridy=4;
		JButton cerrarButton = new javax.swing.JButton("Cerrar");
		cerrarButton.setActionCommand("Cerrar");
		add(cerrarButton, gbc);
		cerrarButton.addActionListener(controlador);
	
		
		addWindowListener(controlador);
		
		
		//Trabajando con la lista
		listaAlumnos.addListSelectionListener(controlador);
		
		
		
		pack();
		setVisible(true);
		
	}

}
