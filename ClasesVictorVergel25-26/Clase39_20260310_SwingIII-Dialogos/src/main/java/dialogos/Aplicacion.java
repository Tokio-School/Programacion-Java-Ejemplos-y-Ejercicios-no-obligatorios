package dialogos;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

public class Aplicacion {

	public static void main(String[] args) {
		JFrame miVentana = new JFrame();
		miVentana.setSize(400, 300);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miVentana.setTitle("Mi primera ventana");
		miVentana.getContentPane().setLayout(new java.awt.FlowLayout());
		miVentana.setLocationRelativeTo(null);
		
		JButton boton = new JButton("JDialog");
		miVentana.getContentPane().add(boton);
		boton.addActionListener(actionEvent -> {
			JDialog dialogo = new JDialog(miVentana, "Mi dialogo", true);
			dialogo.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialogo.setSize(200, 150);
			dialogo.setLocationRelativeTo(miVentana);
			
			JLabel etiqueta = new JLabel("Este es un diálogo personalizado");
			
			JButton botonAceptar = new JButton("Aceptar");
			JButton botonCancelar = new JButton("Cancelar");
			
			botonAceptar.addActionListener(actionEvent1 -> {
				System.out.println("Has pulsado el botón Aceptar");
				dialogo.dispose();
			});
			
			botonCancelar.addActionListener(actionEvent1 -> {
				System.out.println("Has pulsado el botón Cancelar");
				dialogo.dispose();
			});
			
			dialogo.getContentPane().setLayout(new BorderLayout());
			dialogo.getContentPane().add(etiqueta, BorderLayout.CENTER);
			JPanel panelBotones = new JPanel();
			panelBotones.setLayout(new java.awt.FlowLayout());
			
			panelBotones.add(botonAceptar);
			panelBotones.add(botonCancelar);
			dialogo.getContentPane().add(panelBotones, BorderLayout.SOUTH);
			dialogo.setVisible(true);
			
			
			
			
		});
		
		
		
		JButton botonJOptionPane = new JButton("JOptionPane");
		miVentana.getContentPane().add(botonJOptionPane );
		botonJOptionPane.addActionListener(actionEvent ->{
			int resultado = javax.swing.JOptionPane.showConfirmDialog(miVentana, "¿Quieres continuar?", "Confirmación", javax.swing.JOptionPane.YES_NO_OPTION);
			if (resultado == javax.swing.JOptionPane.YES_OPTION) {
				System.out.println("Has pulsado Sí");
			} else if (resultado == javax.swing.JOptionPane.NO_OPTION) {
				System.out.println("Has pulsado No");
			} else if (resultado == javax.swing.JOptionPane.CLOSED_OPTION) {
				System.out.println("Has cerrado el diálogo sin seleccionar una opción");
			}
			
			String nombre = javax.swing.JOptionPane.showInputDialog(miVentana, "¿Cuál es tu nombre?", "Entrada de texto", javax.swing.JOptionPane.QUESTION_MESSAGE);
			if (nombre != null) {
				System.out.println("Tu nombre es: " + nombre);
			} else {
				System.out.println("No has introducido un nombre");
			}
		});
		
		
		JButton botonJFileChooser = new JButton("JFileChooser");
		miVentana.getContentPane().add(botonJFileChooser);
		botonJFileChooser.addActionListener(e-> 
		{
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Selecciona un archivo");
			fileChooser.setSize(200,200);
			fileChooser.setCurrentDirectory(new java.io.File("."));
			fileChooser.showOpenDialog(miVentana);
			
			File ficheroSeleccionado = fileChooser.getSelectedFile();
			if (ficheroSeleccionado != null) {
				System.out.println("Has seleccionado el archivo: " + ficheroSeleccionado.getAbsolutePath());
			} else {
				System.out.println("No has seleccionado ningún archivo");
			}
		});
		
		
		JButton botonColores = new JButton("Diálogo colores");
		miVentana.getContentPane().add(botonColores);
		botonColores.addActionListener(e -> {
			Color colorSeleccionado=JColorChooser.showDialog(miVentana, "Selecciona un color", java.awt.Color.WHITE);
			miVentana.getContentPane().setBackground(colorSeleccionado);
		});
		
		
		JPanel panel=new JPanel();
		panel.setLayout(new BorderLayout());
		String[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
		JList<String> listaOpciones = new JList<>(opciones);
		panel.add(listaOpciones, BorderLayout.CENTER);
		
		JButton botonOpciones = new JButton("Mostrar opciones");
		botonOpciones.addActionListener(e -> {
			List<String> datos=listaOpciones.getSelectedValuesList();
			for(String dato:datos) {
				System.out.println("Has seleccionado: "+dato);
			}
					
		});
		panel.add(botonOpciones, BorderLayout.SOUTH);
		
		miVentana.getContentPane().add(panel);
		
		miVentana.setVisible(true);
		
		
	}

}
