package ventanas_dependientes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame ventana = new JFrame("Ventana Principal");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setSize(600, 200);
		ventana.setLocationRelativeTo(null); // Centrar la ventana
		
		
		ventana.getContentPane().setLayout(new BorderLayout());
		JButton boton = new JButton("Abrir Ventana No Dependiente");
		
		boton.addActionListener(actionEvent -> {
			JFrame ventanaDependiente = new JFrame("Ventana Dependiente");
			ventanaDependiente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			ventanaDependiente.setSize(200, 150);
			ventanaDependiente.setLocationRelativeTo(ventana); // Centrar respecto a la ventana principal
			ventanaDependiente.setVisible(true);
		});
		
		ventana.getContentPane().add(boton, BorderLayout.CENTER);
		
		
		JButton boton2 = new JButton("Abrir Ventana Dependiente");
		
		boton.addActionListener(actionEvent -> {
			//JOptionPane.showMessageDialog(ventana, "Esta es una ventana dependiente");
			JDialog ventanaDependiente = new JDialog(ventana, "Ventana Dependiente", true);
			ventanaDependiente.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			ventanaDependiente.setSize(200, 150);
			ventanaDependiente.setLocationRelativeTo(ventana); // Centrar respecto a la ventana principal
			
			JButton botonAceptar = new JButton("Aceptar");
			JButton botonCancelar = new JButton("Cancelar");
			botonAceptar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//JOptionPane.showMessageDialog(ventanaDependiente, "Has hecho clic en Aceptar");
					int opcionElegida=JOptionPane.showConfirmDialog(ventanaDependiente, "Has hecho clic en Aceptar");
					System.out.println(opcionElegida);
					if (opcionElegida == JOptionPane.YES_OPTION) {
						System.out.println("Has elegido Si");
					} else if (opcionElegida == JOptionPane.NO_OPTION) {
						System.out.println("Has elegido No");
					} else if (opcionElegida == JOptionPane.CANCEL_OPTION) {
						System.out.println("Has elegido Cancelar");
					}
					ventanaDependiente.dispose();
				}
			});
			botonCancelar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					//JOptionPane.showMessageDialog(ventanaDependiente, "Has hecho clic en Cancelar");
					String respuesta=JOptionPane.showInputDialog(ventanaDependiente, "Has hecho clic en Cancelar");
					System.out.println(respuesta);
					ventanaDependiente.dispose();
				}
			});
			ventanaDependiente.getContentPane().setLayout(new BorderLayout());
			ventanaDependiente.getContentPane().add(botonAceptar, BorderLayout.WEST);
			ventanaDependiente.getContentPane().add(botonCancelar, BorderLayout.EAST);
			
			
			ventanaDependiente.setVisible(true);
			
			
		});
		
		ventana.getContentPane().add(boton, BorderLayout.CENTER);
		ventana.getContentPane().add(boton2, BorderLayout.SOUTH);
		
		
		JButton botonFichero=new JButton("Abrir Ventana Fichero");
		botonFichero.addActionListener(actionEvent-> {
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Selecciona un archivo");
			fileChooser.setSize(200,200);
			fileChooser.setCurrentDirectory(new java.io.File("."));
			
			
			fileChooser.showOpenDialog(ventana);
			
			File fichero=fileChooser.getSelectedFile();
			if (fichero != null) {
				System.out.println("Has seleccionado el fichero: " + fichero.getAbsolutePath());
			} else {
				System.out.println("No se ha seleccionado ningún fichero.");
			}
			
			
		});
		
		ventana.getContentPane().add(botonFichero, BorderLayout.NORTH);
		
		
		
		JButton botonColores=new JButton("Abrir Ventana Colores");
		botonColores.addActionListener(actionEvent -> {
			Color colorSeleccionado=JColorChooser.showDialog(ventana, "Selecciona un color", Color.RED);
			botonColores.setBackground(colorSeleccionado);
		});
		ventana.getContentPane().add(botonColores, BorderLayout.EAST);
		
		JPanel panelOpciones=new JPanel();
		panelOpciones.setLayout(new BorderLayout());
		String[] opciones={"Opcion 1","Opcion 2","Opcion 3"};
		JList<String> listaOpciones=new JList<String>(opciones);
		
		
		panelOpciones.add(listaOpciones, BorderLayout.CENTER);
		JButton botonOpcion=new JButton("Opcion");
		botonOpcion.addActionListener(actionEvent -> {
			listaOpciones.getSelectedValuesList().forEach(opcion -> {
				System.out.println("Has seleccionado la opción: " + opcion);
			});
		});
		panelOpciones.add(botonOpcion, BorderLayout.SOUTH);
		
		ventana.getContentPane().add(panelOpciones, BorderLayout.WEST);
		
		
		ventana.setVisible(true);
		
		
	}

}
