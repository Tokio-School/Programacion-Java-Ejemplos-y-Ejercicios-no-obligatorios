package vista;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import lombok.Getter;

@Getter
public class InterfazFormulario extends JFrame{

	
	private JButton btnGuardar;
	private JTextField[] textFields;
	
	public InterfazFormulario() {
		setTitle("Formulario de Persona");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
 
        JPanel panel = new JPanel(new GridLayout(10, 2, 80, 2)); // 10 filas, 2 columnas, espacio horizontal y vertical entre celdas

        
        // Etiquetas
        JLabel[] labels = new JLabel[]{
                new JLabel("Nombre:"),
                new JLabel("Edad:"),
                new JLabel("Altura:"),
                new JLabel("Peso:"),
                new JLabel("Sexo:"),
                new JLabel("Dirección:"),
                new JLabel("Teléfono:"),
                new JLabel("Email:"),
                new JLabel("Profesión:")
        };

        // Campos de texto
        textFields = new JTextField[labels.length];

        for (int i = 0; i < labels.length; i++) {
            panel.add(labels[i]);
            textFields[i] = new JTextField();
            panel.add(textFields[i]);
        }

        // Botón para guardar
        btnGuardar = new JButton("Guardar");
        btnGuardar.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(btnGuardar);
        
        getContentPane().add(panel);
        pack();
        setLocationRelativeTo(null);
	}
}
