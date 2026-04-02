package ejem01_flowlayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Aplicacion {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi Aplicación Swing");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		ventana.setContentPane(panel);
		
		ventana.getContentPane().add(new JLabel("¡Hola, Swing!"));
		ventana.setSize(300, 200);
		ventana.setMinimumSize(new Dimension(200, 150));
		ventana.setMaximumSize(new Dimension(800, 600));
		//ventana.setLocation(100, 100);
		ventana.setLocationRelativeTo(null); // Centra la ventana en la pantalla
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (int i = 0; i < 5; i++) {
			ventana.getContentPane().add(new JButton("Haz clic "+i));
		}
		
		
		
		
		ventana.setVisible(true);

	}

}
