package ejem02_borderLayout;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Aplicacion {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Mi Aplicación Swing");
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		ventana.setContentPane(panel);
		
		
		ventana.setSize(300, 200);
		ventana.setMinimumSize(new Dimension(200, 150));
		ventana.setMaximumSize(new Dimension(800, 600));
		//ventana.setLocation(100, 100);
		ventana.setLocationRelativeTo(null); // Centra la ventana en la pantalla
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton bAceptar = new JButton("Aceptar");
		bAceptar.setActionCommand("aceptar");
		JButton bCancelar = new JButton("Cancelar");
		bCancelar.setActionCommand("cancelar");
		JButton bOpcion1 = new JButton("Opción 1");
		bOpcion1.setActionCommand("opcion1");
		JButton bOpcion2 = new JButton("Opción 2");
		bOpcion2.setActionCommand("opcion2");
		
		
		JPanel entradaDatos = new JPanel();
		entradaDatos.setLayout(new BorderLayout());
		JLabel etiqueta = new JLabel("Inserte texto:");
		etiqueta.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
		entradaDatos.add(etiqueta,BorderLayout.NORTH);
		JTextArea campoTexto = new JTextArea();
		campoTexto.setLineWrap(true);
		campoTexto.setWrapStyleWord(true);
		campoTexto.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
		entradaDatos.add(campoTexto,BorderLayout.CENTER);
		
		
		
		panel.add(entradaDatos,BorderLayout.CENTER);
		panel.add(bAceptar,BorderLayout.SOUTH);
		panel.add(bCancelar,BorderLayout.NORTH);
		panel.add(bOpcion1,BorderLayout.WEST);
		panel.add(bOpcion2,BorderLayout.EAST);
		
		
/*		bAceptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("¡Botón Aceptar presionado!");
			}
			
		});*/
		ActionListener listener = evento -> 
		{	
			// System.out.println("¡Botón presionado! ->
			// "+((JButton)evento.getSource()).getText());
			switch (evento.getActionCommand()) {
			case "aceptar":
				System.out.println("¡Botón Aceptar presionado!");
				break;
			case "cancelar":
				System.out.println("¡Botón Cancelar presionado!");
				break;
			case "opcion1":
				System.out.println("¡Botón Opción 1 presionado!");
				break;
			case "opcion2":
				System.out.println("¡Botón Opción 2 presionado!");
				break;
			default:
				System.out.println("¡Botón desconocido presionado!");
				break;
			}
			
		};
		bAceptar.addActionListener(listener);
		bCancelar.addActionListener(listener);
		bOpcion1.addActionListener(listener);
		bOpcion2.addActionListener(listener);
		
		
		/*campoTexto.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_0)
					{
					System.out.println("¡Tecla 0 presionada!");
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
		
		});*/
		campoTexto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_0)
					System.out.println("¡Tecla 0 presionada!");
				if (e.getKeyCode()==KeyEvent.VK_UP)
					System.out.println("¡Tecla arriba presionada!");
			}
		});
		
		
		ventana.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentMoved(ComponentEvent e) {
				System.out.println("¡Ventana movida a: "+ventana.getLocation()+"!");
				
			}
		});
		ventana.setVisible(true);

	}

}
